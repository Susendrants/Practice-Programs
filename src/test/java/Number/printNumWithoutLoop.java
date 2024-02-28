package Number;

public class printNumWithoutLoop {
	
	public static void main(String[] args) {
		printnum(1);
	}
   
	public static void printnum(int e)
	{
		if(e>5)
		{
			return;
		}
		else
		{
			System.out.println(e);
			e++;
			printnum(e);
			return;
			
		}
		
	}
}
