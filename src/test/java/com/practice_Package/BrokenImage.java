package com.practice_Package;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenImage {
	@Test
	public void bImage() throws IOException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://flipkart.com");
		List<WebElement> allImg = driver.findElements(By.xpath("//img"));
		ArrayList<String> list= new ArrayList<String>();
		for(WebElement imgs:allImg)
		{
			String im=imgs.getAttribute("src");
			int statuscode=0;
			try {
			URL url=new URL(im);
			HttpsURLConnection ur = (HttpsURLConnection)url.openConnection();
			 statuscode = ur.getResponseCode();
			if(statuscode>=400)
			{
				list.add(im);
				System.out.println(im+"---"+statuscode);
			}
			}
			catch (Exception e) {
				System.out.println(im+"---"+statuscode);
			}
			
		}
		
	}

}
