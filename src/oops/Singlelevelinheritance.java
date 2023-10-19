package oops;
class Dog
{
	public void eating()
	{
		System.out.println("Dog is eating");
	}
}
class cat extends Dog
{
	public void sleeping()
{
		System.out.println("Cat is sleeping");
}
}


public class Singlelevelinheritance {

	public static void main(String[] args) {
		
cat ob=new cat();
ob.sleeping();
ob.eating();
		
	}
}
