package String;

import java.util.LinkedHashSet;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.testng.annotations.Test;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class AlphanumericalTest {
@Test
	public void segregateAlphaNumSpc()
	{
		String s="a1C$d3R%^";
		String alpha="";
		String num=" ";
		String spc=" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				alpha=alpha+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else
			{
				spc=spc+s.charAt(i);
			}
		}
		System.out.println(alpha+num+spc);
	}
	
@Test
public void printVowelsWithoutDuplicates()
{
	String s="india";
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
      int count=0;
	for(Character c:set)
	{
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		{
			count++;
			System.out.println(c);
		}
	}
	   System.out.println(count);
}

@Test
public void sumOfDigitsInAString()
{
	String s="a2b4c6";
	int sum=0;
	for(int i=0;i<s.length();i++)
	{   
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			int n=s.charAt(i)-48;   //since the ascii value of zero is 48
			sum=sum+n;
		}
	}
	System.out.println(sum);
}
@Test
public void sumOfCharInAString1()
{
	String s="a2b4c6";
	String sum="";
	for(int i=0;i<s.length();i++)
	{   
		if(s.charAt(i)>='a' && s.charAt(i)<='z')
		{
			char n=s.charAt(i); 
			        
			sum=sum+n;
		}
	}
	System.out.println(sum);
}
@Test
public void findMinLengthValuesInStringArray()
{
	String[] s= {"ab","abc","abcd","ef","edcf"};
	String minLength=s[0];
	for(int i=0;i<s.length;i++)
	{
		if(minLength.length()>s[i].length())
		{
			minLength=s[i];
		}
	}
	for(int i=0;i<s.length;i++)
	{
		if(minLength.length()==s[i].length())
		{
			System.out.println(s[i]+" ");
		}
	}
}
@Test
public void findMinLengthValuesInStringArray1()
{
	String[] s= {"12","123","1234","45","4567"};
	String minLength=s[0];
	for(int i=0;i<s.length;i++)
	{
		if(minLength.length()>s[i].length())
		{
			minLength=s[i];
		}
	}
	for(int i=0;i<s.length;i++)
	{
		if(minLength.length()==s[i].length())
		{
			System.out.println(s[i]);
		}
	}
}

@Test
public void reverse()
{
/*	String s="Aabb1235dd45ee1ff44";
	String[] st=s.split("[A-Za-z]");
	for(int i=st.length-1;i>=0;i--)
	{
		System.out.print(st[i]+" ");
	} */
	String s="Aabb1235dd45ee1ff44";
	String s1=s.replaceAll("[a-zA-Z]", ",");
	//System.out.println(s1);
	String []s2=s1.split(",");
	for(int i=s2.length-1;i>=0;i--)
	{
		if(s2[i]!="")
		{
			System.out.print(s2[i]+",");
		}
		
	}
	
	
}

@Test
public void eveTest()
{
	String s="aabbabc";     //a2b2a1b1c1
	int count=1;
	for(int i=0;i<s.length()-1;i++)
	{
		if(s.charAt(i)==s.charAt(i+1))
			{
			count++;
			}
		else
		{
			System.out.print(s.charAt(i)+""+count);
			count=1;
		}
	}
	System.out.print(s.charAt(s.length()-1)+""+count);
	
  }

@Test
public void eveTest1()
{
	String s="I LOVE TYSS";    //S SYTE VOLI
	String s1=s.replaceAll(" ", "");
//	int count=s1.length()-1;
	for(int i=0,j=s1.length()-1; i<s.length(); i++)
	//for(int i=0; i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		{
			System.out.print(s1.charAt(j--));
		}
		else
		{
			System.out.print(s.charAt(i));
		}
	}
}

@Test
public void eve2()
{
	String s="my$ na%me is$ %prak@sh";
	
	String []s1=s.split(" ");
	for(int i=0,j=s1.length; i<s.length();i++)
	{
		if(s.charAt(i)>='a' && s.charAt(i)<='z')
		{
			System.out.print(s1.charAt(j--));
		}
		else
		{
			System.out.print(s.charAt(i));
		}
	}
}

@Test
public void countVowels()
{
	String s="susendran";
	int cc=0;
	int vc=0;
	String vowel="";
	String consonents="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			vc++;
			vowel=vowel+s.charAt(i);
		}
		else
		{
			cc++;
			consonents=consonents+s.charAt(i);
		}
	}
	System.out.println(vowel);
	System.out.println("vowels count = "+vc);
	System.out.println("consonents count = "+cc);
	System.out.println(consonents);
}


@Test
public void spchar()
{
	String s="ab#$jjjh&s!";
    String s1 = s.replaceAll("[^a-zA-Z]", "");
    int count =s1.length()-1;
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='a'&&s.charAt(i)<='z')
		{
			System.out.print(s1.charAt(count--));
		}
		else
		{
			System.out.print(s.charAt(i));
		}
	}
}

@Test
public void spchar1()
{
	String s="dus@g%bb76*";
	String s1=s.replaceAll("[^a-zA-Z0-9]", "");
	
	int count=s1.length()-1;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='a'&&s.charAt(i)<='z' ||s.charAt(i)>='0'&&s.charAt(i)<='9')
		{
			System.out.print(s1.charAt(count--));
		}
		else
		{
			System.out.print(s.charAt(i));
		}
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


}
