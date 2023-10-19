package basics;

public class Questions {

	public static void main(String[] args) {
		String s="jmeter ";
		String s1="perfomance testing tool";
		System.out.println(s.concat(s1));
		
		
		String s2="java language is platform independent";
		if(s2.contains("language"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		String s3="selenium webdriver is used for webapplication testing";
		String words[]=s3.split(" ");
		for(String l:words)
		{
			System.out.println(l);
			if(l.contains("webapplication"))
			{
				break;
			}
		}
		
		
		
		
		
		
	}

}
