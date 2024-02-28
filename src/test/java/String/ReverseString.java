package String;

import org.testng.annotations.Test;

public class ReverseString {
	@Test
	public void reverse1()
	{
		String s="welcome";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}
	@Test
	public void reverse2()
	{
		String s="susee";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}
	@Test
	public void reverse3()
	{
		String s="susee";
		char[]st=s.toCharArray();
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.println(st[i]);
		}
	}
	@Test
	public void reverse4()
	{
		String s="susee";
		char[]st=s.toCharArray();
		int count=0;
		for(char c:st)
		{
			count++;
		}
		for(int i=count-1;i>=0;i--)
		{
			System.out.println(st[i]);
		}
	}
	
}
