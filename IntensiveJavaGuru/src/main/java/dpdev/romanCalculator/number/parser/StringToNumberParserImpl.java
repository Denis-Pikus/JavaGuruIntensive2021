package dpdev.romanCalculator.number.parser;

import dpdev.romanCalculator.exceptions.ParseException;

public class StringToNumberParserImpl implements Parser{

    public StringToNumberParserImpl() {

    }

    @Override
    public String parse(String expression) {
        char[] chars = expression.toCharArray();
        if (Character.isDigit(chars[0]))
            return expression;
        else {
            throw new ParseException("Illegal argument!");
        }
    }
}
