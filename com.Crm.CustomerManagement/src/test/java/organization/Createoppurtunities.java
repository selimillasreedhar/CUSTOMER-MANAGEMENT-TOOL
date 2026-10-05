package organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Crm.CustomerManagementGenericlibrary.Baseclass;
import com.Crm.CustomerManagementGenericlibrary.FileUtalityclass;
import com.Crm.CustomerManagementGenericlibrary.Listenerimplementationclass;
import com.Crm.CustomerManagementGenericlibrary.SaleniumUtility;

import ObjectRepository.Opportunitiespage;
@Listeners(Listenerimplementationclass.class)
public class Createoppurtunities extends Baseclass{
	SaleniumUtility s=new SaleniumUtility();
	FileUtalityclass f=new FileUtalityclass();
	@Test
	public void createopp() throws EncryptedDocumentException, IOException {
		Opportunitiespage op=new Opportunitiespage(driver);
		op.getOpportunities().click();
		op.getplplueicon().click();
		WebElement address=op.getOpportunities();
		op.selectoptionbycontains(address, "New Business");
		WebElement source=op.getLeadsource();
		Select s2=new Select(source);
		s2.selectByContainsVisibleText("Self Generated");
		String oppname = f.readDatafromExcelStringData("oppdata", 1, 1);
	String oppamt = f.readDatafromExcelStringData("oppdata", 1, 2);
	String oppdate = f.readDatafromExcelStringData("oppdata", 1, 3);
	String oppprblt = f.readDatafromExcelStringData("oppdata", 1, 4);
	String oppdesc = f.readDatafromExcelStringData("oppdata", 1, 5);
	op.getOpportunity().sendKeys(oppname);
	op.getAmount().sendKeys(oppamt);
	op.getDescription().sendKeys(oppdesc);
	op.getProbability().sendKeys(oppprblt);
	op.getClosingdate().sendKeys(oppdate);
	op.getSavebutton().click();
	}

}
