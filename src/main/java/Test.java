import org.testng.annotations.DataProvider;

public class Test {

	public static void main(String[] args) {
		int [] a= {2,3,0,0,5,0,8};
		int [] b= new int [a.length];
		int n=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[n]=a[i];
				n++;
			}
		}
		for(int c:b)
		{
			System.out.print(c);
		}
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj=new Object[2][1];
		
		obj[0][0]="susee";
		obj[0][1]="tamilnadu";
		
		obj[1][0]="aravind";
		obj[1][1]="bangalore";
		
		return obj;
	}
	
   @org.testng.annotations.Test(dataProvider = "data")
	public void execute(String name, String place)
	{
		System.out.println("Name :"+name);
		System.out.println("Place :"+place);
	}
	
}
