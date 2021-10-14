package com.company;

public abstract class Car implements Printable{
    String color, mark, model;
    int age;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car(String color, String mark, String model, int age) {
        this.color = color;
        this.mark = mark;
        this.model = model;
        this.age = age;
    }
}
