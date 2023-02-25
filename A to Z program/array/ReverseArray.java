//Reverse an Array without using any other array
import java.util.Scanner;
public class ReverseArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,temp,t=1;
		System.out.println("enter size of an array ");
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("enter th element of array");
		for (int i=0; i<n; i++ ) 
		{
			a[i] = sc.nextInt();
		}

		 int[] rev = new int[n];
		 int j=0;

   			for(int i = n-1; i >= 0; i--)  
    		{	  
        		rev[j] = a[i];  
        		j++;  
   	 		}
   	 		System.out.println("rev of array is");  
		for (int i=0; i<n; i++) 
		{
			System.out.println(rev[i]);
		}

		
	}
}