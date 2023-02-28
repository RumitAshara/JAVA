import java.util.Scanner;
public class Result
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double[] sub=new double[5];
		double total=0,p;

		System.out.println("enter marks of 5 subject out of 80");

		for (int i=0; i<5; i++) 
		{
			sub[i]=sc.nextDouble();
			total=total+sub[i];		
		}
		System.out.println("total marks = "+total);

		p=(total*100)/400;
		System.out.println("percentage = "+p);

		if (p>0 && p<35) 
		{
			System.out.println("fail");	
		}
		else if(p>=35 && p<45)
		{
			System.out.println("pass class");
		}
		else if(p>=45 && p<60)
		{
			System.out.println("second class");
		}
		else if(p>=60 && p<70)
		{
			System.out.println("first class");
		}
		else if(p>=70 && p<=100)
		{
			System.out.println("distinction");
		}
		else
		{
			System.out.println("invalid input");
		}
	}
}