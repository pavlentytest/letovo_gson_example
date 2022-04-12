package ru.samsung.itschool.mdev;

import com.google.gson.Gson;

class Car {
    private String name;
    private int power;

    public Car(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
}

public class Main {

    public static void main(String[] args) {
	    Car car = new Car("BMW",150);
        // GSON - Google Script Object Notation

        Gson gson = new Gson();

        String car_string = gson.toJson(car);
        System.out.println(car_string); // {"name":"BMW","power":150} - сериализация

        String bmw = "{\"name\":\"Toyta\",\"power\":170}";
        Car bmw_object = gson.fromJson(bmw,Car.class); // десериализация
        System.out.println(bmw_object.getName());
        System.out.println(bmw_object.getPower());


    }
}
