package oops;

public class Trycatch {

	public static void main(String[] args) {
		int a=10,b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic expression");
			}
		System.out.println("stopped");
	}

}
