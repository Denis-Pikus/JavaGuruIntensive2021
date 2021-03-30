package dpdev.romanCalculator.number.parser;

import dpdev.romanCalculator.bean.RomanNumeral;
import dpdev.romanCalculator.exceptions.ParseException;

import java.util.List;

public class ArabianNumberParserToRoman {
    private int number;

    public ArabianNumberParserToRoman() {
    }

    public String arabicToRoman(int number) {
        if (number > 100) {
            throw new ParseException("You entered an invalid math expression!");
        }
        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();
        int i = 0;
        int absNumber = Math.abs(number);
        StringBuilder sb = new StringBuilder();
        if (number < 0){
            sb.append("-");
        }
        while ((absNumber > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= absNumber) {
                sb.append(currentSymbol.name());
                absNumber -= currentSymbol.getValue();
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}