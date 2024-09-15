import domain.Operation;
import service.CalculatorService;
import service.impl.CalculatorServiceImpl;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("This is a calculator program");

        Scanner input = new Scanner(System.in);
        CalculatorService calculatorService = new CalculatorServiceImpl();

        while (true) {
            try {
                System.out.println("Please input first number");
                float firstNumber = input.nextFloat();

                System.out.println("Please input one of the following operations: +, -, *, /");
                Operation operation = Operation.getOperation(input.next().charAt(0));

                System.out.println("Please input second number");
                float secondNumber = input.nextFloat();

                Float result = calculatorService.doMath(firstNumber, secondNumber, operation);
                System.out.printf("%f %s %f = %f%n", firstNumber, operation.getOperator(), secondNumber, result);
            } catch (Exception e) {
                System.out.println("Wrong input format, try again");
                if (e.getMessage() != null) {
                    System.out.println(e.getMessage());
                }
                input.next();
            }
        }
    }
}
