package step3;

public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    // 각 enum에 기호를 할당하는 생성자
    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    // 입력받은 기호에 해당하는 OperatorType을 반환
    public static OperatorType fromSymbol(char symbol) {
        for (OperatorType type : OperatorType.values()) {
            if (type.symbol == symbol) {
                return type;
            }
        }
        return null; // 일치하는 기호가 없으면 null 반환
    }

    // getter
    public char getSymbol() {
        return symbol;
    }
}
