import java.util.Scanner;
public class BodyMassIndex
{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 double kg,pound,meter,inch,bmi;

		 System.out.println("enter your weight in pound");
		 pound=sc.nextDouble();
		 kg=pound*0.45359237;
		 System.out.println("kg = "+kg);
		 System.out.println("enter your height in inch");
		 inch=sc.nextDouble();
		 meter=inch*0.0254;
		 System.out.println("meter = "+meter);

		 bmi=kg/(meter*meter);
		 System.out.println("BMI = "+bmi);	
	}
}