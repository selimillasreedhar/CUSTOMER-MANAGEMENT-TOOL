package com.Crm.CustomerManagementGenericlibrary;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import ObjectRepository.Homepage;
import ObjectRepository.Loginpage;

public class Baseclass {
	
	public static WebDriver driver;
	SaleniumUtility s=new SaleniumUtility();
	FileUtalityclass f=new FileUtalityclass();
@BeforeSuite
public void databaseconnection() {
	Reporter.log("database connected sucessfully",true);
}
@BeforeTest
public void  launchbrowser(@Optional("chrome")String Browser) throws IOException {
	if (Browser.equals("chrome")) {
		 driver=new ChromeDriver();
	} 
	else if (Browser.equals("firefox")) {
		 driver=new FirefoxDriver();
	}
	else if(Browser.equals("edge")) {
		 driver=new EdgeDriver();
	}
	else{
		driver=new ChromeDriver();

	}
	SaleniumUtility s=new SaleniumUtility();
	s.maximizeBrowser(driver);
	s.implicitwait(driver);

String url = f.readdatafromproperty("url");
s.navigatetoapplication(driver, url);
Reporter.log("browser launched and navigated to cmt application");
}
@BeforeMethod
public void logintocmt() throws IOException {
	///FileUtalityclass f=new FileUtalityclass();
	String un = f.readdatafromproperty("username");
	
	Loginpage lp=new Loginpage(driver);
	//lp.login(driver, un, pwd);
	lp.getUsernametbx().sendKeys(un);
	//driver.findElement(By.name("user_name")).sendKeys(un);
	String pwd = f.readdatafromproperty("password");
lp.getPasswordtbx().sendKeys(pwd);
	lp.getLogginbutton().click();
	//driver.findElement(By.name("user_password")).sendKeys(pwd);
	//driver.findElement(By.id("submitButton")).click();
	Reporter.log("logged in to cmt successfully",true);
}

@AfterMethod
public void logoutfromcmt() {
	WebElement element = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
//	Homepage hp=new Homepage(driver);
//	hp.logout(driver);
	Actions a=new Actions(driver);
	a.moveToElement(element).perform();
	//s.mouseover(driver,element);
	//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	//hp.getSignoutelement().click();
	Reporter.log("logged out successfully",true);
	
}
@AfterTest
public void closedBrowser() {
	driver.quit();
//	//s.closebrowser(driver);
Reporter.log("browser closed successfully",true);
}
@AfterSuite
public void disconnecteddatabase() {
	Reporter.log("databse disconnected successfully",true);
}

}
