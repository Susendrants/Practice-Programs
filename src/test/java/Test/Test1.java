package Test;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void profit()
	{
		int a[] = {100, 180, 260, 310, 40, 535, 695};
		int max=a[1]-a[0];
		int s1=0;
		int s2=0;
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(max<(a[j]-a[i]))
				{
					max=a[j]-a[i];
					s1=a[j];
					s2=a[i];
				}
				
			}
		}
		System.out.println("The maximum profit we get is "+max+ " Buy the stock at "+s2+" and sell it at"+ s1);

	}
	
	@Test
	public void profit2()
	{
		int a[] =  {4, 2, 2, 2, 4};
		int max=a[1]-a[0];
		int s1=0;
		int s2=0;
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(max<(a[j]-a[i]))
				{
					max=a[j]-a[i];
					s1=a[j];
					s2=a[i];
				}
			}
		}
		System.out.println("The maximum profit we get is "+max+ " Buy the stock at "+s2+" and sell it at "+ s1);

	}
	
	@Test
	public void maxPrice()
	{
		int a[] = {7,1,5,3,6,4};
		int max=a[0];
		for(int i=0; i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
	}

	@Test
	public void maxNum()
	{
		int[] a={-1,-2,-3,-4};
		int max=a[0];
		for(int i=0; i<a.length;i++)
		{
			
				if(max<a[i])
				{
					max=a[i];
				}
		}
		System.out.println(max);
	}
	
	@Test
	public void profit31()
	{
		int a[] =  {1,2,3,-2,5};
		int max=a[1]+a[0];
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(max<(a[j]+a[i]))
				{
					max=a[j]+a[i];
					
				}
			}
		}
		System.out.println(max);

	}
	
	@Test
	public void largestPalindrome()
	{
		String s="ayamalayalamkayak";
		String s1="";
		String s2="";
		int len=0;
		for(int i=0;i<s.length();i++)
		{
			s1=s1+s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{
				s1=s1+s.charAt(j);
				String rev="";
				for(int k=s1.length()-1;k>=0;k--)
				{
					rev=rev+s1.charAt(k);
				}
				if(rev.equals(s1) && len<s1.length())
				{
					s2=s1;
					len=s2.length();
				}
			}
			s1="";
		}
		System.out.println(s2);
	}
	
	
	@Test
	public void removeDupli()
	{
		String s="cabbac";
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					if(i>j)
					{
						break;
					}else
					{
						count++;
					}
				}
			}
			if(count==1)
			{
				System.out.print(s.charAt(i));
			}
		}
	}
	
	@Test
	public void anagram()
	{
		String s= "mama";
		String r="amma";
		char[] sc=s.toCharArray();
		Arrays.sort(sc);
		char [] rc=r.toCharArray();
		Arrays.sort(rc);
		if(s.length()==r.length())
		{
		    if( Arrays.equals(sc, rc))
		    {
		    	System.out.println("The given strings are anagram");
		    }
		    else
		    {
		    	System.out.println("The given strings are not anagram");
		    }
		}
	}
	
}
