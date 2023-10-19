package oops;
class Dogb
{
	public void eating()
	{
		System.out.println("Dog is eating");
	}
}
class catb extends Dogb
{
	public void sleeping()
	{
		System.out.println("catb is sleeping");
	}
}
class lionb extends Dogb
{
	public void running()
	{
		System.out.println("lion is running");
	}
}


public class Hierarchical {

	public static void main(String[] args) {
	
catb ob3=new catb();
ob3.eating();
ob3.sleeping();

lionb ob4=new lionb();
ob4.eating();
ob4.running();
	}

}
