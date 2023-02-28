import java.util.Scanner;
import java.lang.Math;
public class DiameterOfCircle
{
	public static void main(String[] args) 
	{	
	Scanner sc=new Scanner(System.in);
	double area,r,d;
	System.out.println("enter area of circle");
	area=sc.nextDouble();
	r=Math.sqrt(area/Math.PI);
	d=r+r;
	System.out.println("diameter = "+d);
	}
} 