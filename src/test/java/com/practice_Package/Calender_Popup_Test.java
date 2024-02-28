package com.practice_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class Calender_Popup_Test {
	public static void main(String[] args) {
		//launch the empty browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//trigger the url
		driver.get("https://www.ksrtc.in/");
		//click on Depature date
		WebElement jouneyDate = driver.findElement(By.id("txtJourneyDate"));
		jouneyDate.click();
		
		
		//select the date
		driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]/descendant::a[text()='7']")).click();
		
	}

}
