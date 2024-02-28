package String;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccuranceTest {

	@Test
	public void occuranceOfEachCharInString()
	{
		String s="Tester";
		String st=s.toLowerCase();
		for(int i=0;i<st.length();i++){
			int count=0;
			for(int j=0;j<st.length();j++){
				if(st.charAt(i)==st.charAt(j))
				{
					if(i>j)
					{
						break;
					}
					else {
						count++;
					}
				}
			}
			if(count>=1)
			{
				System.out.println(st.charAt(i)+" is occuring "+count+" times");
			}
		}
	}
	@Test
	public void uniqueCharectersinString()
	{
		String s="Tester";
		String st=s.toLowerCase();
		for(int i=0;i<st.length();i++) {
			int count=0;
			for(int j=0;j<st.length();j++) {
				if(st.charAt(i)==st.charAt(j))
				{
					if(i>j) {
						break;
					}else {
						count++;
					}
				}
			}
			if(count==1)
			{
				System.out.println(st.charAt(i)+" is the unique character");
			}
		}
	}
	@Test
	public void duplicateCharInString()
	{
		String s="Tester";
		String st=s.toLowerCase();
		for(int i=0;i<st.length();i++)
		{
			int count=0;
			for(int j=0;j<st.length();j++)
			{
				if (st.charAt(i)==st.charAt(j))
				{
					if(i>j)
					{
						break;
					}
					else {
						count++;
					}
				}
			}
			if(count>1)
			{
				System.out.println(st.charAt(i)+" is the duplicate character");
			}
		}
	}
	
@Test
public void occuranceUsingMap()
{
	String s="tester";
	LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	for(int i=0;i<s.length();i++)
	{
		if(map.containsKey(s.charAt(i)))
		{
			map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}
		else
		{
			map.put(s.charAt(i), 1);
		}
	}
	System.out.println(map);
	
}

@Test
public void duplicatesUsingMap()
{
	String s="tester";
	LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	for(int i=0;i<s.length();i++)
	{
		if(map.containsKey(s.charAt(i)))
		{
			map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}
		else
		{
			map.put(s.charAt(i), 1); 
		}
	}
	for(Entry<Character, Integer> m:map.entrySet())
	{
		if(m.getValue()>1)
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
	
@Test
public void uniqueCharUsingMap()
{
	String s ="tester";
	LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	for(int i=0;i<s.length();i++)
	{
	    if(map.containsKey(s.charAt(i)))
	    {
	    	map.put(s.charAt(i), map.get(s.charAt(i))+1);
	    }else
	    {
	    	map.put(s.charAt(i), 1);
	    }
	}
	for(Entry<Character, Integer> m:map.entrySet()) {
		if(m.getValue()==1)
		{
			System.out.println(m.getKey()+" is the unique character");
		}
	}
	
}
	
@Test
public void toremoveduplicatesSet()
{
	String d="tester";
	LinkedHashSet<Character> set = new LinkedHashSet<Character>(); 
	for(int i=0;i<d.length();i++)
	{
		set.add(d.charAt(i));
	}
	System.out.println(set);
}
	
@Test
public void occuranceAsig()
{
	int[]a= {5,4,4,2,5,4,2,1};
	
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
				}else
				{
					count++;
				}
			}
		}
		if(count>=1)
		{
			System.out.println(a[i]+"--occured---"+count);
		}
	}
}
	
	@Test
	public void UniqueAsig1()
	{
		int[]a= {5,4,4,2,5,4,2,1};
		
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
					}else
					{
						count++;
						
					}
				}
				
			}
			if(count==1)
			{
				System.out.println(a[i]+"--unique---"+count);
			}
		}
	}
	@Test
	public void DuplicatesAsig1()
	{
		int[]a= {5,4,4,2,5,4,2,1};
		
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
					}else
					{
						count++;
					}
				}
				
			}if(count>1)
			{
				System.out.println(a[i]+"---duplicate--"+count);
			}
		}
	}
	@Test
	public void occuranceStringAsi()
	{
		String s="hi hello hi hello welcome";
		String[] st=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			int count=0;
			for(int j=0;j<st.length;j++)
			{
				if(st[i].equals(st[j]))
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
			if(count>=1)
			{
				System.out.println(st[i]+"-----"+count);
			}
		}
	}
	
	@Test
	public void uniqueStringAsi()
	{
		String s="hi hello hi hello welcome";
		String[] st=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			int count=0;
			for(int j=0;j<st.length;j++)
			{
				if(st[i].equals(st[j]))
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
			if(count>1)
			{
				System.out.println(st[i]+"---duplicate--"+count);
			}
		}
	}
	@Test
	public void duplicatesStringAsi()
	{
		String s="hi hello hi hello welcome";
		String[] st=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			int count=0;
			for(int j=0;j<st.length;j++)
			{
				if(st[i].equals(st[j]))
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
				System.out.println(st[i]+"--unique---"+count);
			}
		}}
	
	
	
	
	@Test
	public void mapAss()
	{
		String s="hi hello hi hello welcome";
		String[] st=s.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
				
		for(int i=0;i<st.length;i++)
		{
			if(map.containsKey(st[i]))
			{
				map.put(st[i], map.get(st[i])+1);
			}
			else
			{
				map.put(st[i], 1);
			}
		}
		for(Entry<String, Integer> m:map.entrySet()) {
			if(m.getValue()==1)
			{
				System.out.println(m.getKey()+" is the unique character");
			}
		}
		for(Entry<String, Integer> m:map.entrySet()) {
			if(m.getValue()>=1)
			{
				System.out.println(m.getKey()+" is occuring "+m.getValue());
			}	
	}
	}
	
	
	@Test
	public void mapNum()
	{
		int[]st= {5,4,4,2,5,4,2,1};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<st.length;i++)
		{
			if(map.containsKey(st[i]))
			{
				map.put(st[i], map.get(st[i])+1);
			}
			else
			{
				map.put(st[i], 1);
			}
		}
		for(Entry<Integer, Integer> m:map.entrySet()) {
			if(m.getValue()==1)
			{
				System.out.println(m.getKey()+" is the unique character");
			}
		}
		for(Entry<Integer, Integer> m:map.entrySet()) {
			if(m.getValue()>=1)
			{
				System.out.println(m.getKey()+" is occuring "+m.getValue());
			}	
	}
		
	}     
	
	@Test
	public void removeDupliAsig()
	{
		int[]a= {5,4,4,2,5,4,2,1};
		 int[] b= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			//if(b[i]==0)
			{	
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==(a[j])) 
				{
					count++;
					if(count==1)
					{
						b[j]=a[j];
					}break;
				}
			}
		}
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=0)
			System.out.println(b[i]);
		}
	}	
	
	@Test
	public void numOcc()
	{
		int a=1213213;
		String s = Integer.toString(a);
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
		}
		for(Entry<Character,Integer>m:map.entrySet())
		{
			if(m.getValue()>=1)
			{
				System.out.println(m.getKey()+"--"+m.getValue());
			}
		}
		
	}
	
	@Test
	public void numOcca()
	{
		int a=121132;
		ArrayList<Integer> n=new ArrayList<Integer>();
		while(a>0)
		{
			int g=a%10;
			n.add(g);
			a=a/10;
		}
		for(int i=0;i<n.size();i++)
		{
			int c1=0;
			for(int j=0;j<n.size();j++)
			{
				if(n.get(i)==n.get(j))
				{
					if(i>j)
					{
						break;
					}else {
						c1++;
					}
				}
			}
			if(c1>=1)
			{
				System.out.println(n.get(i)+"--"+c1);
			}
		}
	}
}
