/**
 Description: Car class extends Vehicle class and implements parent class's abstract methods. This class makes use of inheritance 
 Author: Aparna Kulkarni
 Date: 17th December 2014
 */

package edu.itu.aparnakulkarni;

public class Car extends Vehicle {
	private String make;
	private String model;
	private int numberOfDoors;

	public Car(String make, String model, int numberOfDoors) {
		super.setPowerSource(DefaultPowerSource);
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;

	}

	public Car(String make, String model, int numberOfDoors, int powerSource) {
		super.setPowerSource(powerSource);
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;

	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public boolean start() {
		boolean result = false;
		if (fuelLevel < 3) {
			result = false;
		} else if (fuelLevel >= 3) {
			currentSpeed = 50;
			isRunning = true;
			result = true;
		}
		return result;
	}

	public void stop() {
		currentSpeed = 0;
		isRunning = false;
	}

	public boolean addFuel() {
		boolean result = false;
		if (fuelLevel == 100) {
			result = false;
		} else if ((fuelLevel + 20) < 100) {
			fuelLevel = fuelLevel + 20;
			result = true;
		}
		return result;
	}

	public boolean accelerate() {
		boolean result = false;
		if (fuelLevel < 3) {
			result = false;
		}
		if (isRunning == false) {
			result = false;
		}
		if ((currentSpeed + 20) < 200) {
			currentSpeed = currentSpeed + 20;
			result = true;
		}
		return result;

	}

	@Override
	public String toString() {
		return "Car Make: " + make + ", Car Model: " + model
				+ ", Power Source: " + powerSource + ", Running: " + isRunning
				+ ", CurrentSpeed: " + currentSpeed + ", Fuel Level: "
				+ fuelLevel;

	}

}
