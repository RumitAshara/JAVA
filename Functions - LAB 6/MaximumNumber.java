import java.util.Scanner;
public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 , n2;

        System.out.print("enter first number : ");
        n1 = sc.nextInt();
        System.out.print("enter second number : ");
        n2 = sc.nextInt();
        System.out.print(max(n1 , n2)+ " is maximum ");
        sc.close();
    }
    public static int max(int a , int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}
