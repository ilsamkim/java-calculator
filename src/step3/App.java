package step3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "";

        Calculator<Double> calc = new Calculator<>();

        while (!str1.equals("exit")) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = sc.nextDouble();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operatorChar = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();

            OperatorType operator = OperatorType.fromSymbol(operatorChar);

            if (operator == null) {
                System.out.println("잘못된 연산자입니다");
            } else if (operator == OperatorType.DIVIDE && num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다");
            } else {
                // 정상적인 경우에만 계산 실행
                double result = calc.calculate(num1, num2, operator);
                System.out.println("결과: " + result);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            str1 = sc.next();
        }

        // 조회 기능 테스트
        System.out.println("*** 조회 기능 테스트 ***");
        System.out.println("전체 결과: " + calc.getNumList());
        System.out.println("조회할 기준값을 입력하세요: ");
        double compareNum = sc.nextDouble();
        System.out.println(compareNum + "보다 큰 결과: " + calc.getResultsGreaterThan(compareNum));

        // remove 테스트
        System.out.println("*** removeFirstList 테스트 ***");
        System.out.println("삭제 전 결과: " + calc.getNumList());
        calc.removeFirstList();
        System.out.println("삭제 후 결과: " + calc.getNumList());

    }
}
