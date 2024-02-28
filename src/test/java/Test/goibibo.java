package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class goibibo {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://www.goibibo.com/");
	driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
	WebElement from = driver.findElement(By.xpath("//span[text()='From']/parent::div"));
	from.click();
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bangalore");
	driver.findElement(By.xpath("//span[text()='Bengaluru, India']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bhopal");
	driver.findElement(By.xpath("//span[text()='Bhopal, India']")).click();
	driver.findElement(By.xpath("//div[text()='February 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='27']")).click();
    driver.findElement(By.xpath("//span[text()='Done']")).click();
    driver.findElement(By.xpath("//a[text()='Done']")).click();
	
	driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
//	Thread.sleep(25000);
	List<WebElement> fl = driver.findElements(By.xpath("//span[@class='font14 padL5']"));
//	List<WebElement> price = driver.findElements(By.xpath("//div[@class='srp-card-uistyles__Price-sc-3flq99-17 kxwFaC alignItemsCenter dF f600']"));
   List<WebElement> nw = driver.findElements(By.xpath("//div[@class='srp-card-uistyles__Price-sc-3flq99-17 kxwFaC alignItemsCenter dF f600']"));
 
	// morelinks
	JavascriptExecutor js = (JavascriptExecutor) driver;
	// PriceFetching
	WebElement moreLinks = driver.findElement(By.xpath("//li[text()='more links']"));
	int y = moreLinks.getLocation().getY();

	for (int i = 1; i <= y; i++) {
		js.executeScript("window.scrollBy(0," + i + ")");
		//System.out.println(i);

	}
   
/*   WebElement lastele = driver.findElement(By.xpath(""));
   JavascriptExecutor jsc=(JavascriptExecutor)driver;
      jsc.executeScript("argument[0].scrollIntoView()",lastele);  */
  	for(int i=0;i<nw.size();i++)
	{
  		
		String flight = fl.get(i).getText();
		String sp=nw.get(i).getText();
		String low = sp.replaceAll(",", "");
		int lp=Integer.parseInt(low);
		if(lp<11500) {
		System.out.println(flight+"----"+lp);
		}
	}
}
}