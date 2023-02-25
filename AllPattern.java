//all pattern
public class AllPattern
{
	public static void main(String[] args) {
		P1();
		System.out.println();
		System.out.println();
		System.out.println();
		p2();
		System.out.println();
		System.out.println();
		System.out.println();
		p3();
		System.out.println();
		System.out.println();
		System.out.println();
		p4();
		System.out.println();
		System.out.println();
		System.out.println();
		p5();
		System.out.println();
		System.out.println();
		System.out.println();
		p6();
		System.out.println();
		System.out.println();
		System.out.println();
		p7();
		System.out.println();
		System.out.println();
		System.out.println();
		p8();
		System.out.println();
		System.out.println();
		System.out.println();
		p9();
		System.out.println();
		System.out.println();
		System.out.println();
		p10();
		System.out.println();
		System.out.println();
		System.out.println();
		p11();
		System.out.println();
		System.out.println();
		System.out.println();
		p12();
		System.out.println();
		System.out.println();
		System.out.println();
		p13();
		System.out.println();
		System.out.println();
		System.out.println();
		p14();
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public static void P1()
	{
		for (int i = 1; i<=5; i++) 
		{
			for (int j = 1; j<=i; j++) 
				{
					System.out.print(j);	
				}	
				System.out.println();
		}
	}
	public static void p2()
	{
		int count=1;
		for (int i = 1; i<=5; i++) 
		{
			for (int j = 1; j<=i; j++) 
				{
					System.out.print(count++);	
				}	
				System.out.println();
		}
	}
	public static void p3()
	{
		int n=1;
		for (int i = 1; i<=4; i++) 
		{
			int k =n;
			for (int j = 1; j<=i; j++) 
				{
					System.out.print(k);
					k = k + 4-j;	
				}	
				System.out.println();
				n++;
		}
	}
	public static void p4()
	{
		for (int i = 1; i<=5; i++) 
		{
			for (int k=1; k<=5-i; k++) 
			{
				System.out.print(" ");	
			}
			for (int j = i; j>=1; j--) 
				{
					System.out.print(j);	
				}	
				System.out.println();
		}
	}
	public static void p5()
	{
		for (int i = 1; i<=5; i++) 
		{
			for (int k=1; k<=5-i; k++) 
			{
				System.out.print(" ");	
			}
			for (int j = i; j>=1; j--) 
				{
					System.out.print(j);	
				}	
				System.out.println();
		}
	}
	public static void p6()
	{
		for (int i=1; i<=5 ; i++) 
		{
			for (int j=1; j<=i; j++) 
			{
				if(i==5)
				{
					System.out.print("* ");
				} 
				else if(j==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
                    {
                        if(j==i-1 && j!=4)
                        {
                            System.out.print("*");
                        }
                    else
                        {
                            System.out.print(" ");
                        }
	   				}
			System.out.println();
		}
	}
	public static void p7()
	{
		for(int i=1; i<=5; i++)
		{
			for(int k=1; k<=5-i; k++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				if(j == 1 || j == i || i == 5)
				{		
						System.out.print("* ");
				}
				else
				System.out.print("  ");
			}
			System.out.println();
		}
		
	}
	public static void p8()
	{
		for (int i = 1; i<=5; i++) 
		{
			for (int k=1; k<=5-i; k++) 
			{
				System.out.print(" ");	
			}
			for (int j = 1; j<=i; j++) 
				{
					System.out.print("* ");	
				}	
				System.out.println();
		}
	}
	public static void p9()
	{
		for (int i = 5; i>=1; i--) 
		{
			for (int j = 1; j<=i; j++) 
				{
					System.out.print("*");	
				}	
				System.out.println();
		}
	}
	public static void p10()
	{
		for (int i = 5; i>=1; i--) 
		{
			for(int k=1; k<=5-i; k++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j<=i; j++) 
				{
					System.out.print("*");	
				}	
				System.out.println();
		}
	}
	public static void p11()
	{
		for (int i = 1; i<=5; i++) 
		{
			for(int k=1; k<=5-i; k++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j<=i; j++) 
				{
					System.out.print(i+" ");	
				}	
				System.out.println();
		}
	}
	public static void p12()
	{
		int c=1;
		for (int i = 1; i<=4; i++) 
		{
			for(int k=1; k<=4-i; k++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j<=i; j++) 
				{
					System.out.print(c+++" ");	
				}	
				System.out.println();
		}	
	}
	public static void p13()
	{
		for (int i=5; i>=1 ; i--) 
		{
			for (int k=1; k<=5-i; k++) 
			{
				System.out.print(" ");	
			}
			for (int j=1; j<=i; j++) 
			{
				if(i==5)
				{
					System.out.print("* ");
				} 
				else if(j==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
                    {
                        if(j==i-1 && j!=4)
                        {
                            System.out.print("*");
                        }
                    else
                        {
                            System.out.print(" ");
                        }
	   				}
			System.out.println();
		}	

		for (int i=1; i<=5 ; i++) 
		{
			for (int k=1; k<=5-i; k++) 
			{
				System.out.print(" ");	
			}
			for (int j=1; j<=i; j++) 
			{
				if(i==5)
				{
					System.out.print("* ");
				} 
				else if(j==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
                    {
                        if(j==i-1 && j!=4)
                        {
                            System.out.print("*");
                        }
                    else
                        {
                            System.out.print(" ");
                        }
	   				}
			System.out.println();
		}
	}
	public static void p14()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j==1 || j==5 || i==1 || i ==5)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}