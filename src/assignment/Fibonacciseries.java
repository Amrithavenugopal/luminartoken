package assignment;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		int n,firstterm=0,secondterm=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number:");
		n=sc.nextInt();
		System.out.println("fibonacci series till "+n+" terms");
		
		for(int i=1;i<=n;i++)
		{
		System.out.print(firstterm+"  ");
		int nextterm=firstterm+secondterm;
		firstterm=secondterm;
		secondterm=nextterm;
		}
		

	}

}
