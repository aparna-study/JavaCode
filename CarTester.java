/**
 Description:This is Tester class and has main method to check status of all the classes which inherits Vehicle class
 Author: Aparna Kulkarni

 */
package edu.itu.aparnakulkarni;

public class CarTester {

	public static void main(String[] args) {
		Car standardCar = new Car("Honda", "Civic EX", 2);
		HybridCar hybrid = new HybridCar("Toyota", "Camry", 4);
		ElectricCar electric = new ElectricCar("Ford", "Volt", 3);
		Bicycle bicycleObject = new Bicycle("Mongoose", "Men's Dolomite", 26);

		System.out.println("##########Testing a default car##########");
		System.out.println(standardCar.toString());
		standardCar.setMake("Ford");
		standardCar.setModel("Tough");
		standardCar.setNumberOfDoors(5);

		System.out.println(standardCar.toString());
		System.out.println("Starting Car...");
		standardCar.start();
		System.out.println("Is car running: " + standardCar.isRunning());
		System.out.println("Adding Fuel...");
		standardCar.addFuel();
		System.out.println("Starting Car...");
		standardCar.start();
		System.out.println(standardCar.toString());
		for (int i = 0; i < 6; i++) {
			standardCar.addFuel();
			System.out.println("Fuel Level: " + standardCar.getFuelLevel());
		}
		for (int i = 0; i < 10; i++) {
			standardCar.accelerate();
			System.out.println("Current Speed: "
					+ standardCar.getCurrentSpeed());
		}
		System.out.println(standardCar.toString());
		System.out.println("Stopping Car...");
		standardCar.stop();
		System.out.println(standardCar.toString());

		System.out.println();

		System.out.println("##########Testing a Bicycle ##########");
		System.out.println(bicycleObject.toString());
		bicycleObject.setMake("Huffy ");
		bicycleObject.setModel("Girls");
		bicycleObject.setBikeSize(5.0);

		System.out.println(bicycleObject.toString());
		System.out.println("Starting Bicycle...");
		bicycleObject.start();
		System.out.println("Is bicycle running: " + bicycleObject.isRunning());
		System.out.println("Adding Fuel...");
		bicycleObject.addFuel();

		System.out.println("Starting Bicycle...");
		bicycleObject.setPaddleOn(true);
		bicycleObject.start();
		System.out.println(bicycleObject.toString());

		System.out.println("Is paddle moving: " + bicycleObject.isPaddleOn);

		for (int i = 0; i < 10; i++) {
			bicycleObject.accelerate();
			System.out.println("Current Speed: " + bicycleObject.getCurrentSpeed());
		}
		System.out.println(bicycleObject.toString());
		System.out.println("BiCycle...");
		bicycleObject.stop();
		System.out.println(bicycleObject.toString());

		System.out.println();

		System.out.println("##########Testing a hybrid car##########");
		System.out.println(hybrid.toString());
		hybrid.setMake("Nissan");
		hybrid.setModel("Leaf");
		hybrid.setNumberOfDoors(2);
		System.out.println(hybrid.toString());
		System.out.println("Starting Hybrid Car...");
		hybrid.start();
		System.out.println("Is car running: " + hybrid.isRunning());
		System.out.println("Adding Fuel...");
		hybrid.addFuel();
		System.out.println("Starting Hybrid Car...");
		hybrid.start();
		System.out.println(hybrid.toString());
		for (int i = 0; i < 10; i++) {
			hybrid.addFuel();
			System.out.println("Fuel Level: " + hybrid.getFuelLevel());
		}
		for (int i = 0; i < 12; i++) {
			hybrid.accelerate();
			System.out.println("Current Speed: " + hybrid.getCurrentSpeed());
		}
		System.out.println(hybrid.toString());
		System.out.println("Stopping Hybrid Car...");
		hybrid.stop();
		System.out.println(hybrid.toString());

		System.out.println();

		System.out.println("##########Testing an eletric car##########");
		System.out.println(electric.toString());
		electric.setMake("Tesla");
		electric.setModel("S");
		electric.setNumberOfDoors(4);
		System.out.println(electric.toString());
		System.out.println("Starting Eletric Car...");
		electric.start();
		System.out.println("Is car running: " + electric.isRunning());
		System.out.println("Adding Fuel...");
		electric.addFuel();
		System.out.println("Starting Electric Car...");
		electric.start();
		System.out.println(electric.toString());
		for (int i = 0; i < 20; i++) {
			electric.addFuel();
			System.out.println("Fuel Level: " + electric.getFuelLevel());
		}
		for (int i = 0; i < 19; i++) {
			electric.accelerate();
			System.out.println("Current Speed: " + electric.getCurrentSpeed());
		}
		System.out.println(electric.toString());
		System.out.println("Stopping Electric Car...");
		electric.stop();
		System.out.println(electric.toString());
	}

}
