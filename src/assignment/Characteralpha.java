package assignment;
import java.util.Scanner;
public class Characteralpha {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		if((ch>='A' && ch<='z')||(ch>='a' && ch<='z'))
		{
			System.out.println("it is a alphabet");
		}
		else
		{
			System.out.println("not an alphabet");
		}

	}

}
