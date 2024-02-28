package Test;



import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class skyscanner {
	
	
	@Test
	public void f() throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/flights/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//popup
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		
		//roundtrip
		driver.findElement(By.xpath("//p[@class='sc-gEvEer gpfTmR' and text()='Round-trip']")).click();
		
		//from
		  driver.findElement(By.xpath("//span[.='From']/following-sibling::p[.='Enter city or airport']")).click();
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("blr");
		 driver.findElement(By.xpath("//span[(text()='Bengaluru, India')]")).click();
		 
		 
		 //to
		 WebElement to = driver.findElement(By.xpath("//span[.='To']/following-sibling::p[.='Enter city or airport']"));
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOf(to));
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mum");
		 driver.findElement(By.xpath("//span[(text()='Mumbai, India')]")).click();
		 
		 

	//departure date
	driver.findElement(By.xpath("//div[.='January 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='16']")).click();
	Thread.sleep(2000);
	
	//return date column click
driver.findElement(By.xpath("//span[@class='fswFld_heading' and text()='Return']/following::p[@class='fswFld_title']")).click();
	
//returndate
	driver.findElement(By.xpath("//div[.='February 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='16']")).click();
	
	//nos click
	driver.findElement(By.xpath("//span[.='Done']")).click();
	
	//all click
		driver.findElement(By.xpath("//a[.='Done']")).click();
		
		//search flights
		driver.findElement(By.xpath("//span[.='SEARCH FLIGHTS']")).click();
		
		
		Thread.sleep(5000);
		
		
		//show results
		WebElement flightcount = driver.findElement(By.xpath("//div[@class='dF justifyBetween alignItemsCenter']/following::span[@class='greyCnt']"));
		
		String noOfFlights = flightcount.getText().replaceAll("[^0-9]", "");
		
		int Flights = Integer.parseInt(noOfFlights);
		System.out.println(Flights);
		ArrayList<Integer>al=new ArrayList<Integer>();
		Actions a=new Actions(driver);
	
		for(;;)
		{
		List<WebElement> flightPrices = driver.findElements(By.xpath("//span[@class='alignItemsCenter dF padT2 f600']"));
		if(Flights==flightPrices.size())
		{
			for(WebElement allpri:flightPrices)
			{
				String str = allpri.getText().replaceAll(",", "");
				int prices = Integer.parseInt(str);
				System.out.println(prices);
				al.add(prices);
				Thread.sleep(200);
				
			}
			break;
		}
			else
			{
				Thread.sleep(1000);
			a.sendKeys(Keys.PAGE_DOWN).perform();	
			}
		}
		
		Collections.sort(al);
		System.out.println("Least prices are "+al.get(0)+","+al.get(1)+","+al.get(2));
	}

}
