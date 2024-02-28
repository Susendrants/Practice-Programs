package Debugging;

public class SumOfTwoNum {
	public static void main(String[] args) {
		System.out.println("start");
		int a=10;
		int b=20;
		int sum=0;
		sum=sum(a,b);
		System.out.println(sum);
		System.out.println("End");
	}
	
	public static int sum(int x,int y)
	{
		System.out.println("method start");
		int s=0;
		s=x+y;
		return s;
	}

}
