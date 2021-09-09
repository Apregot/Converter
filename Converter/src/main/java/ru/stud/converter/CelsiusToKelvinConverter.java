package ru.stud.converter;

public class CelsiusToKelvinConverter implements Converter {

    @Override
    public double convert(double x) {
        return x + 273.15;
    }

    @Override
    public String getResult(double x) {
        return "Получено " + x + " градусов Кельвина.";
    }
}
