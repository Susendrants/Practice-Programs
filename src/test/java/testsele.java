import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import java.io.IOException;

public class testsele {
@Test
public void tabControl()
{
	WebDriver driver= new EdgeDriver();
	String act="https://www.facebook.com/";
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.facebook.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.switchTo().newWindow(WindowType.TAB);
	Set<String> wid = driver.getWindowHandles();
	
	for(String w:wid)
	{
		String exp = driver.switchTo().window(w).getCurrentUrl();
		if(!act.equals(exp)	)
		{
			driver.close();
		}
	}
 }

@Test
public void taskmanager()
{
	 try {
         // Execute system command to open Task Manager
         Process process = Runtime.getRuntime().exec("taskmgr.exe");
         // Wait for the process to finish
         process.waitFor();
     } catch (IOException | InterruptedException e) {
         e.printStackTrace();
     }
}

@Test
public void closeManuallyOpenedBrowser() throws IOException
{
	Runtime.getRuntime().exec("taskkill /im chrome.exe /f /t");
	
}

@Test(invocationCount = 2,threadPoolSize = 2)
public void parallel()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebDriver driver1=new EdgeDriver();
	driver1.get("https://www.google.com");
}























}
