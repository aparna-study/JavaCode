/**
 Description:
 Author: Aparna Kulkarni
 Date: 17th December 2014
 */

package edu.itu.aparnakulkarni;

public class ElectricCar extends Car {

	public ElectricCar(String make, String model, int numberOfDoors) {
		super(make, model, numberOfDoors);
		setPowerSource(Power_Electricity);

	}

	public boolean start() {
		boolean result = false;
		if (fuelLevel < 1) {
			result = false;
		} else {
			currentSpeed = currentSpeed + 30;
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
		}
		if (fuelLevel + 5 < 100) {
			fuelLevel = fuelLevel + 5;
			result = true;
		}
		return result;
	}

	public boolean accelerate() {
		boolean result = false;
		if (fuelLevel < 1) {
			result = false;
		}
		if (isRunning == false) {
			result = false;
		}
		if ((currentSpeed + 5) < 120) {
			currentSpeed = currentSpeed + 5;
			result = true;
		}
		return result;
	}

	// Hybrid Car Make: Toyota, Care Model: Camry, Power Source: 4, Running:
	// false, CurrentSpeed: 0, Fuel Level: 0

	@Override
	public String toString() {
		return "Car Make: " + getMake() + ", Car Model: " + getModel()
				+ ", Power Source: " + getPowerSource() + ", Running: "
				+ isRunning + ", CurrentSpeed: " + currentSpeed
				+ ", Fuel Level: " + fuelLevel;

	}

}
