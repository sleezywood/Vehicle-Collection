/*
Truck.java
All properties and methods contained within Child Class Truck
Sudhanya Golla
Created July 17th, 2024
Last Modified July 17th 2024
*/

// Java Setup
import java.util.Random;

public class Truck extends Vehicle{

    static Random rand = new Random();

    // Set up all properties unique to child class
    double cargoCapacity;
    String engineTruck;
    int towingCapacity;
    int determineEngineTruck;

    // Set up values for each property within constructor
    public Truck(String vehicleMake, String vehicleModel)
    {
        super("Truck", vehicleMake, vehicleModel);

        this.cargoCapacity = rand.nextInt(1, 21);
        this.determineEngineTruck = rand.nextInt(2);
        this.towingCapacity = rand.nextInt(1, 6);
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;

        // Determine type of engine based on value of randomized number
        if (this.determineEngineTruck == 0)
        {
            this.engineTruck = "gasoline";
        }
        else
        {
            this.engineTruck = "diesel";
        }
    }

    // Output information unique to truck
    public void printTruckInfo()
    {
        super.printGeneralInfo("Truck");
        System.out.println("This truck has a cargo capacity of " + this.cargoCapacity + " tonnes. It has a towing capacity of " + this.towingCapacity + " tonnes. It has a " + this.engineTruck + " engine.");
    }
    
}
