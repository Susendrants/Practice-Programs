package Test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class IRCTCTest {
	
	@Test
	public void bookBusTicket()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
		
		String expt="https://www.bus.irctc.co.in/home";
		
		Set<String> listOfPages = driver.getWindowHandles();
		for(String bus:listOfPages)
		{
			String busTitle = driver.switchTo().window(bus).getCurrentUrl();
			if(busTitle.equals(expt))
			{
				driver.switchTo().window(bus);
			}
		}
		
		WebElement dept = driver.findElement(By.xpath("//input[@id='departFrom']"));
		dept.sendKeys("Bengaluru");
		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click(); 
		WebElement goingTo = driver.findElement(By.xpath("//input[@id='goingTo']"));
		goingTo.sendKeys("Hyderabad Airport");
		driver.findElement(By.xpath("//div[text()='Hyderabad Airport']")).click();
		driver.findElement(By.xpath("//input[@id=\"departDate\"]")).click();
		driver.findElement(By.xpath("//a[text()='23']")).click();
		driver.findElement(By.xpath("//button[text()='Search Bus ']")).click();
		
		//Sorting the time
		driver.findElement(By.xpath("//div[@class='heading-02-wrap' and contains(.,'Departure Time')]/descendant::label[text()='After 6 pm']")).click();
		
		driver.findElement(By.xpath("//div[@class=\"col-md-9 col-lg-10\" and contains(.,'Sri Krishna Travels')]//descendant::button[text()='Select Seat'][1]")).click();
		
		driver.findElement(By.xpath("//span[@class='Sleeper_V']")).click();
		
		driver.findElement(By.xpath("//table[@class=\"table table-bordered mb-0 Boarding_table\"]/tbody/tr[contains(.,' Kalasipalya ')]/td[1]/child::input")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed to Book']")).click();
		
		
		//Login to IRCTC
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("susee2694");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Susee2694*");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
		
	}

}
