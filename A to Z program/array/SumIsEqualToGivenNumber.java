//Print pair of Indexes of an array whose Element’s sum is equal to a given number
import java.util.Scanner;
public class SumIsEqualToGivenNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter size of an array ");
		n = sc.nextInt();
		int[] a = new int[n];

		for (int i=0; i<n; i++ ) {
		System.out.println("enter "+ i+1 +"th element of array");
		a[i] = sc.nextInt();
		}
		int sum;

		System.out.println("enter sum of two element");
		sum = sc.nextInt();

		for (int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(a[i]+a[j] == sum)
				{
					System.out.println("index of element is a["+i+"] + a["+j+"] = "+sum);
				}	
			}
		}
	}
}