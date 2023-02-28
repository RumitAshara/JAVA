import java.util.Scanner;
public class AreaOfCircle
{
	public static void main(String[] args) 
	{
		Scanner	sc=new Scanner(System.in);
		
		double area;
		System.out.println("enter R value");
		int r=sc.nextInt();

		area=Math.PI*r*r;

		System.out.println("area = "+area);
	}
}