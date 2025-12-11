/*
Vehicle.java
All properties and methods contained within Parent Class Vehicle
Sudhanya Golla
Created July 17th, 2024
Last Modified July 17th 2024
*/

// Java Setup
import java.util.Random;

public class Vehicle {

    static Random rand = new Random();

    // Set up all properties
    String vehicleMake;
    String vehicleModel;
    int manufactureYear;
    double weight;
    int maximumSpeed;
    int seatingCapacity;

    // Initialize values for all properties within constructor
    public Vehicle(String type, String vehicleMake, String vehicleModel)
    {
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.manufactureYear = rand.nextInt(2004, 2025);

        // Randomize seating capacity, weight, and maximum speed of vehicle based on vehicle type
        // Weight is in pounds, and speed is in miles per hour (mph)
        if (type.equals("Car"))
        {
            this.weight = rand.nextInt(2500, 5001);
            this.maximumSpeed = rand.nextInt(110, 141);
            this.seatingCapacity = rand.nextInt(4,6);
        }
        else if (type.equals("Motorcycle"))
        {
            this.weight = rand.nextInt(400, 801);
            this.maximumSpeed = rand.nextInt(90, 131);
            this.seatingCapacity = rand.nextInt(1,3);
        }
        else
        {
            this.weight = rand.nextInt(4000, 9501);
            this.maximumSpeed = rand.nextInt(70, 111);
            this.seatingCapacity = rand.nextInt(2,4);
        }

    }

    // Output information common to all vehicle types
    public void printGeneralInfo(String type)
    {
        System.out.println(type + "'s make is " + this.vehicleMake + ", and it's model is " + this.vehicleModel);
        System.out.println("It was manufactured in " + this.manufactureYear + ", and its maximum speed is " + this.maximumSpeed + " mph");
        System.out.println("This " + type.toLowerCase() + "'s weight is " + this.weight + " pounds, and it can fit " + this.seatingCapacity + " people.");
    }
    
}
