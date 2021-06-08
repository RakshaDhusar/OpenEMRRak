package com.cyient.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launch {
	
	public static void main(String[] args)   {
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.royalcaribbean.com/");
		
		
		  
			driver.findElement(By.xpath("////nav[@class='headerTopNav__menu']//span[contains(text(),'Sign In')]']")).click();
			
			/*Actions action= new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//div[text()='Patient/Client']"))).perform();*/
		
			
		 
			/*driver.findElement(By.xpath("//div[text()='Patients']")).click();*/
			
			
			driver.findElement((By.xpath("//input[@id='mat-input-0']")));
			driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c47-6']"));
			driver.findElement(By.xpath("//span[@class='login__bottom-container__checkbox__text']"));
			
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			
			

	}
		

}
