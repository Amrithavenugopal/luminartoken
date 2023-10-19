package oops;

public class Employeemethod {
	int empid;
	int salary;
	String designation;
	public void setvalues(int empid,int salary,String desig)
	{
		this.empid=empid;
		this.salary=salary;
		this.designation=desig;
	}
	
	
	/*public void setvalues(int empid,int sal,String desig)
	{
		empid=empid;
		salary=sal;
		designation=desig;
	}
	*/
	
	public void display()
	{
		System.out.println("empid="+empid);
		System.out.println("salary="+salary);
		System.out.println("designation="+designation);
	}

	
	public static void main(String [] args) {
		Employeemethod emp=new Employeemethod();
		emp.setvalues(20,20000,"designer");
		emp.display();
		
		
		
	}
}
