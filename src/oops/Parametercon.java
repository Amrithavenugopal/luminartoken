package oops;

public class Parametercon {

	int empid;
	int salary;
	String designation;
	public Parametercon (int id,int sal,String desig) {
		empid=id;
		salary=sal;
		designation=desig;
		
	}
	public static void main(String[] args) {
		
        Parametercon ob1=new Parametercon(112,30000,"Developer");
        System.out.println(ob1.empid);
        System.out.println(ob1.salary);
        System.out.println(ob1.designation);
	}

}
