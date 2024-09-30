package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting " + getName() +" HybridCar engine "+ cylinders +" cylinder, "+batterySize+" battery size and "+ avgKmPerLitre+" average Km per Liter.");
    }
}
