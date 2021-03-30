package dpdev.romanCalculator.bean;

public class Subtraction extends MathOperation{

    public Subtraction() {
        super();
    }

    @Override
    public int calculate(String expression) {
        String[] line = expression.split(" ");
        return Integer.parseInt(line[0]) - Integer.parseInt(line[2]);
    }
}
