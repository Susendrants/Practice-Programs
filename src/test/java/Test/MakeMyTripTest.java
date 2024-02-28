package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MakeMyTripTest {
	@Test
	public void filterPrice() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(10000);
		Actions act =new Actions(driver);
		act.doubleClick().perform();
		driver.findElement(By.xpath("//input[@id=\"fromCity\"]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		driver.findElement(By.xpath("//input[@id=\"toCity\"]")).sendKeys("bangalore");
		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		driver.findElement(By.xpath("//div[text()='January 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='23']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class=\"bgProperties  overlayCrossIcon icon20\"]")).click();
		List<WebElement> names = driver.findElements(By.xpath("//p[@class=\"boldFont blackText airlineName\"]"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class=\"blackText fontSize18 blackFont white-space-no-wrap clusterViewPrice\"]"));
	
		
		for(int i=0;i<names.size();i++)
		{
			String Flightname = names.get(i).getText();
			String fprice = price.get(i).getText();
			String s=fprice.replaceAll("[^0-9]", "");
			int flightPrice=Integer.parseInt(s);
			if(flightPrice>6000)
			System.out.println(Flightname+"---"+flightPrice);
		}
	
	}

}
