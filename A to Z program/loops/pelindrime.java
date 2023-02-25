import java.util.Scanner;
public class pelindrime
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit,n,rev=0,temp;
		System.out.println("enter  n number");
		n = sc.nextInt();
		temp = n;

		while(n != 0)
		{
			digit=n%10;
			rev = rev * 10 + digit;
			n = n/10;
		}

		if(temp == rev)
		{
			System.out.println("number is peli");

		}
		else
		{
			System.out.println("number is not peli");
		}
	}
}