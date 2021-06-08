package com.cyient.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
WebDriver driver;


 @BeforeMethod
 public void setup() {
	 
     String browser='ff';
     if(browser.equalsIgnoreCase("ie"));{
	 System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
     driver=new InternetExploreDriver();
 }else if(browser.equalsIgnoreCase("ie"));{
	 System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
     driver=new FireFoxDriver();
 }  else {
	 System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
     driver=new ChromeDriver();
 }
     
	 driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     
	driver.get("https://demo.openemr.io/b/openemr");
	
}

 public void end()
 
{
	driver.quit();
}
	
	@Test
    public void validCredentialTest()
    {
       
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        
   	 driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
   	driver.get("https://demo.openemr.io/b/openemr");
   	
   	
   	  driver.findElement(By.id("authUser")).sendKeys("admin");
   	    driver.findElement(By.id("clearPass")).sendKeys("pass");
   	
   	
   		Select selectlanguage= new Select(driver.findElement(By.name("languageChoice")));
   		selectlanguage.selectByVisibleText("English (Indian)");
   		driver.findElement(By.xpath("//button[@class='btn btn-login btn-lg']")).click();
   		
   		String actualValue=driver.findElement(By.xpath("//div[contains(text(),'Valid')]")).getText();
   		
   		Assert.assertEquals(actualValue, "Invalid username or password");
    }
	
	
	@Test
    public void invalidCredentialTest()
    {
       
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        
   	 driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
   	driver.get("https://demo.openemr.io/b/openemr");
   	
   	
   	  driver.findElement(By.id("authUser")).sendKeys("admin123");
   	    driver.findElement(By.id("clearPass")).sendKeys("pass234");
   	
   	
   		Select selectlanguage= new Select(driver.findElement(By.name("languageChoice")));
   		selectlanguage.selectByVisibleText("English (Indian)");
   		driver.findElement(By.xpath("//button[@class='btn btn-login btn-lg']")).click();
   		
   		String actualValue=driver.findElement(By.xpath("//div[contains(text(),'Invalid')]")).getText();
   		
   		Assert.assertEquals(actualValue, "Invalid username or password");
    }
	
	public void validateUIComponentTest()
    {
       
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        
   	 driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
   	driver.get("https://demo.openemr.io/b/openemr");
   	
   	driver.findElement(By.xpath("//button[@class='text-center lead font-weight-normal login-bg-text-color']")).click();
   	
   	String actualDescription=driver.findElement(By.xpath("//div[contains(text(),'Invalid')]")).getText();
   	Assert.assertEquals(actualValue, "Invalid username or password");
   	
   	
   	  
	
	
}
