package assignment;

public class Largestnumber {

	public static void main(String[] args) {
		int a[]= {10,63,50,3};
		for(int i=1;i<4;i++)
		{
			if(a[0]<a[i])
			{
				a[0]=a[i];
			}
		
		}
		System.out.println("largest no in the given array is:"+a[0]);

	}

}
