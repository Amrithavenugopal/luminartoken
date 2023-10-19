package Exam;
interface principle
{
	void resign();
	void rejoin();
}
class student
{
	public void mark()
	{
		System.out.println("marks are here");
	}
	public void details()
	{
		System.out.println("details are here");
	}
}
class teacher extends student implements principle
{

	public void department()
	{
		System.out.println("this is department");
	}
	
	@Override
	public void resign() {
		System.out.println("resign method");
		
	}

	@Override
	public void rejoin() {
		System.out.println("rejoin methods");
		
	}
}


public class Studentdetails {

	public static void main(String[] args) {
		teacher m=new teacher();
	m.rejoin();
	m.resign();
	m.department();
	m.mark();
	m.details();
	}

}
