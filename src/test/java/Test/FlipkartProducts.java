package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProducts {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).sendKeys("Iphone 14");
	driver.findElement(By.xpath("//button[@aria-label=\"Search for Products, Brands and More\"]")).click();
	
	List<WebElement> name = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
	  for(WebElement names:name)
	  {
		String iphone= names.getText();
		System.out.println(iphone);
	  }
	
}
}
