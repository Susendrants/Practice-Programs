package Array;

import org.testng.annotations.Test;

public class MinMaxNumTest {
	@Test
	public void minAndMax() {
       int a[]= {92,23,54,34,11};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println("The first minimum number in an arrayis "+a[0]);
		System.out.println("The first maximum number in an arrayis "+a[a.length-1]);
	}

@Test
public void sumOfFirstThreeMinimum()
{
	 int a[]= {92,23,54,34,11};
	 
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=i+1;j<a.length;j++)
		 {
			 if (a[i]>a[j])
			 {
				 int temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			 }
		 }
	 }
	 int sum=0;
	 for(int i=0;i<3;i++)
	 {
		sum= sum+a[i];
	 }
	 System.out.println(sum);
}

@Test
public void sumOfFirstThreeMaxmum()
{
	int a[]= {92,23,54,34,11};
	for(int i=0; i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	int sum=0;
	for(int i=0;i<3;i++)
	{
		sum=sum+a[i];
	}
	System.out.println(sum);	
}
@Test
public void productOfFirstThreeMaxmum()
{
	int a[]= {92,23,54,34,11};
	for(int i=0; i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	int pr=1;
	for(int i=0;i<3;i++)
	{
		pr=pr*a[i];
	}
	System.out.println(pr);	
}

@Test
public void firstMinNumWithoutBubbleSort()
{
	int a[]= {92,23,54,34,11};
	int fmin=a[0];
	for(int i=0;i<a.length;i++)
	{
		if (fmin>a[i])
		{
			fmin=a[i];
		}
	}
	System.out.println(fmin);
}

@Test
public void firstMaxNumWithoutBubbleSort()
{
	int a[]= {32,23,54,34,11};
	int fmax=a[0];
	for(int i=0;i<a.length;i++)
	{
		if (fmax<a[i])
		{
			fmax=a[i];
		}
	}
	System.out.println(fmax);
}
@Test
public void findFrequentyRepeatedInArray()
{
	int a[]= {1,2,3,1,1,5,2};
	int max=0;
	int val=0;
	for(int i=0;i<a.length;i++)
	{
		int count=1;
		for(int j=i+1;j<a.length;j++)
		{
			if (a[i]==a[j])
			{
				count++;
			}
		}
		if(count>max)
		{
			max=count;
			val=a[i];
		}
	}
	System.out.println(val+" is repeating "+max+" times");
}
//find the frequency of two number from above program
//find the missing numbers in an array int[] a={1,3,6,7,9}
@Test
public void combination()
{
	int []a= {8,2,3,7,6,4,9,5};
	
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]+a[j]==11)
			{
				System.out.println(a[i]+" "+a[j]);
			}
		}
	}
}

@Test
public void missingNum()
{
	int a[]= {1,3,6,7,9};
	
	
	for(int i=0;i<11;i++)
	{
		boolean flag=false;
		for(int j=0;j<a.length;j++)
		{
			if (a[j]==i)
			{
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println(i);
		}
	}
}

@Test
public void frequencyofNumber()
{
	int a[]= {1,2,3,1,1,5,2};
	int visited[]=new int[a.length];
	
	for(int i=0;i<a.length;i++) 
	{
		int n=a[i];
		if(visited[i]==0)
		{
			int count=0;
			for(int j=0;j<a.length;j++) 
			{
				if (n==a[j])
				{
					visited[j]=-1;
					count++;
				}
			}
			System.out.println(n+"occurs"+count+"times");
		}
	}	
		
}
@Test
public void frequencyofNumber1()
{
	int a[]= {1,2,3,1,1,5,2};
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				if(i>j)
				{
					break;
				}else {
					count++;
				}
			}
		}
		if (count>=1)
		{
			System.out.println(a[i]+" is occuring "+count+" times");
		}
	}
}
}
