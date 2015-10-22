/**
 Description: SolarCar class extends Car class and overrides Car class methods. This class makes use of inheritance and polymorphism
 Author: Aparna Kulkarni
 Date: 17th December 2014
 */

package edu.itu.aparnakulkarni;

public class SolarCar extends Car {

	boolean batteryCharged = false;
	int batteryLevel;

	public SolarCar(String make, String model, int numberOfDoors) {
		super(make, model, numberOfDoors);
		setPowerSource(Power_SolarEnergy);

	}

	public boolean chrgeBattery() {
		boolean result = false;
		if (batteryLevel == 100) {
			result = false;
		}
		if ((batteryLevel + 10) < 100) {
			batteryLevel = batteryLevel + 10;
			result = true;
		}
		return result;
	}

	public boolean accelerate() {
		boolean result = false;
		if (batteryLevel < 20) {
			result = false;
		}
		if (isRunning == false) {
			result = false;
		}
		if ((currentSpeed + 15) < 80) {
			currentSpeed = currentSpeed + 15;
			result = true;
		}
		return result;
	}

}
