package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        CarSkeleton tesla= new ElectricCar("tesla","arabaa",5,10);
        CarSkeleton lada=new GasPoweredCar("Lada","Test",8,2);
        CarSkeleton honda=new HybridCar("Honda","test",2,6,4);
        honda.startEngine();
        honda.drive();
        lada.startEngine();
        lada.drive();
        tesla.startEngine();
        tesla.drive();

    }
}