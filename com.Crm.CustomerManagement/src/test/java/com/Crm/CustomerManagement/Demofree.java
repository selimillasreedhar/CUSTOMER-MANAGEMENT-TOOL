package com.Crm.CustomerManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Crm.CustomerManagementGenericlibrary.Baseclass;
import com.Crm.CustomerManagementGenericlibrary.SaleniumUtility;

import ObjectRepository.Homepage;
import ObjectRepository.Loginpage;

public class Demofree extends Baseclass{
	@Test
	public void home() {
		Homepage hp=new Homepage(driver);
		hp.getOrgelement().click();
	}
	@Test
	public void login() {
		Loginpage lp=new Loginpage(driver);
		lp.getLogginbutton().click();
	}

}
