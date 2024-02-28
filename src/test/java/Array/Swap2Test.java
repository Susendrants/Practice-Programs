package Array;

public class Swap2Test {
	public static void main(String[] args) 
	{
		int a =10;
		int b=20;
		System.out.println("Before sorting a="+ a);
		System.out.println("Before sorting b="+ b);
		a=a+b; //30
		
		b=a-b; //10
		
		a=a-b; //30-10=20
		System.out.println("After sorting a="+ a);
		System.out.println("After sorting b="+ b);
		}

}
