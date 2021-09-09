package ru.stud.converter;

public class CelsiusToFahrenheitConverter implements Converter{
    @Override
    public double convert(double x) {
        return x * 9.0 / 5.0 + 32.0;
    }

    @Override
    public String getResult(double x) {
        return "Получено " + x + " градусов Фаренгейта.";
    }
}
