import java.util.Scanner;
public class prime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int prime,flag=0;
		System.out.println("enter any int number");
		prime = sc.nextInt();

		for(int i=1; i<=prime; i++)
		{
			if(prime%i==0)
			{
				flag++;
			}
		}
		if (flag==2) 
		{
			System.out.println("number is prime");	
		}
		else
		{
			System.out.println("number is not prime");
		}
	}
}