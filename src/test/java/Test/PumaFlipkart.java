package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PumaFlipkart {
	@Test
	public void pumaShoes()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("puma");
		driver.findElement(By.xpath("//div[text()='in Men’s Sports Shoes']")).click();
	}

}
