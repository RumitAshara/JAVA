import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char op;
		double a,b,c;

		System.out.println("enter value of a and then +,-,*,/");
		a = sc.nextDouble();
		op = sc.next().charAt(0);
		System.out.println("enter value of b");
		b = sc.nextDouble();

		switch(op)
		{
		case '+':
			{
				c=a+b;
				System.out.println("a+b = "+c);
				break;
			}
		case '-':
			{
				c=a-b;
				System.out.println("a-b = "+c);
				break;
			}
		case '*':
			{
				c=a*b;
				System.out.println("a*b= "+c);
				break;
			}
		case '/':
			{
				c=a/b;
				System.out.println("a/b =" +c);
				break;
			}
		default :
			{
				System.out.println("invalid input");
			}
		}	
	}
}