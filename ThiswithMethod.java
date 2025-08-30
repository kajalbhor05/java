package Inheritance;
class SUM{
	void add() {
			System.out.println("i am in add method");
			this.Sub();
			this.display();
			
	}
	void display() {
		System.out.println("I am in display method");
}
	void Sub()
	{
		System.out.println("I am in sub method");
		this.display();
	}
}
public class ThiswithMethod {
public static void main(String[] args) {
	SUM s1=new SUM();
	s1.add();
}
}
