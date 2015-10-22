/**
 Description: This is parent class having some abstract methods to enforce behaviour on extending classes
 Author: Aparna Kulkarni
 Date: 17th December 2014
 */
package edu.itu.aparnakulkarni;

public abstract class Vehicle {

	static final int Power_Gas = 1;
	static final int Power_Diesel = 2;
	static final int Power_Electricity = 3;
	static final int Power_Hybrid = 4;
	static final int Power_Hydrogen = 5;
	static final int Power_Human = 6;
	static final int Power_SolarEnergy = 7;
	static final int DefaultPowerSource = Power_Gas;
	boolean isRunning;
	int currentSpeed;
	int fuelLevel = 0;
	int powerSource;

	abstract boolean start();

	abstract void stop();

	abstract boolean accelerate();

	abstract boolean addFuel();

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public int getPowerSource() {
		return powerSource;
	}

	public void setPowerSource(int powerSource) {
		this.powerSource = powerSource;
	}

	public boolean isRunning() {
		return isRunning;
	}

}
