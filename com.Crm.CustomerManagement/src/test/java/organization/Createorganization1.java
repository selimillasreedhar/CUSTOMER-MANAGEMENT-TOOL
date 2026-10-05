package organization;

import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Crm.CustomerManagementGenericlibrary.Baseclass;
import com.Crm.CustomerManagementGenericlibrary.FileUtalityclass;
import com.Crm.CustomerManagementGenericlibrary.Javautality;
import com.Crm.CustomerManagementGenericlibrary.Listenerimplementationclass;
import com.Crm.CustomerManagementGenericlibrary.SaleniumUtility;

import ObjectRepository.Homepage;
import ObjectRepository.organizationpage;


@Listeners(Listenerimplementationclass.class)
public class Createorganization1 extends Baseclass{
	SaleniumUtility s=new SaleniumUtility();
	Javautality j=new Javautality();
	@Test
	public void createorg() throws EncryptedDocumentException,IOException{
		//SaleniumUtility s=new SaleniumUtility();
//		Homepage hp=new  Homepage(driver);
//		hp.getOrgelement().click();
		organizationpage  op=new organizationpage(driver);
		op.getOrganization().click();
		op.getPlueicon().click();
		FileUtalityclass f=new FileUtalityclass();
	String orgname=f.readDatafromExcelStringData("orgData",1,1);
   //int random = j.generateRandomNumber(20);
	op.getOrganizationname().sendKeys(orgname);
	String email = f.readDatafromExcelStringData("orgData", 1, 2);
	op.getEmail().sendKeys( email);
	WebElement address = op.getIndustry();
	s.selectoptionbycontains(address, "Technology");
	WebElement type = op.getAccounttype();
	Select s1=new Select(type);
	s1.selectByContainsVisibleText("Competitor");
	String billingaddress = f.readDatafromExcelStringData("orgData", 1,3 );
	String billingstate = f.readDatafromExcelStringData("orgData", 1,4);
	String billcity = f.readDatafromExcelStringData("orgData", 1,5 );
	String shipcity = f.readDatafromExcelStringData("orgData", 1,6 );
	op.getBill_state().sendKeys(billingaddress);
	op.getBill_country().sendKeys(billingstate);
	op.getBill_city().sendKeys(billcity);
	op.getShip_state().sendKeys(shipcity);
	op.getSave().click();
	}
	@Test
	public void deleteorg() throws InterruptedException {
		Homepage hp=new Homepage(driver);
		hp.getOrgelement().click();
		Thread.sleep(8000);
		//driver.findElement(By.xpath("(//a[text()='Google'])[2]/parent::td/preceding-sibling::td/child::input")).click();
		//driver.findElement(By.xpath("//input[@class='crmbutton small delete']")).click();
		driver.findElement(By.id("selectCurrentPageRec")).click();
       driver.findElement(By.xpath("(//input[@class='crmbutton small delete'])[2]")).click();
		s.alertpopupforOk(driver);
	}
}



