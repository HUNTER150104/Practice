package com.company;

public class Camry extends Car {
    public Camry(String color, String mark, String model, int age) {
        super(color, mark, model, age);
    }

    @Override
    public void print() {
        System.out.println("Цвет машины: " +getColor() + " " + "Марка машины: " + getMark() + " " + "Модель машины: " +getModel() );

    }
}
