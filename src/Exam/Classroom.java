package Exam;

import java.util.Scanner;

public class Classroom {
	int rollno;
	String name;
	int mark;
	public void Store(int rollno,String name,int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.mark=mark;
	}
	public void Display()
	{
		System.out.println("rollno ="+rollno);
		System.out.println("name="+name);
		System.out.println("mark ="+mark);
	}
	
	public static void main(String[] args) {
	Classroom obj=new Classroom();
	obj.Store(12,"AMRITHA",65);
	obj.Display();
	

	}

}
