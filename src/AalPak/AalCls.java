package AalPak;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AalCls {

	@Test
	public void myMet4()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\SoftwareTesting\\geckodriver.exe");
	
		
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("http://www.yahoomail.com");
		
		driver.findElement(By.id("login-username")).sendKeys("noorali143");
		
		driver.findElement(By.id("login-signin")).sendKeys("Next");
		
		
	
		
		
		
	}
}
