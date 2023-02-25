import java.util.Scanner;
public class  FibonacciSeries
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter positive integer : ");
        n = sc.nextInt();
        System.out.print("0 , 1 , "); //default in Fibonacci Series :)
        Fibonacci(n);
    }
    public static int Fibonacci(int a){
        int n1=0 , n2=1 , n3 , max=1;
        while(max<=a)
        {
            n3 = n1 + n2;
            System.out.print(n3+" , ");
            n1 = n2;
            n2 = n3;
            max++;
        }
        return 0;
    }
}