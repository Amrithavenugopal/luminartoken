package oops;
abstract class Google
{
	abstract void search();
	public void message()
	{
		System.out.println("thankyou for using google");
	}
}
	class Searchall extends Google
	{

		@Override
		void search()
		{
			System.out.println("search details");
			
		}
		
	}
	
	class Searchvideo extends Google
	{

		@Override
		void search() {
			System.out.println("searching the videos");
			
		}
		
	}
	
	class Searchimage extends Google
	{

		@Override
		void search() {
		 System.out.println("Searching the images");
			
		}
		
	}
	
	




public class Abstractclass {

	public static void main(String[] args) {

		Searchall ab=new Searchall();
		ab.search();
		ab.message();
		
		Searchvideo cd=new  Searchvideo();
		cd.search();
		cd.message();
		
		Searchimage ef=new Searchimage();
		ef.message();
		ef.search();
		
		
		
	}

}
