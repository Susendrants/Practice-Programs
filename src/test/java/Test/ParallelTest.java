package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {

    private WebDriver driver1;
    private WebDriver driver2;

    @BeforeClass
    public void setUp() {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver1 = new ChromeDriver();

        // Set up FirefoxDriver
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
        driver2 = new FirefoxDriver();
    }

    @Parameters({"url1", "url2"})
    @Test
    public void testMethod(String url1, String url2) {
        // Test logic for the first browser (driver1)
        driver1.get(url1);
        // Add your test steps for the first browser

        // Test logic for the second browser (driver2)
        driver2.get(url2);
        // Add your test steps for the second browser
    }

    @AfterClass
    public void tearDown() {
        // Close both browsers
        if (driver1 != null) {
            driver1.quit();
        }
        if (driver2 != null) {
            driver2.quit();
        }
    }
}
