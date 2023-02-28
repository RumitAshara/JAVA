import java.util.Scanner;
public class OddEven
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,odd=0,even=0;
		System.out.println("enter size of an array");
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("enter odd or even number in an araay");
		for (int i=0; i<n; i++ ) 
		{
				a[i]=sc.nextInt();
				if(a[i]%2==0)
				{
					even++;
				}
				else
				{
					odd++;
				}
		}
		System.out.println("odd number = "+odd);
		System.out.println("even number = "+even);
	}
}