package oops;
interface Bank1
{
	void deposit();
	void withdraw();
}
interface Bank2
{
	void intrestrate();
	void balancedetails();
}
class SBI implements Bank1,Bank2
{

	@Override
	public void intrestrate() {
		System.out.println("intrestrates details");
		
	}

	@Override
	public void balancedetails() {
		System.out.println("balancedetails");
		
	}

	@Override
	public void deposit() {
  System.out.println("deposit details");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw details");
		
	}
	
	
}

public class Multipleinterface {

	public static void main(String[] args) {
	
		SBI ob=new SBI();
		ob.balancedetails();
		ob.intrestrate();
		ob.deposit();
		ob.withdraw();
		

	}

}
