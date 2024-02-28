package Debugging;

public class withLoop {
public static void main(String[] args) {
	String s="india";
	String rev="";
	int sum=0;
	int a=10;
	int b=20;
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	sum=sum+a+b;
	System.out.println(sum);
	System.out.println(rev);
}
}
