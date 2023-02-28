import java.util.Scanner;
public class loop
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("enter 2 values");
		a=sc.nextInt();
		b=sc.nextInt();

		for (int i=a; i<=b; i++)
		{
			if(i%2 == 0 && i%3 != 0)
			{
				System.out.println(i);
			}
		}	
	}
}