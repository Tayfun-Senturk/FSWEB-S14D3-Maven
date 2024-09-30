package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void startEngine(){
        System.out.println(getClass().getSimpleName()+ " engine is starting");
    }
    public void drive(){
        runEngine();
        System.out.println(getClass().getSimpleName()+ " is driving");
    }
    protected void runEngine(){
        System.out.println(getClass().getSimpleName()+ " engine is running");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
