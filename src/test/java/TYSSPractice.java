import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.graphbuilder.struc.LinkedList;

public class TYSSPractice {
	@Test
	public void countMap() {
		String s="Automation";
		int count=0;
		HashMap map=new HashMap();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ') {
				map.put(s.charAt(i),count++);
			}	
		}
		System.out.println(count);
	}
	@Test
public void occ()
{
	String s="aaabbcddeeef";
	for(int i=0;i<s.length()-1;i++)
	{
		if(s.charAt(i)==s.charAt(i+1))
		{
			System.out.print(s.charAt(i));
		}
		else
		{
			System.out.println(s.charAt(i));
		}
	}
	System.out.println(s.charAt(s.length()-1));
}
	
	@Test
	public void hashma()
	{
		
		ArrayList arr=new ArrayList();
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("mobile", 701971);
		hm.put("teamsize", 10);
		hm.put("faculty", 5);
		hm.put("students", 20);
/*
		for(Entry<String, Integer> kv:hm.entrySet())
		{
			System.out.println(kv.getKey());
			System.out.println(kv.getValue());
		}
		*/
		 for(String k:hm.keySet())
	        {
			 System.out.println(k);
	            System.out.println(hm.get(k));
	        }
		
	}
	
	@Test
	public void listPalindrom()
	{
		java.util.LinkedList<String> list = new java.util.LinkedList<String>();
		list.add("dog");
		list.add("cat");
		list.add("dog");
		java.util.LinkedList<String> list1 = new java.util.LinkedList<String>();
		for(int i=list.size()-1;i>=0;i--)
		{
			String s=list.get(i);
			list1.add(s);
		}
		System.out.println(list1.equals(list));
	}
	
	@Test
	public void replaceEmptySpace()
	{
		String s="Kindly  remove the   extra    spaces";
		Pattern match = Pattern.compile("\\s+");
		Matcher mat = match.matcher(s);
		String ns = mat.replaceAll(" ");
		System.out.println(ns);  
		
	//	boolean mat = Pattern.matches("\\s+", s);
	
	}
	
	@Test
	public void mergeArray()
	{
		int [] a= {2,3,4,5,6,7};
		int []b= {0,9,8,1};
		int []c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int j =0;j<b.length;j++)
		{
			c[a.length+j]=b[j];
		}
		
		for(int k=0;k<c.length;k++)
		{
			System.out.println(c[k]);
		}
	}
	
	@Test
	public void similarEleInArray()
	{
		int [] a= {2,3,4,5,6,7};
		int []b= {0,9,3,1};
		int []c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int j =0;j<b.length;j++)
		{
			c[a.length+j]=b[j];
		}
		
		for(int i=0;i<c.length-1;i++)
		{
			int count=0;
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					if(i>j)
					{
						break;
					}else count++;
				}
			}
			if(count>1)
					
			{
				System.out.println(c[i]);
			}
		}
	}
	
	public static void getNum(int e)
	{
		if(e>10)
		{
			return;
		}else {
			System.out.println(e);
			e++;
			getNum(e);
			return;
		}
	}
	public static void main(String[] args) {
		getNum(1);
	}
	
	@Test
	public void subs1()
	{
		String s="Welcome";
		
		for(int i=0;i<s.length();i++)
		{
			String st=s.substring(0, i+1);
			System.out.println(st);
		}
	}
	@Test
	public void subs2()
	{
		String s="Welcome";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String st=s.substring(0, i+1);
				System.out.println(st);
				count++;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void fabi()
	{
		int num=10;
		int num1=0;
		int num2=1;
		int count=0;
		System.out.print(num1+" ");
		System.out.print(num2);
		System.out.print(" ");
		while(count<num)
		{
			
			int num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
			count++;
		}
	}
	
	@Test
	public void abb()
	{
		String s="susendran thirumuruga sundaram";
		String []s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i].substring(0, 1));
		}
	}
	
	@Test
	public void primeNum()
	{
		int n=30;
		
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
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
	public void browserName()
	{
		WebDriver driver=new ChromeDriver();
		Capabilities cap = ((RemoteWebDriver)driver).getCapabilities();
		String browser=cap.getBrowserName();
		String version=cap.getBrowserVersion();
		System.out.println(browser+"  "+version);
	}
	
	@Test
	public void countUpperLower()
	{
		String s="Hello World";
		int uc=0;
		int lc=0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				lc++;
			}
			else if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				uc++;
			}
		}
		System.out.println(uc+ " "+lc);
	}
	
	@Test
	public void upperToLower()
	{
		String s="Hello WeLcoMe tO wOrLd";
		char[] ch = s.toCharArray();
		String us="";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				us=us+ (char)(ch[i]+32);
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				us=us+ (char)(ch[i]-32);
			}
			else
				us=us+ch[i];
		}
		System.out.println(s);
		System.out.println(us);
	}
	
	@Test
	public void firstLetterUpperInEachWord()
	{
		String s="hello welcome to world";
		char []ch=s.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++)
		{
			
			if(i==0 || ch[i-1]==' '&&ch[i]!=' ')
			{
				res=res+(char)(ch[i]-32);
			}
			else
			{
				res=res+ch[i];
			}
			
		}
		System.out.println(s);
		System.out.println(res);
	}
	
	@Test
	public void firstLetterUpper()
	{
		String s="hello weLcoMe To woRld";
		char []ch=s.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++)
		{
			if(i==0)
			{
				res=res+(ch[i]-=32);
			}
			else if(ch[i]>='A'&&ch[i]<='Z')
				res=res+(ch[i]+=32);
			else
			{
				res=res+ch[i];
			}
			
		}
		System.out.println(s);
		System.out.println(res);
	}
	
	@Test
	public void removeEmptySpace()
	{
		String s="Hello    welcome    to  world";
		char []ch=s.toCharArray();
		String res="";
		for(int i=0;i<ch.length;)
		{
			while(i<ch.length&&ch[i]!=' ')
			{
				res=res+ch[i];
			}
			while(i<ch.length&&ch[i]==' ')
			{
				i++;
			}
			if(i<ch.length)
			{
				res=res+' ';
				break;
			}
		}
		System.out.println(s);
		System.out.println(res);
	}
}
	
