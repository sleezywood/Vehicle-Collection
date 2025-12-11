/*
Motorcycle.java
All properties and methods contained within Child Class Motorcycle
Sudhanya Golla
Created July 17th, 2024
Last Modified July 17th 2024
*/

// Java Setup
import java.util.Random;

public class Motorcycle extends Vehicle {

    static Random rand = new Random();
    
    // Set up properties unique to child class
    int numWheels = 2;
    String engineMotorcycle;
    int determineEngineMotorcycle;

    // Define values of properties within constructor
    public Motorcycle(String vehicleMake, String vehicleModel)
    {
        super("Motorcycle", vehicleMake, vehicleModel);

        this.determineEngineMotorcycle = rand.nextInt(2);
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;

        // Determine engine type based on value of randomized number
        if (this.determineEngineMotorcycle == 0)
        {
            this.engineMotorcycle = "gasoline";
        }
        else
        {
            this.engineMotorcycle = "electric";
        }
    }

    // Output information about motorcycle
    public void printMotorcycleInfo()
    {
        super.printGeneralInfo("Motorcycle");
        System.out.println("This motorcycle has " + this.numWheels + " wheels. It has a " + this.engineMotorcycle + " engine.");
    }

}