//GCD of two numbers using while loop
import java.util.Scanner;
public class GCB
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.out.println("enter n1");
		n1 = sc.nextInt();
		System.out.println("enter n2");
		n2 = sc.nextInt();

		while(n1!=n2)
		{
			if (n1>n2) 
			{
				n1-=n2;	
			}
			else
			{
				n2-=n1;
			}
		}
		System.out.println(n1);
		System.out.println(n2);

	}
}