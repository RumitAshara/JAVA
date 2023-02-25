//1 + 2 + 3 + …..+ N
//1 + 4 + 9 + …..+ n^2
//1+(1+2) + (1+2+3) + (1+2+3+4) …..+ (1+2+3+4+5+……+N)
//1 + 2(1+4) + 3(1+4+9) + 4(1+4+9+16) +…..N(1+4+9+16+…..+N^2)
import java.util.Scanner;
public class SeriesOfN
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Enter the number : ");
		n = sc.nextInt();
		S1(n);
		System.out.println();
		S2(n);
		System.out.println();
		S3(n);
		System.out.println();
		S4(n);
	}
		public static void S1(int n)
		{
			for (int i=1; i<=n; i++) 
			{
				System.out.print(i+" + ");
			}
		}
		public static void S2(int n)
		{
			for (int i=1; i<=n; i++) 
			{
				int sum = i*i;
				System.out.print(sum+" + ");
			}
		}
		public static void S3(int n)
		{
			System.out.print("1 ");
			for (int i=1; i<=n; i++) 
			{
				System.out.print("+(");
					for (int j=1; j<=i; j++) 
					{
						System.out.print(j+" + ");
					}
				System.out.print(")");
			}
		}
		public static void S4(int n)
		{
			for (int i=1; i<=n; i++) 
			{
				System.out.print(i+"+(");
				for (int j=1; j<=i; j++) 
				{
					int sum = j*j;
					System.out.print(sum+" + ");
				}
					System.out.print(")");
			}
		}
}