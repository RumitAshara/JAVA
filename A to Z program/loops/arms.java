import java.util.Scanner;
import java.lang.Math;
public class arms
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int digit,n,temp1,temp2,c=0,arms=0;
		System.out.println("enter  n number");
		n = sc.nextInt();

		temp1 = n;
		temp2 = n;

		while(temp1 != 0) //or you can use n veriable insted of temp1
		{
			digit=temp1%10;
			c++;
			temp1 = temp1/10;
		}
		System.out.println("total digit = "+c);

		while(n != 0) // if you used n veriable in first loop then you can use temp1 veriable
		{
			digit = n%10;
			arms+=(Math.pow(digit,c));
			n = n/10;
		}
		System.out.println("arms  = "+arms);

		if (arms == temp2) 
		{
			System.out.println("number is arms");
		}		
		else
		{
			System.out.println("number is not arms");
		}
	}
}