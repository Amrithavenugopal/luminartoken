package oops;
interface Basicanimal
{
	void cat();
	void sleep();
}
class Monkey
{
	public void jump()
	{
		System.out.println("monkey jump");
	}
	public void bite()
	{
		System.out.println("monkey bite");
	}
}
class Human extends Monkey implements Basicanimal
{

	@Override
	public void cat() {
   System.out.println("cat");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleep");
		
	}
	
	public void  speak()
	{
		System.out.println("human speak");
	}
}



public class Animalquestion {

	public static void main(String[] args) {
		 Human ob=new Human();
		 ob.cat();
		 ob.sleep();
		 ob.speak();
		 ob.jump();
		 ob.bite();

	}

}
