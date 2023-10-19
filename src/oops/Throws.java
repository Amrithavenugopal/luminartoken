package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		FileInputStream f=new FileInputStream("E.//Book.xlsx");
		System.out.println("started");
		Thread.sleep(5000);
		System.out.println("stopped");
	}

}
 