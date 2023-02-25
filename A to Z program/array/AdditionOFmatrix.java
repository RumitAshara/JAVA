//Addition of two NxN Matrix
import java.util.Scanner;
public class AdditionOFmatrix
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("enter size of raw ");
		n = sc.nextInt();
		System.out.println("enter size of column ");
		m = sc.nextInt();

		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		int[][] c = new int[n][m];

		System.out.println("enter th element of a array");
		for (int i=0; i<n; i++ ) 
		{
			for(int j=0; j<m; j++)
			{
				
				a[i][j] = sc.nextInt();
			}
		}


		System.out.println("enter th element of b array");

		
		for (int i=0; i<n; i++ ) 
		{
			for(int j=0; j<m; j++)
			{
				
				b[i][j] = sc.nextInt();
			}
		}

		for (int i=0; i<n; i++) 
		{
			for(int j=0; j<m; j++)
			{
				c[i][j]=a[i][j]+b[i][j];	
			}
		}
		System.out.println("sum of matrix is");
		for (int i=0; i<n; i++) 
		{
			for(int j=0; j<m; j++)
			{
				System.out.print(c[i][j]+"     ");
			}	
			System.out.println();
		}
	}
}