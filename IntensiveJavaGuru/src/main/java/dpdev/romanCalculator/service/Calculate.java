package dpdev.romanCalculator.service;

import dpdev.romanCalculator.bean.MathOperation;
import dpdev.romanCalculator.fabrics.ParserFactory;
import dpdev.romanCalculator.number.parser.ArabianNumberParserToRoman;
import dpdev.romanCalculator.number.parser.Parser;
import dpdev.romanCalculator.number.parser.RomanNumberParserToArabianImpl;

public class Calculate {

    public Calculate() {
    }

    public static String calculate(String expression) {
        OperationsContainer operationsContainer = new OperationsContainer();
        ParserFactory parserFactory = new ParserFactory();
        Parser parser = parserFactory.getParser(expression);
        String parseString = parser.parse(expression);
        String[] expressions = parseString.split(" ");
        MathOperation mathOperation = operationsContainer.retrieveMathOperation(expressions[1]);
        if (parser instanceof RomanNumberParserToArabianImpl) {
            ArabianNumberParserToRoman arabianNumberParserToRoman = new ArabianNumberParserToRoman();
            String arabicResult = arabianNumberParserToRoman.arabicToRoman(mathOperation.calculate(parseString));
            return arabicResult;
        } else {
            return String.valueOf(mathOperation.calculate(parseString));
        }
    }
}
