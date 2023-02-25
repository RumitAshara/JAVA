//Find Smallest and Second Smallest from an array
import java.util.Scanner;
public class SecondSmallestFromArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("enter size of an array ");
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("enter element of array");
		for (int i=0; i<n; i++ ) {
		
		a[i] = sc.nextInt();
		}

		for (int i=0; i<n; i++)
		{
			for (int j=0; j<n; j++) 
			{
				if (a[i]>a[j]) 
                {
 
                    m = a[i];
                    a[i] = a[j];
                    a[j] = m;
                }	
			}
		}
		System.out.println("Second Smallest From an Array is "+a[1]);
	}
}