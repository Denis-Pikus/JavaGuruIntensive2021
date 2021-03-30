package dpdev.romanCalculator.number.parser;

import dpdev.romanCalculator.bean.RomanNumeral;
import dpdev.romanCalculator.exceptions.ParseException;

import java.util.List;

public class RomanNumberParserToArabianImpl implements Parser {

    public RomanNumberParserToArabianImpl() {

    }

    @Override
    public String parse(String expression) {
        String[] strArray = expression.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArray.length; i++) {
            if (i == 0 || i % 2 == 0) {
                sb.append(String.valueOf(romanToArabic(strArray[i])));
            }
            else {
                sb.append(" " + strArray[i] + " ");
            }
        }
        return sb.toString();
    }

    public String romanToArabic(String input) {
        String romanNumeral = input.toUpperCase();
        int result = 0;
        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();
        int i = 0;
        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }
        if (romanNumeral.length() > 0) {
            throw new ParseException("You entered an invalid math expression!");
        }
        return String.valueOf(result);
    }
}
