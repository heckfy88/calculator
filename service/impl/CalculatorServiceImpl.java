package service.impl;

import service.CalculatorService;
import domain.Operation;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Float doMath(float firstNumber, float secondNumber, Operation operation) {
        Float result = null;
        switch (operation) {
            case ADD -> result = firstNumber + secondNumber;
            case SUBTRACT -> result = firstNumber - secondNumber;
            case MULTIPLY -> result = firstNumber * secondNumber;
            case DIVIDE -> {
                if (secondNumber == 0) {
                    System.out.println("Division by zero is not a proper operation");
                }
                // returns Infinity, which I found appropriate
                result = firstNumber / secondNumber;
            }
        }
        return result;
    }
}
