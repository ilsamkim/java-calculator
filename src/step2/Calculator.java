package step2;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Double> numList = new ArrayList<>();

    public int add(int num1, int num2) {
        int result = num1 + num2;
        numList.add((double) result);
        return result;
    }

    public int subtract(int num1, int num2) {
        int result = num1 - num2;
        numList.add((double) result);
        return result;
    }

    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        numList.add((double) result);
        return result;
    }

    public double divide(int num1, int num2) {
        double result = (double) num1 / num2;
        numList.add(result);
        return result;
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
