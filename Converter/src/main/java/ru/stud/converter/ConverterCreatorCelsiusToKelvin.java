package ru.stud.converter;

public class ConverterCreatorCelsiusToKelvin extends ConverterCreator{
    @Override
    public Converter create(){ return new CelsiusToKelvinConverter();}
}
