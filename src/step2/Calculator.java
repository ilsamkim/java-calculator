package step2;

public class Calculator {
    int num1;
    int num2;
    char operator;

    public Calculator(int num1, int num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    int add(){
        return num1 + num2;
    }
    int subtract(){
        return num1 - num2;
    }
    int multiply(){
        return num1 * num2;
    }
    double divide(){
        return (double) num1 / num2;
    }

}
