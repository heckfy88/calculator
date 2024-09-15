package service;

import domain.Operation;

public interface CalculatorService {
    Float doMath(float firstNumber, float secondNumber, Operation operation);
}
