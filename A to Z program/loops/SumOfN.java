//Print N prime numbers with their Sum
import java.util.Scanner;
public class SumOfN
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n , sum=0;

		System.out.println("Enter the number  : ");
		n = sc.nextInt();

		for (int i=1; i<=n; i++) 
		{
			sum = sum + i;
		}
		
			System.out.println("sum of 1 to "+n+" is = "+sum);	
	}
}