package basics;

public class calculator {

	public static void main(String[] args) {
		char op='-';
		int a=10,b=4,result;
		switch(op)
		{
		case '+':
			result=a+b;
			System.out.println(a+"+"+b+"="+result);
			break;
		case '-':
			result=a-b;
			System.out.println(a+"-"+b+"="+result);
			break;
		case '*':
			result=a*b;
			System.out.println(a+"*"+b+"="+result);
			break;
		case '/':
			result=a/b;
			System.out.println(a+"/"+b+"="+result);
			break;
		}
		// TODO Auto-generated method stub

	}

}
