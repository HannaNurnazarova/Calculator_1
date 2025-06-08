package service;

import model.ComplexNumber;

public interface Operation {
    ComplexNumber execute(ComplexNumber a, ComplexNumber b);
}