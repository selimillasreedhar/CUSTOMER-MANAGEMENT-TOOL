package com.Crm.CustomerManagementGenericlibrary;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * @author Ravindra
 * this class is a generic class which is having generic methods for salenium
 */
public class SaleniumUtility {
	/**
	 * this method is the generic method used to maximize the browser
	 * @param driver
	 */
	public void maximizeBrowser(WebDriver d) {
		d.manage().window().maximize();
	}
	/**
	 * this method is a generic method used to wait for the element until it
	 * @param driver
	 */
public void implicitwait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
/**
 * this method is a generic method used to navigate to an application
 * @param driver
 * @param url
 */
public void navigatetoapplication(WebDriver driver,String url) {
	driver.get(url);
}
public void closebrowser(WebDriver driver) {
	driver.quit();
}
/**
 * this method is a generic method used to close the browser
 * @param driver
 * @param addres
 */

public void mouseover(WebDriver driver,WebElement addres) {
	Actions a=new Actions(driver);
	a.moveToElement(addres).perform();
}
public void rightclick(WebDriver driver,WebElement element) {
	Actions a=new Actions(driver);
	a.contextClick(element).perform();
}
public void Doubleclick(WebDriver driver,WebElement element) {
	Actions a=new Actions(driver);
	a.doubleClick(element).perform();
}
public void draganddrop(WebDriver driver,WebElement src,WebElement dest) {
	Actions a=new Actions(driver);
	a.dragAndDrop(src, dest).perform();
}
public void scroll(WebDriver driver,int xaxis,int yaxis) {
	JavascriptExecutor j=(JavascriptExecutor) driver;
	j.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
}
	/**
 * this method is generic method is used to handle mouse action
 * @param driver
 */

	public void selectoptionbycontains(WebElement address, String text) {
		Select s=new Select(address);
		s.selectByContainsVisibleText(text);
		// TODO Auto-generated method stub
		
	}
	public void alertpopupforOk(WebDriver driver) {
		Alert a=driver.switchTo().alert();
		a.accept();
		
	}
	public void alertpopupforcancel(WebDriver driver) {
		Alert a=driver.switchTo().alert();
		a.dismiss();
	}
		
	}
	
