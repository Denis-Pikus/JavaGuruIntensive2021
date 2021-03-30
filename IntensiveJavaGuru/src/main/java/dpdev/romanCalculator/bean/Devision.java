package dpdev.romanCalculator.bean;

public class Devision extends MathOperation{

    public Devision() {
        super();
    }

    @Override
    public int calculate(String expression) {
        String[] line = expression.split(" ");
        return (int) Integer.parseInt(line[0]) / Integer.parseInt(line[2]);
    }
}
