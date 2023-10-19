package oops;

public class Methodoverloading2 {

	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
		
		
		
	public static void main(String[] args) {
Methodoverloading2 ovv=new Methodoverloading2();
ovv.add(5,6);
ovv.add(4,9.9);
}

}
