package oops;
class Schooldetails
{
	final String schoolname="luminar";
	static String department="english";
}



public class Staticfinal {

	public static void main(String[] args) {
		System.out.println(Schooldetails.department);
		System.out.println(Schooldetails.department="malayalam");
		System.out.println(Schooldetails.department);
       Schooldetails ob=new Schooldetails();
       System.out.println(ob.schoolname);
	}

}
