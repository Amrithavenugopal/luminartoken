package oops;
class Doga
{
 public void eating()
 {
	 System.out.println("Dog is eating");
 }
}
class cata extends Doga
{
	public void sleeping()
	{
		System.out.println("Cat is sleeping");
	}
}
class liona extends cata
{
	public void running()
	{
		System.out.println("Lion is running");
	}
}



public class Multilevelinheritance {
	public static void main(String[] args) {
cata ob=new cata ();
ob.eating();
ob.sleeping();

liona ob1=new liona();
ob1.eating();
ob1.sleeping();
ob1.running();
	
	}

}
