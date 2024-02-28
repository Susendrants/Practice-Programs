package Test;

import java.util.HashSet;

public class Substringpro {
public static int longestString(String s)
{
	int maxcount=0;
	int len=s.length();
	int i=0;
	int j=0;
	HashSet se=new HashSet();
	  while(i<len && j< len)
		{
			if(!se.contains(s.charAt(j)))
			{
				se.add(s.charAt(j));
				j++;
				maxcount=Math.max(maxcount, j-i);
			}else
			{
				se.remove(s.charAt(i));
				i++;
			}
		}
	
	return maxcount;
}
public static void main(String[] args) {
	String s="GeeksForGeeks";
	 int l= longestString(s);
	 System.out.println(l +" is the longest substring");
}
}
