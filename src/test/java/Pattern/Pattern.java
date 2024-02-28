package Pattern;

import org.testng.annotations.Test;

public class Pattern {
	@Test
	public void pattern1()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
  @Test
  public void pattern2()
  {
	  int n=5;
	  for(int i=n-1;i>=0;i--)   //5  
	  {
		  for(int j=0;j<=i;j++)  //0<=5                 * * * * *
			                                            
		  {                        //1<=5
			  System.out.print("* ");
		  }
		  System.out.println();
	  }
  }
  //or//
  @Test
  public void pattern2c()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
  
  @Test
  public void pattern3()
  {
	  int n=5;
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=i;j<=n;j++)
			  
		  {
			  System.out.print(" ");
		  }
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print("* ");
		  }
		  System.out.println();
	  }
  }
  
  @Test
  public void pattern4()
  {
	  int n=5;
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=i;j++)
			  
		  {
			  System.out.print(" ");
		  }
		  for(int j=i;j<=n;j++)
		  {
			  System.out.print("* ");
		  }
		  System.out.println();
	  }
  }
  @Test
  public void pattern5()
  {
	  int n=5;
	  for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
  }
  @Test
  public void pattern6()
  {
	  int n=5;
	  for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
  }
  @Test
  public void pattern7()
  {
	  int n=5;
	  for(int i=1;i<=n;i++)
		{
		    int k=5;
			for(int j=i;j<=n;j++)
			{
				System.out.print(k-- +" ");
			}
			System.out.println();
		}
  }
  
  @Test
  public void pattern8()
  {
	  int n=5;
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  if(i%2==0)
			  {
				  System.out.print("2 ");
			  }else
			  {
				  System.out.print("1 ");
			  }
		  }
		  System.out.println();
	  }
  }
  
  @Test
  public void pattern9()
  {
	  int n=5;
	  char ch='A';
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(ch++ +" ");
		  }
		  System.out.println();
	  }
  }
  
  @Test
  public void pattern10()
  {
	  int n=7;
	  
	  for(int i=1;i<=n;i++)
	  {
		  char ch='A';
		  for(int j=i;j<=n;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int j=1;j<=i;j++)
		  {
			  
			  if(i%2!=0)
			  {
			  System.out.print(ch++ +" ");
			  }
			  if(i==j)
			  {
				  System.out.print("");
			  }
		  }
		  System.out.println();
	  }
  }  
 
  @Test
   public void pattern11()
   {
	  int n=2;
	  for(int i=0;i<=n;i++)
	  {
		  for(int j=1;j<n;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int j=0;j<=i;j++)
		  {
			  System.out.print(j+1);
		  }
		  for(int k=i-1;k>=0;k--)
		  {
			  System.out.print(k+1);
		  }	
		  System.out.println();
	  }
	  
   }
 
}
