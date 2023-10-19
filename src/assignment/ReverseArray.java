package assignment;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		System.out.println("given array is: ");
		for(int i=0;i<=3;i++)
		{
			System.out.println(a[i]+" ");
			
		}
		System.out.println();
		System.out.println("reversed array is: ");
		for(int i=3;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println();

	}

}
