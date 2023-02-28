import java.util.Scanner;
public class CallBill
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int call;
		double bill;
		System.out.println("enter number of calls");
		call = sc.nextInt();
		if (call <= 100) 
		{
					System.out.println("bills = 200");
		}	
		else if(call > 100 && call <=150)
		{
			bill=200+(call-100)*(0.60);
			System.out.println("bills = "+bill);
		}
		else if (call > 150 && call <=200) 
		{
			bill=200+30+(call-150)*(0.50);
			System.out.println("bill = "+bill);
		}
		else if (call > 200)
		{
			bill=200+30+25+(call-200)*(0.40);
			System.out.println("bill = "+bill);
		}
		else
		{
			System.out.println("invalid input");
		}
	}
}