package Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NestedMap {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.nseindia.com/");
	
	Map<Integer,Map<String,String>> data = new HashMap<Integer, Map<String,String>>();
	
	Map<String,String>map= new LinkedHashMap<String,String>();
	
	List<WebElement> columnName = driver.findElements(By.xpath("//table[@id='tab1Ganier']/thead/tr"));
	List<WebElement> columnData = driver.findElements(By.xpath("//table[@id='tab1Ganier']/tbody/tr"));
    
	JavascriptExecutor jsc= (JavascriptExecutor)driver;
	jsc.executeScript("window.scrollBy(0,500)");
	
	
	for(int i=0;i<columnName.size();i++)
	{
		for(int j=0;j<columnData.size();j++)
		{
			map.put(columnName.get(i).getText(), columnData.get(j).getText());
			System.out.print(map);
		}
	}
	
	
	
	
	
	
	
	
}
}
