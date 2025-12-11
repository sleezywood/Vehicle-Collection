/*
Car.java
All properties and methods contained within Child Class Car
Sudhanya Golla
Created July 17th, 2024
Last Modified July 17th 2024
*/

// Java Setup
import java.util.Random;

public class Car extends Vehicle {

    static Random rand = new Random();

    // Set up all properties unique to child class
    int door;
    String engineCar;
    int determineEngineCar;

    // Initialize all values for properties within constructor
    public Car(String vehicleMake, String vehicleModel)
    {
        super("Car", vehicleMake, vehicleModel);

        this.door = (rand.nextInt(1, 3)) * 2;
        this.determineEngineCar = rand.nextInt(2);
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;

        // Randomize engine type based on value of certain number
        if (this.determineEngineCar == 0)
        {
            this.engineCar = "gasoline";
        }
        else
        {
            this.engineCar = "electric";
        }
    }

    // Output information of car
    public void printCarInfo()
    {
        super.printGeneralInfo("Car");
        System.out.println("The car has " + this.door + " doors. It has an " + this.engineCar + " engine.");
    }

    
}
