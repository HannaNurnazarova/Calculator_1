package service;

public class OperationFactory {
    public static Operation getOperation(String operator) {
        switch (operator) {
            case "+":
                return new Addition();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            default:
                throw new IllegalArgumentException("Неверный оператор");
        }
    }
}