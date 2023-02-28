import java.util.Scanner;
public class Search
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,num;
		System.out.println("enter size of an array");
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("enter array values");
		for (int i=0; i<n; i++) 
		{
			a[i]=sc.nextInt();			
		}
		System.out.println("enter value which you want to search");
		num=sc.nextInt();
		for (int i=0; i<n; i++) 
		{
			if(a[i]==num)
			{
				System.out.println("index of num is "+i);
			}			
		}
	}
}