package Practice;

public class Calculator {

	public static void main(String[] args) {
		char op='*';
		int a=12,b=5;
		switch(op)
		{
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
			default:
				System.out.println("invalid day");
				break;
		}
	}

}
