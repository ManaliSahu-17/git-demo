package com.git_demo.git_demo;
import java.util.*;
public class VehicleMain {
	
	static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine(); 
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the the choice 1 for car 2 for motorcycle");
		int n = sc.nextInt();
		
		if(n==1) {
			Vehicle myCar = new Car();
			vehicleTestDrive(myCar); 
		}
		else if(n==2) {
			Vehicle myMotorcycle = new Motorcycle();
	        vehicleTestDrive(myMotorcycle); 
			
		}
		else {
			System.out.println("oops!!! Wrong choice");
		}
		
		
        

	}

}

class Vehicle{
	public void startEngine() {
		System.out.println("Start the vehicle's engine");
		
	}
}

class Car extends Vehicle {
	
	public void startEngine() {
	System.out.println("Car engine started with a key.");
	
}
}

class Motorcycle extends Vehicle{
	public void startEngine() {
		System.out.println("Bike's engine started with a key, kick, self start");
	}
	
}
