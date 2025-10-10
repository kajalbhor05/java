package Demo;

abstract class Vehicle {
	
	abstract void start();
	abstract void stop();
	
	void fueltype() {
		System.out.println("different vehicles use different fuel");
	}
}
	class Car extends Vehicle{
		void start() {
			System.out.println("Car is start now...");
	}
		void stop() {
			System.out.println("Car is stop now.....");
		}
	}
	class Bike extends Vehicle{
		void start() {
			System.out.println("Bike is start now...");
		}
		void stop() {
			System.out.println("Bike is stop now...");
		}
	}
public class AbstractVehicle{
	
	public static void main(String[]  args) {
   Vehicle v1=new Car();
   v1.start();
   v1.stop();
   v1.fueltype();
   Vehicle v2=new Bike();
   v2.start();
   v2.stop();
   v2.fueltype();
   
}
}