package basics;

public class Stringfunction1 {

	public static void main(String[] args) {
		String s="welcome";
		System.out.println(s.length());
		int w=s.length();
		System.out.println("length:"+w);
		
		
		
		String s1="hello";
		String s2="luminar";
		System.out.println(s1.concat(s2));

		
		System.out.println(s1+s2);
		System.out.println(1+2+s1);
		System.out.println(s1+1+2);
		
		String s5="Lumniar";
		System.out.println(s5.toUpperCase());
		
		System.out.println(s5.endsWith("e"));
		System.out.println(s5.startsWith("L"));
		
		
		String a="abc";
		String b="Abc";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a==b);
		
		
		String q=" hello ";
		System.out.println(q);
		System.out.println(q.trim());
		
		String y="welcome";
		System.out.println(y.substring(3));
		System.out.println(y.substring(0,4));
		
		String x="welcome to luminar";
		System.out.println(x.contains("Luminar"));
		
		
		String z="welcome";
		System.out.println(z.charAt(4));
		
		System.out.println(z.replace("el","xy"));
		
		
		String w1="welcome to luminar";
		String words[]=w1.split(" ");
		for(String l:words)
		{
			System.out.println(l);
			}
		
		
		String v1="hello";
		char word[]=v1.toCharArray();
		for(char m:word)
		{
			System.out.println(m);
		}
		
		
		
		
	}

}
