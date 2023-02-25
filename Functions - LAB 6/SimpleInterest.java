import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal , rate , No_OF_Year;
        System.out.print("Enter principal : ");
        principal = sc.nextInt();
        System.out.print("Enter rate : ");
        rate = sc.nextInt();
        System.out.print("Enter number of years : ");
        No_OF_Year = sc.nextInt();
        System.out.print(Interest(principal , rate , No_OF_Year));
        sc.close();
    }
    public static double Interest(double a , double b , double c)
    {
        double interest = (a * b * c)/100;
        return interest;
    }
}
