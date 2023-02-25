//Find Smallest and Second Smallest from an array
import java.util.Scanner;
public class small
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("enter size of an array ");
		n = sc.nextInt();
		int[] a = new int[n];

		for (int i=0; i<n; i++ ) {
		System.out.println("enter "+ i+1 +"th element of array");
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
		System.out.println("smalest element of array is"+a[n-1]);
		System.out.println("second smalest element of array is"+a[n-2]);
	}
}