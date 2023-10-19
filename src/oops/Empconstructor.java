package oops;

public class Empconstructor {
	int empid;
	int salary;
	String designation;

	public Empconstructor()
	{
		empid=111;
		salary=20000;
		designation="Tester";
	}

	
	
	public static void main(String[] args) {
		Empconstructor ob=new Empconstructor(); //create object to invoke constructor
		System.out.println(ob.empid);
		System.out.println(ob.salary);
		System.out.println(ob.designation);
		
		

	}

}
