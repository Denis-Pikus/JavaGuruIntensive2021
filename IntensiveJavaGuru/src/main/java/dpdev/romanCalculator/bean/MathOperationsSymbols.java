package dpdev.romanCalculator.bean;

public enum MathOperationsSymbols {
    MULT("*"),
    DEV("/"),
    ADD("+"),
    SUB("-");

    private final String operation;

    MathOperationsSymbols(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
}
