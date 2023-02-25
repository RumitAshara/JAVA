import java.util.Scanner;
public class MaxFromArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,max=0;
		System.out.println("enter size of an array ");
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("enter th element of array");
		for (int i=0; i<n; i++ ) 
		{
			a[i] = sc.nextInt(); 
		}

		for (int i=0; i<n; i++) 
		{
				if(a[0]<a[i])
				{
					a[0] = a[i];
				}
		}
		System.out.println("max = "+a[0]);
	}
}