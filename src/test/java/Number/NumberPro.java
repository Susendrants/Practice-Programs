package Number;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class NumberPro {
	
	@Test
	public void palindrome()
	{
		int a=12321;
		int tem=a;
		int rev=0;
		while(a!=0)
		{
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println(rev);
		if(rev==tem)
		{
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The given number is not a palindrom");
		}
	}
	@Test
	public void fibonacci()
	{
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<8;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	@Test
	public void factorial()
	{
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
	
	@Test
	public void primeNum()
	{
		for(int i=1;i<=30;i++)
		{
			int count=0;
			for(int j=1; j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}	
	
	
	
	@Test
	public void prime()
	{
		int n=7;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}	
		if(count==2)
		{
			System.out.println("The given number is prime number " +n);
		}
		else
		{
			System.out.println("The given number is not a prime number");
		}
	}
	@Test
	public void primeNumFromArray()
	{
		int a[]= {7,4,2,1,5,9,8,3};
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(a[i]);
			}
		}
		
	}
	
	@Test
	public void smallestEvenNum()
	{
		int a[]= {6,12,2,33,22,86};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i])
			{
				if(a[i]%2==0)
				{
					min=a[i];
				}
			}
		}
		System.out.println(min);
	}
	
	
	@Test
	public void addArray()
	{
		int []a= {1,2,3};
		int []b= {2,4,6,8};
		int []c=new int[b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
		}
		c[c.length-1]=b[b.length-1];
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
	
	@Test
	public void firstMin()
	{
		int[] a= {11,1,5,2,77,4};
		int min=a[0];
		int min2=a[0];
		for(int i=0;i<a.length;i++) //1
		{
			if(min>a[i])
			{
				min=a[i];
			}
			else if( min2>a[i] && min2>min)
			{
				min2=a[i];
			}
		}
		System.out.println(min);
		System.out.println(min2);
		
	}		
	

	@Test
	public void firstMinSecMin()
	{
		int[] a= {11,6,5,2,77,4};
		Arrays.sort(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
	}
	
	@Test
	public void swap()
	{
		int[]a= {5,7,0,8,0,7}; //{5,7,8,7,0,0}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.println(a[i]);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				System.out.println(a[i]);
			}
		}
	}
@Test
public void countDigits()
{
	int r=12345;
	int count=0;
//	for(int i=0;i<5;i++)
//	{
//		r=r/10;
//		count++;
//		
//	}
	while(r!=0)
	{
		int rem=r%10;
		count++;
		r=r/10;
	}
	System.out.println(count);
}
}
