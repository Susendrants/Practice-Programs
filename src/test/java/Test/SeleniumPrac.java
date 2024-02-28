package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumPrac {
	@Test
	public void dropdowm() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement dp = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select sel=new Select(dp);
		
		List<WebElement> date = sel.getOptions();
		
		
		for(WebElement d:date)
		{
			int count=0;
			String text = d.getText();
			count++;
			for(int i=0;i<=count;i++)
			{
				sel.selectByVisibleText(text);
			}
		}
	}

	public	WebDriver driver;
	public 	WebDriver driver1;
	@BeforeClass 
	public void browsers()
	{
		
	 driver= new ChromeDriver();
	 driver1= new FirefoxDriver();
	}
	
	@Test
	public void executeWithoutSuite()
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver1.get("https://www.facebook.com/");
	}
	
	
}
