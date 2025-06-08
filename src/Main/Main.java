package Main;

import model.ComplexNumber;
import Calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1.0, 2.0);
        ComplexNumber c2 = new ComplexNumber(1.5, -2.5);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        Calculator calculator = new Calculator();

        ComplexNumber sum = calculator.calculate(c1, c2, "+");
        System.out.println("Sum: " + sum);


        ComplexNumber product = calculator.calculate(c1, c2, "*");
        System.out.println("Product: " + product);

        try {
            ComplexNumber quotient = calculator.calculate(c1, c2, "/");
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); 
        }
    }
}
