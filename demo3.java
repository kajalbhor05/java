
package Inheritance;
class Cars{
	int CarNo=4050;
	int CarSpeed=50;
	String CarColor="Red";
	void display() {
		System.out.println("Car color is:"+CarColor);
		System.out.println("Car number is:"+CarNo);
		System.out.println("Car speed is:"+CarSpeed+"km/hr");
		
	}
}
class Bolero extends Cars{
	void display1(){
		System.out.println("i am Bolero");
	}
}
class Fortuner extends Bolero{
	
}
public class demo3 {
	public static void main(String[] args) {
		Fortuner f1=new Fortuner();
		f1.display();
		f1.display1();
	}
	

}
