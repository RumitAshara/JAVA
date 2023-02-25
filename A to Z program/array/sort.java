//Sort and Array
import java.util.Scanner;
import java.util.Arrays;
public class sort
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,temp,t=1;
		System.out.println("enter size of an array ");
		n = sc.nextInt();
		int[] a = new int[n];

		for (int i=0; i<n; i++ ) {
		System.out.println("enter "+ (i+1) +"th element of array");
		a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for (int i=0; i<n; i++) 
		{
			System.out.println(a[i]);
		}
	}
}