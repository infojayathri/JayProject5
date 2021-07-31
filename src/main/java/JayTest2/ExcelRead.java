package JayTest2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import pages.*;


public class ExcelRead {
WebDriver driver;
///ADD====
Login objLogin;
NewCustomer objNewcustomer;

///ADD====	
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
			///////ADD==============
			objLogin=new Login(driver);
			objLogin.loginToGuru99("mngr173567", "zUzUhAt");
			//////ADD======
			
			

			objNewcustomer =new NewCustomer(driver);
			objNewcustomer.NewCustomerToGuru99("Shehani","05/05/1990","No 35","Nugegoda","Western","123333","0770712250","infojglplh@gmail.com","jay4me");
	
		}

	@AfterTest
		public void tearDown()
		{
			driver.close();
			driver.quit();
		}

}
