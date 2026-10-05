package com.Crm.CustomerManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Crm.CustomerManagementGenericlibrary.SaleniumUtility;

public class Scroll {
	@Test
	public void scroll() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		SaleniumUtility s=new SaleniumUtility();
	s.scroll(driver, 0, 5000);
	driver.quit();

	}
}
