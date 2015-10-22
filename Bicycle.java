/**
 Description: Bicycle class extends Vehicle class and overrides Vehicle class methods. This class makes use of inheritance and polymorphism
 Author: Aparna Kulkarni
 Date: 17th December 2014
 */

package edu.itu.aparnakulkarni;

public class Bicycle extends Vehicle {

	private String make;
	private String model;
	private double bikeSize; // in inches
	boolean isPaddleOn = false;

	public Bicycle(String make, String model, int bikeSize) {
		super.setPowerSource(Power_Human);
		this.make = make;
		this.model = model;
		this.bikeSize = bikeSize;

	}

	public boolean isPaddleOn() {
		return isPaddleOn;
	}

	public void setPaddleOn(boolean isPaddleOn) {
		this.isPaddleOn = isPaddleOn;
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

	public double getBikeSize() {
		return bikeSize;
	}

	public void setBikeSize(double bikeSize) {
		this.bikeSize = bikeSize;
	}

	public boolean start() {
		boolean result = false;
		if (isPaddleOn == true) {
			result = true;
			isRunning = true;
		} else {
			result = false;
		}
		return result;
	}

	public void stop() {
		currentSpeed = 0;
		isRunning = false;
	}

	public boolean addFuel() {
		boolean result = false;
		System.out.println("Bike needs human power to ride no fuel needed");
		return result;
	}

	public boolean accelerate() {
		boolean result = false;
		if (isPaddleOn == false) {
			result = false;
		}
		if (isRunning == false) {
			result = false;
		}
		if ((currentSpeed + 4) < 40) {
			currentSpeed = currentSpeed + 4;
			result = true;
		}
		return result;

	}

	@Override
	public String toString() {

		return "Car Make: " + make + ", Car Model: " + model
				+ ", Power Source: " + powerSource + ", Running: " + isRunning
				+ ", CurrentSpeed: " + currentSpeed + ", bikeSize: " + bikeSize;

	}

}
