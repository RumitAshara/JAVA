import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GCD d = new GCD(); // creating class object , where GCD = class name && d = obj name  
        int n1 , n2;
        System.out.print("enter first number : ");
        n1 = sc.nextInt();
        System.out.print("enter second number : ");
        n2 = sc.nextInt();
        System.out.print("gcd of "+n1+" and "+n2+" = "+d.gcd(n1 , n2)); // calling non-Static method(Function)
        sc.close();
    }
    public int gcd(int num1 , int num2)
    {
        while(num1 != num2)
		{
			if (num1 > num2) 
			{
				num1 -= num2;	
			}
			else
			{
				num2 -= num1;
			}
		}
        // now both numbers are same , therefor we can return either num1 or num2
        return num1;
    }
}
