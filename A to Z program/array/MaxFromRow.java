//Find max from each row of a NxN matrix 
import java.util.Scanner;
public class MaxFromRow
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("enter value of N for NxN matrix : ");
		n = sc.nextInt();
		int arr[][] = new int[n][n];
		System.out.print("enter elements of matrix");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++)
			{
				if(arr[i][0]<arr[i][j])
				{
					arr[i][0] = arr[i][j];
				}
			}
		}

		System.out.print("max element of each rows are ");
		for (int i=0; i<n; i++) 
		{
			System.out.println("for "+i+"th row max = "+arr[i][0]);	
		}

	}
}