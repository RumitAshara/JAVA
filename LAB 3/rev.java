import java.util.Scanner;
public class rev
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rev=0,n,digit;
		System.out.println("enter number");
		n=sc.nextInt(); 	
		while(n!=0)
		{
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println("rev = "+rev);
	}
}