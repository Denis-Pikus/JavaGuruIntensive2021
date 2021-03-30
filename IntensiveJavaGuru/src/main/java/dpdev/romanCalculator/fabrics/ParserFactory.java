package dpdev.romanCalculator.fabrics;

import dpdev.romanCalculator.number.parser.StringToNumberParserImpl;
import dpdev.romanCalculator.number.parser.Parser;
import dpdev.romanCalculator.number.parser.RomanNumberParserToArabianImpl;

public class ParserFactory {
    private Parser parser;

    public ParserFactory() {
    }

    public Parser getParser(String expression){
        String[] elements = expression.split(" ");
        try{
            Integer.parseInt(elements[0]);
            return parser = new StringToNumberParserImpl();
        } catch (NumberFormatException e){
            return parser = new RomanNumberParserToArabianImpl();
        }
    }
}
