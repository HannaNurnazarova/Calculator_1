package service;

import model.ComplexNumber;

public class Division implements Operation {
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        double denom = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        if (denom == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denom;
        double imag = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denom;
        return new ComplexNumber(real, imag);
    }
}