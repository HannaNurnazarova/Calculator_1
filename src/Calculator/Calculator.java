package Calculator;

import model.ComplexNumber;

public class Calculator {


    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b, String operation) {
        switch (operation) {
            case "+":
                return a.add(b);
            case "*":
                return a.multiply(b);
            case "/":
                return a.divide(b);
            default:
                throw new IllegalArgumentException("Недопустимая операция: " + operation);
        }
    }
}