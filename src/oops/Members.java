package oops;
class Memberdetails {
	String name,address;
	int age,salary;
	public void printdetails() {
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
	}
   }
	class Workers extends Memberdetails
	{
			String specialization;
			
		}
	
	class Managers extends Memberdetails
	{
		String department;
		
	}
	
	public class Members {
	public static void main(String[] args) {
		Workers ob=new Workers();
		ob.name="karthika";
		ob.age=21;
		ob.address="kochi";
		ob.salary=30000;
		ob.printdetails();
		ob.specialization="tester";
		System.out.println("specialization=" +ob.specialization);
		System.out.println();
		Managers obj=new Managers();
		obj.name="chithira";
		obj.age=22;
		obj.address="xyz";
		obj.salary=100000;
		obj.printdetails();
		obj.department="it";
		System.out.println("department=" +obj.department);
		
		
	}

}
