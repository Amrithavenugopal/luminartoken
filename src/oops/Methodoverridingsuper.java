package oops;
class parent
{
	public void phone()
	{
		System.out.println("nokia");
	}
}
class child extends parent
{
	public void phone()
	{
		
		System.out.println("iphone");
		super.phone();
	}
}




public class Methodoverridingsuper {

	public static void main(String[] args) {
	
child obj=new child();
obj.phone();

	}

}