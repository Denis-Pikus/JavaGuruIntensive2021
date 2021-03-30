package dpdev.romanCalculator.service;

import dpdev.romanCalculator.bean.*;

import java.util.HashMap;
import java.util.Map;

public class OperationsContainer {
    private Map<String, MathOperation> commandMap;

    public OperationsContainer() {
        commandMap = new HashMap<>();
        commandMap.put(MathOperationsSymbols.MULT.getOperation(), new Multiply());
        commandMap.put(MathOperationsSymbols.DEV.getOperation(), new Devision());
        commandMap.put(MathOperationsSymbols.ADD.getOperation(), new Addition());
        commandMap.put(MathOperationsSymbols.SUB.getOperation(), new Subtraction());
    }

    public MathOperation retrieveMathOperation(String mathOperationsSymbols) {
        for (RomanNumeral num : RomanNumeral.values()) {
            if (num.equals(mathOperationsSymbols))
                return commandMap.get(mathOperationsSymbols);
        }
        throw  new IllegalArgumentException("You inputted wrong mathematics operation");
    }
}
