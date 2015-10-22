/**
 Description: HybridCar class extends Car class and overrides Car class methods. This class makes use of inheritance and polymorphism
 Author: Aparna Kulkarni
 Date: 17th December 2014
 */
package edu.itu.aparnakulkarni;

public class HybridCar extends Car {

	public HybridCar(String make, String model, int numberOfDoors) {
		super(make, model, numberOfDoors);
		setPowerSource(Power_Hybrid);

	}

	public boolean start() {
		boolean result = false;
		if (fuelLevel < 2) {
			result = false;
		} else {
			currentSpeed = 40;
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
		if ((fuelLevel + 10) < 100) {
			fuelLevel = fuelLevel + 10;
			result = true;
		}
		return result;
	}

	public boolean accelerate() {
		boolean result = false;
		if (fuelLevel < 2) {
			result = false;
		}
		if (isRunning == false) {
			result = false;
		}
		if ((currentSpeed + 10) < 150) {
			currentSpeed = currentSpeed + 10;
			result = true;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Car Make: " + getMake() + ", Car Model: " + getModel()
				+ ", Power Source: " + getPowerSource() + ", Running: "
				+ isRunning + ", CurrentSpeed: " + currentSpeed
				+ ", Fuel Level: " + fuelLevel;

	}
}
