import java.util.Scanner;
public class NumIsPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter a number : ");
        n = sc.nextInt();
        int b = CheckPrime(n);

        if(b==1)
            System.out.print("number is prime");
        else
            System.out.print("number is not prime");
            sc.close();
    }
    public static int CheckPrime(int n){
        int flag=0;
        for(int i=1; i<=n/2; i++)
        {
            if(n%i==0)
            {
                flag++;
            }
        }
        if(flag == 1)
        {
            return 1;
        }
        else 
        {
            return 0;
        }
    }
}