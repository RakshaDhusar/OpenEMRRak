package com.cyient.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cyient.page.LoginPage;

public class OpenEMR {
	
@Test(dataProvider = "validData")
	
	
public void validCredentialTest(String username,String password,String languageText,String expectedValue)
{
	 LoginPage login = new LoginPage(driver);
     login.sendUsername(username);
     login.sendPassword(password);
     login.setLanguageByText(languageText);
     login.clickOnLogin();

     DashboardPage dashboard = new DashboardPage(driver);
     String actualValue = dashboard.getDashboardPageTitle();
     Assert.assertEquals(actualValue, openEMR);

	}

}


