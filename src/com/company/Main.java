package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //    Camry camry = new Camry("Красный", "BMW", "е39",2021 );
//camry.print();

createObject("BMW").print();
createObject("Camry").print();
createObject("Mercedes").print();
        }


    public static Car createObject(String className) {
        Car car = null;
switch (className){
    case "BMW":
        car = new Bmw("Черный ", "BMW","e39",2021);
        break;
    case "Camry":
        car = new Camry("Красный ", "Camry","45",2010);
        break;
    case "Mercedes":
        car = new Mercedes("Белый ", "Mercedes","c class",2019);
        break;
}
return car;
    }
}


