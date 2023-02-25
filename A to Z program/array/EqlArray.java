//Check if two Arrays are equal or not (Use Boolean data type for flag )
import java.util.Scanner;
public class EqlArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter size of an array ");
		n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i=0; i<n; i++ ) 
		{
				System.out.println("enter "+ (i+1) +"th element of a array");
				a[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++ ) 
		{
				System.out.println("enter "+ (i+1) +"th element of b array");
				b[i] = sc.nextInt();
		}
			int flag=0;
		for (int i=0; i<n; i++) 
		{
			if (a[i]==b[i]) 
			{
				flag++;		
			}	
		}
		if(flag==n)
		{
			System.out.println("both array are same");
		}
		else
		{
			System.out.println("both array are not same");
		}
	}
}