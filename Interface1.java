package Demo;

interface Animal{
	void makesound();
	void sleep();
}

class Cat implements Animal{
	 public void makesound() {
		System.out.println("meow meow");
	}
	 public void sleep() {
		 System.out.println("the cat is sleeping...");
	 }
}
class Dog implements Animal{
	public void makesound() {
	System.out.println("woof !")	;
	}
	public void sleep() {
		System.out.println("dog is sleeping");
	}
}

public class Interface1{
	public static void main(String[] args) {
		 
		Animal cat=new Cat();
		Animal dog=new Dog();
		
		cat.makesound();
		cat.sleep();
		
		dog.makesound();
		dog.sleep();
	}
}