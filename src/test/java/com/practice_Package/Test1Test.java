package com.practice_Package;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.realestate.GenericUtils.WebdriverUtils;

public class Test1Test {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		
		WebElement notify = driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']"));
		wait.until(ExpectedConditions.elementToBeClickable(notify));
		notify.click();
		Actions act=new Actions(driver);
		act.click();
	
		WebElement Flight = driver.findElement(By.xpath("//span[@class=\"chNavIcon appendBottom2 chSprite chFlights active\"]"));
		driver.findElement(By.xpath("//span[@class=\"chNavIcon appendBottom2 chSprite chHotels\"]")).click();
		WebElement Homes = driver.findElement(By.xpath("//span[@class=\"chNavIcon appendBottom2 chSprite chHomestays\"]"));
	
		//act.moveToElement(Flight).click().perform();
	//	act.moveToElement(Hotels).click().perform();
		
		
		}

}
