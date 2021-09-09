package ru.stud.converter;

public class ConverterCreatorCelsiusToFahrenheit extends ConverterCreator {
    @Override
    public Converter create(){ return new CelsiusToFahrenheitConverter();}
}
