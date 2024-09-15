package domain;

public enum Operation {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    ;

    private final char operator;

    Operation(char operator) {
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }

    public static Operation getOperation(char operator) {
        Operation foundOperation = null;
        for (Operation operation : Operation.values()) {
            if (operation.getOperator() == operator) {
                foundOperation = operation;
            }
        }
        if (foundOperation == null) {
            throw new IllegalArgumentException("Wrong operator input");
        }
        return foundOperation;
    }
}
