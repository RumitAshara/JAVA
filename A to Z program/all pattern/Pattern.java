public class Pattern
{
	public static void main(String[] args) {
		System.out.println("1st pattern");
		P1();
		
		p2();
		
		p3();
	
		p4();
		
		p5();
	
		p6();
		
		p7();
		
		p8();
		
		p9();
		
		p10();
		
		p11();
		
		p12();
		
		p13();
		
		p14();
	
	}//main method

	public static void P1()
	{
		for (int i = 1; i<=5; i++) 
		{
			for (int j = 1; j<=i; j++) 
				{
					System.out.print(j);	
				}	
				System.out.println();
		}//for loop over
		System.out.println();
	}
	
	public static void p2()
	{
		int count=1;
		for (int i = 1; i<=5; i++) 
		{
			for (int j = 1; j<=i; j++) 
				{
					System.out.print(count+++" ");	
				}	
				System.out.println();
		}//for loop over
		System.out.println();
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
		}//for loop over
		System.out.println();
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
		}//for loop over
		System.out.println();
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
					if(i==2)
					System.out.print(j+1);
					else
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
		}//for loop over
		System.out.println();
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
		}//for loop over
		System.out.println();	
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
		}//for loop over
		System.out.println();
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
		}//for loop over
		System.out.println();
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
		}//for loop over
		System.out.println();
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
		}//for loop over
		System.out.println();
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
		}//for loop over
		System.out.println();	
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
		}//for loop over
		System.out.println();
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
		}//for loop over
		System.out.println();
	}
}//class over
