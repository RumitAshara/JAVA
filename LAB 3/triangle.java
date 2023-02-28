import java.util.Scanner;
public class triangle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		System.out.println("enter 3 side of triangle");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		if (a==b && b==c) 
		{
				System.out.println("equilateral");
		}
		else if(a==b || b==c || a==c)
		{
			System.out.println("isosceles");
		}
		else
		{
			System.out.println("scalene ");
		}
	}
}