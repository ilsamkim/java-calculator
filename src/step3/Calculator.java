package step3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Calculator<T extends Number> {

    // 계산 결과를 저장하는 리스트
    private ArrayList<Double> numList = new ArrayList<>();

    // 두 숫자를 받아 연산을 수행하고 결과를 저장
    public double calculate(T num1, T num2, OperatorType operator) {
        double result = 0;

        // 제네릭 타입을 double로 변환
        double n1 = num1.doubleValue();
        double n2 = num2.doubleValue();

        // 연산자에 따라 계산 수행
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

    // 지정된 값보다 큰 결과만 필터링해서 변환
    public ArrayList<Double> getResultsGreaterThan(double value) {
        return numList.stream()
                .filter(result -> result > value)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // getter
    public ArrayList<Double> getNumList() {
        return numList;
    }

    // setter
    public void setNumList(ArrayList<Double> numList) {
        this.numList = numList;
    }

    // 가장 오래된 결과 삭제
    public void removeFirstList() {
        numList.remove(0);
    }

}
