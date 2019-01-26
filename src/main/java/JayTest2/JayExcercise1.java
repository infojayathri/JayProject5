package JayTest2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;


public class JayExcercise1 {
WebDriver driver;
	
	@BeforeTest
		public void setup()
		{
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver","C:\\chromedrv\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/V4/");
		}

	@Test

		public void testSearch()
		{ 
			driver.findElement(By.name("uid")).sendKeys("mngr173567");
			driver.findElement(By.name("password")).sendKeys("zUzUhAt");
			driver.findElement(By.name("btnLogin")).click();
			//driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
			//NewCustomer Creation
			
			driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]")).click();
			driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
			driver.findElement(By.name("name")).sendKeys("Jayathri");
			driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")).click();
			driver.findElement(By.id("dob")).clear();
			driver.findElement(By.id("dob")).sendKeys("09/04/1990");
			driver.findElement(By.name("addr")).sendKeys("No 25");
			driver.findElement(By.name("city")).sendKeys("Nugegoda");
			driver.findElement(By.name("state")).sendKeys("Western");
			driver.findElement(By.name("pinno")).sendKeys("1990");
			driver.findElement(By.name("telephoneno")).sendKeys("0770713880");
			driver.findElement(By.name("emailid")).clear();
			driver.findElement(By.name("emailid")).sendKeys("0770713880");
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("jay4me");
			driver.findElement(By.name("sub")).click();
		}

	@AfterTest
		public void tearDown()
		{
			driver.close();
			driver.quit();
		}

}
