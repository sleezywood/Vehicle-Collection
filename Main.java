/*
Main.java
Create a Vehicle Simulator
Sudhanya Golla
Created July 17th, 2024
Last Modified July 17th 2024
*/

// Java Setup
import java.util.*;

class Main {
	static Scanner in = new Scanner(System.in);
	static Random rand = new Random();

	// Main program
	public static void main(String[] args) {
        
        int numVehicles = 0;
        boolean validNum = false;
        boolean validLetter = false;
        String vehicleType = ""; 

        // Make sure inputted number is valid
        while (validNum == false)
        {
            // Gather number of vehicles
            System.out.println("Enter the amount of vehicles you want to input: ");
            numVehicles = in.nextInt();

            // Validate inputted number
            if (numVehicles < 0)
            {
                System.out.println("Cannot have less than 0 vehicles");
            }
            else
            {
                validNum = true;
            }
        }

        // Create storage for all vehicles
        Vehicle [] arrayVehicle = new Vehicle[numVehicles];
        in.nextLine();

        // Enter information for each vehicle for as many as user enters
        for (int index = 0; index < numVehicles; index++)
        {

            // Make sure user input is valid
            while (validLetter == false)
            {
                // Gather type of vehicle
                System.out.println("Which vehicle do you want to choose?\n(C) for Car\n(T) for Truck\n(M) for Motorcycle");
                vehicleType = in.nextLine().toUpperCase().trim();
    
                // Validate user input
                if (vehicleType.equals("C") || vehicleType.equals("M") || vehicleType.equals("T"))
                {
                    validLetter = true;
                }
                else
                {
                    System.out.println("Enter a proper letter");
                }
            }

            // Gather make and model of each type
            System.out.println("Enter make of vehicle: ");
            String vehicleMake = in.nextLine();
            System.out.println("Enter model of vehicle: ");
            String vehicleModel = in.nextLine();

            // Output information depending on type of vehicle
            // Store vehicle within array
            if (vehicleType.equals("C"))
            {
                validLetter = true;
                Car car = new Car(vehicleMake, vehicleModel);
                arrayVehicle[index] = car;
                car.printCarInfo();
            }
            else if (vehicleType.equals("T"))
            {
                validLetter = true;
                Truck truck = new Truck(vehicleMake, vehicleModel);
                arrayVehicle[index] = truck;
                truck.printTruckInfo();
            }
            else if (vehicleType.equals("M"))
            {
                validLetter = true;
                Motorcycle motorcycle = new Motorcycle(vehicleMake, vehicleModel);
                arrayVehicle[index] = motorcycle;
                motorcycle.printMotorcycleInfo();
            }
            else
            {
                System.out.println("Enter a proper letter");
            }

            // Reset validation to validate user input each time
            validLetter = false;

        }
    }
}