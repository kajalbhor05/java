package Inheritance;
class Emp{
	Emp(){
		System.out.println("i am in  Emp class");
		
	}
}
class Students extends Emp{
	int StudId;
	String StudName;
	public Students() {
		
	}
	public Students(int StudId,String StudName) {
		this("Ram",2);
		this.StudId=StudId;
		this.StudName=StudName;
		System.out.println("student id is:"+StudId);
		System.out.println("student name is:"+StudName);
		
	}
	public Students(String StudName,int StudId) {
		this(105);
		this.StudName=StudName;
		this.StudId=StudId;
		System.out.println("student name is:"+StudName);
		System.out.println("Student id is:"+StudId);
		
		
	}
	public Students(int StudId){
		this("ABC");
		this.StudId=StudId;
		System.out.println("student id is:"+StudId);
		
		
	}
	public Students(String StudName) {
		this.StudName=StudName;
		System.out.println("Student name is:"+StudName);
	}
}
public class ThisWithConstructor {

	public static void main(String[] args) {
		Students s1 = new Students();
		

	}

}
