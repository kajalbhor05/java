package Sid1;
import java.util.Scanner;

public class Kaju {
int age=19;
int rollno=12;
String course="bcs";
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter your name");
String k=sc.next();
Kaju a=new Kaju();
System.out.println("age is:"+a.age);
System.out.println("roll no:"+a.rollno);
System.out.println("course:"+a.course);
}
}
