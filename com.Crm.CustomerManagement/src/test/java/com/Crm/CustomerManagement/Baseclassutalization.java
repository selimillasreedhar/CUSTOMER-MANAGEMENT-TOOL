package com.Crm.CustomerManagement;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Crm.CustomerManagementGenericlibrary.Baseclass;

import ObjectRepository.Homepage;

public class Baseclassutalization extends Baseclass {
	@Test
    public void test() {
		Homepage hp=new Homepage(driver);
		hp.getOrgelement().click();

       
    }

   
}



