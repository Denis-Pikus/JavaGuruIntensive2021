package dpdev.romanCalculator.exceptions;

public class ParseException extends IllegalArgumentException {
    public ParseException(String s) {
        super(s);
    }
}
