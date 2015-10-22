/**
 Description: HydrogenCar class extends Car class and sets power source of vehicle class in it's constructor. 
 Author: Aparna Kulkarni
 Date: 17th December 2014
 */

package edu.itu.aparnakulkarni;

public class HydrogenCar extends Car {

	// TODO Auto-generated constructor stub

	public HydrogenCar(String make, String model, int numberOfDoors) {
		super(make, model, numberOfDoors);
		setPowerSource(Power_Hydrogen);

	}

}
