package oops;

public class Methodoverloading3 {
	
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
		

	public static void main(String[] args) {
		Methodoverloading3 ovvv=new Methodoverloading3();
		ovvv.add(2.2,6);
		ovvv.add(8,9.9);

	}

}
