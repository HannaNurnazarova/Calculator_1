package Main;
import model.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1.0, 2.0);
        ComplexNumber c2 = new ComplexNumber(1.5, -2.5);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        ComplexNumber sum = c1.add(c2);
        System.out.println("Sum: " + sum);

        ComplexNumber diff = c1.subtract(c2);
        System.out.println("Difference: " + diff);

        ComplexNumber product = c1.multiply(c2);
        System.out.println("Product: " + product);

        try {
            ComplexNumber quotient = c1.divide(c2);
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}