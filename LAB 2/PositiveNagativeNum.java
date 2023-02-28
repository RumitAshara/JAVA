import java.util.Scanner;
public class PositiveNagativeNum
{
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		double a;
		System.out.println("enter value in positive or negative");
		a=sc.nextDouble();

		if (a>=0) 
		{
			System.out.println("number is positive or zero");	
		}
		else 
		{
			System.out.println("number is negative");	
		}
	}
}