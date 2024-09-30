package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        wheels=4;
        engine=true;

    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Car{name='" + name + "', cylinders=" + cylinders + ", wheels=" + wheels + ", engine=" + engine + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";

    }

    public String accelerate(){
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";

    }

    public String brake(){
        System.out.println(getClass().getSimpleName());
        return "the car is braking";

    }
}
