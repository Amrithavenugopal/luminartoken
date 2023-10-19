package Exam;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number: ");
		a=sc.nextInt();
		System.out.println("enter the second number: ");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a=" +a);
		System.out.println("b=" +b);

	}

}
