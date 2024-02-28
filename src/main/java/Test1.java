import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {

	@Test(dataProvider = "data")
	public void execute(String name, String place)
	{
		
			System.out.println("Name :"+name);
			System.out.println("Place :"+place);
		
	}
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="susee";
		obj[0][1]="tamilnadu";
		
		obj[1][0]="aravind";
		obj[1][1]="bangalore";
		
		return obj;
	}
}
