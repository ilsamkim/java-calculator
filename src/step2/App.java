package step2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "";

        Calculator calc = new Calculator();

        while (!str1.equals("exit")) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            boolean canCalculate = true;

            if (num2 == 0 && operator == '/') {
                System.out.println("0으로 나눌 수 없습니다");
                canCalculate = false;
            }

            if (canCalculate) {
                double result = 0;

                switch (operator) {
                    case '+':
                        result = calc.add(num1, num2);
                        break;
                    case '-':
                        result = calc.subtract(num1, num2);
                        break;
                    case '*':
                        result = calc.multiply(num1, num2);
                        break;
                    case '/':
                        result = calc.divide(num1, num2);
                        break;
                    default:
                        System.out.println("잘못된 연산자입니다");
                        break;
                }
                System.out.println("결과: " + result);
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            str1 = sc.next();
        }

        System.out.println("removeFirstList 테스트");
        System.out.println(calc.getNumList());
        calc.removeFirstList();
        System.out.println(calc.getNumList());

    }
}
