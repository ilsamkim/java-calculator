package step3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Calculator<T extends Number> {

    private ArrayList<Double> numList = new ArrayList<>();

    public double calculate(T num1, T num2, OperatorType operator) {
        double result = 0;

        double n1 = num1.doubleValue();
        double n2 = num2.doubleValue();

        switch (operator) {
            case PLUS:
                result = n1 + n2;
                break;
            case MINUS:
                result = n1 - n2;
                break;
            case MULTIPLY:
                result = n1 * n2;
                break;
            case DIVIDE:
                result = n1 / n2;
                break;
        }
        numList.add(result);
        return result;
    }

    public ArrayList<Double> getResultsGreaterThan(double value) {
        return numList.stream()
                .filter(result -> result > value)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Double> getNumList() {
        return numList;
    }

    public void setNumList(ArrayList<Double> numList) {
        this.numList = numList;
    }

    public void removeFirstList() {
        numList.remove(0);
    }

}
