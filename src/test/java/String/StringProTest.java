package String;

import java.util.Arrays;
import java.util.LinkedHashMap;

import org.testng.annotations.Test;

import com.google.protobuf.TextFormat.Parser;

public class StringProTest {
	@Test
	public void palindrome()
	{
		String s="malayalam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if (rev.equalsIgnoreCase(s))
		{
			System.out.println("The given string is palindrom");
		}
		else
		{
			System.out.println("The given string is not palindrom");
		}
	}
	/**
	 * Crazy question not given by sir;
	 */
	@Test
	public void reverseString()
	{
		String s="I am software engineer";
		String[] rs=s.split(" ");
		String l="";
		String rev="";
		for(int i=0;i<rs.length;i++)
		{
			if (i==rs.length-1)
			{
				l=rs[i];
			}
		}
		for(int i=0;i<rs.length;i++)
		{
			if (i==2)
			{
			String r=rs[i];
			for(int j=r.length()-1;j>=0;j--)
			{
				rev=rev+r.charAt(j);
			}
			}
		}
		System.out.println(l+" "+rev);
	}
	
	@Test
	public void reverseString1()	
	{
		String s="I am software engineer";
		String[] st=s.split(" ");
		for(int i=st.length-1;i>=0;i-- )
		{
			System.out.print(st[i]+" ");
		}
	}
	@Test
	public void reverseEachWordinString()
	{
		String s="I am software engineer";
		String[] st=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			//System.out.print(st[i]+" ");
			String str=st[i];
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}
	
	@Test
	public void swapFirstandLastWordinString()
	{
		String s="I am software engineer";
		String [] st=s.split(" ");
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]+" ");
		}
		
	}
	
	@Test
	public void printOnlyNum()
	{
		String s="Tekyon22wlcom44myn453kjm99";
		String[] sp = s.split("[a-zA-Z]");
		for(int i=sp.length-1;i>=0;i--)
		{
			if(sp[i]!="")
			{
				System.out.print(sp[i]+",");
			}
		}
	}
	
	@Test
	public void vowels()
	{
		String st=" This is teckyon private ltd";
		String s=st.toLowerCase();
		int vcount=0;
		int cc=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vcount++;
			}
			else if(s.charAt(i)!=' ')
			{
				cc++;
			}
		}
		System.out.println("The vowels count is "+vcount);
		System.out.println("The consonent count is "+cc);
	}
	
	@Test
	public void occ()
	{
		String s="abcdabsteueeys";
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
					}
					else {
						count++;
					}
				}
			}
			if(count>=1)
			{
				System.out.println(s.charAt(i)+" "+count);
			}
		}
	}
	
	@Test
	public void occMap()
	{
		String s="abcdabsteueeys";
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
	public void productOfNumInString()
	{
		String s="i a4m su4se7e ft67m in765dia";
		String[] st = s.split("[a-zA-Z]");
		int pro=1;
		for(int i=0;i<st.length;i++)
		{
			if(st[i].equals(""))
			{
				
			}else if(st[i].equals(" ")) {
				
			}
			else {
			//	System.out.print(st[i]+"*");
				if(st[i].length()>0)
				{
					int p= Integer.parseInt(st[i]);
					pro=pro*p;
				}
			}
			
		}
		System.out.println(" product ="+pro);
		
		
	}
	@Test
	public void increment()
	{
		String s="selenium";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}
	}
	
	
	@Test
	public void practice()
	{
	String s="aabcbbdeaa"; // aa ab bc bb  de ea aa
	
	for(int i=0;i<s.length()-1;i++)
	{
			if(s.charAt(i)==s.charAt(i+1))
			{
				System.out.print(s.charAt(i));
				System.out.print(s.charAt(i+1));
				
			}else
			{
				System.out.print(s.charAt(i));
				System.out.print(s.charAt(i+1));
				
			}
			System.out.print(" ");
		}

	}
	
	@Test
	public void swapEachWords ()
	{
		String s= "I am from bangalore";
		String[] st = s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			String tem=st[0];
			for(int j=1;j<st.length;j++)
			{
				st[j-1]=st[j];
				System.out.print(st[j]+" ");
			}
			st[st.length-1]=tem;
			System.out.println(st[st.length-1]);
			
		}
	}
	
	@Test
	public void anagram()
	{
		String s="amma";
		String s1="mama";
		char[] a = s.toCharArray();
		char[] b = s1.toCharArray();
		Arrays.sort(a);
	//	System.out.println(a);
		Arrays.sort(b);
	//	System.out.println(b);
		if(s.length()==s1.length())
		{
			if(Arrays.equals(a, b))
			{
				System.out.println("Its a anagram");
			}
			else {
				System.out.println("Its not a anagram");
			}
		}
		
	}
	
	@Test
	public void split123()
	{
		String s="tekion123";
		String[] st = s.split("[1-9]");
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		
	}
	
	@Test
	public void removeConsecutiveChar()
	{
		String s="abccdeffghh";
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
	
	}
