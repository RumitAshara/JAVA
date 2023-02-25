//Count number of digits of a number using While Loop
import java.util.Scanner;
public class DigitCount
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n , count=0, digit;

		System.out.println("Enter the number : ");
		n = sc.nextInt();

		while(n!=0)
		{
			digit = n%10;
			count++;
			n = n/10;
		}
			System.out.println("total digits in number is : "+count);	
	}
}