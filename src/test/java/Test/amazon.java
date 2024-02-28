package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.amazon.in/s?k=iphone&ref=nb_sb_noss");
	List<WebElement> name = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
	List<WebElement> price = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
    for(int i=0;i<name.size();i++)
    {
    	String ip = name.get(i).getText();
    	String p= price.get(i).getText();
    	String mprice=p.replace(",","");
    	int pr=Integer.parseInt(mprice);
    	if(pr<=60000)
    	{
    		System.out.println(ip +"----"+ pr);
    	}
    	
    }
    driver.quit();


}
}
