package Demo;

interface  Payment{ 
	
	 void pay(double amount);
	 void  refund(double amount);
}
	class CreditCardPayment implements Payment{
		
		public void pay(double amount ) {
			System.out.println("pay amount using credit card"+amount);
		}
		public  void refund(double amount) {
			System.out.println("refund amount to  Cedit Card"+amount);
		
		}
	}

class UPIPayment implements Payment{
public 	void pay(double amount ) {
		System.out.println("pay amount using UPI");
	}
		 public void refund(double amount) {
			 System.out.println("refund  amount using UPI");
}
}

public class InterfacePayment {
public static void main(String[] args) {
	Payment p1=new CreditCardPayment();
	p1.pay(1000);
	p1.refund(200);
	Payment p2=new UPIPayment();
	p2.pay(2000);
	p2.refund(2000);
	

}
}
