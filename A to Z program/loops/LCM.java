import java.util.Scanner;
public class LCM
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,max;
		boolean b = true;
		System.out.println("enter n1");
		n1 = sc.nextInt();
		System.out.println("enter n2");
		n2 = sc.nextInt();
			max=(n1>n2)?n1:n2;
			while(b!= false)
			{
				if(max%n1==0 && max%n2==0)
				{
					System.out.println("LCM = "+max);
					break;
				}
				max++;
			}
	}
}