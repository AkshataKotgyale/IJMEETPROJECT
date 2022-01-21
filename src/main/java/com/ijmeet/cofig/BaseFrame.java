package com.ijmeet.cofig;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static com.ijmeet.util.KeywordIjmeet.*;
public class BaseFrame {
	
	public static RemoteWebDriver driver;
	@BeforeMethod
	public static void loginURL() {
		verifyBrowser("chrome");
		//Config con=new Config();
		//con.getAppUrl();
		launchURL("https://www.ijmeet.com");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public static void tearDown() {
		//close();

	}
	

}
