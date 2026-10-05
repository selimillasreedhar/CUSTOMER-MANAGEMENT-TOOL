package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opportunitiespage {
	//@FindBy(xpath = "//a[text()='Opportunities']")private WebElement opportunities;
	@FindBy(xpath = "(//a[text()='Opportunities'])[1]")private WebElement Opportunities;
	@FindBy(xpath = "//img[@alt='Create Opportunity...']")private WebElement plueicon;
	@FindBy(name = "potentialname")private WebElement potentialname;
	@FindBy(name = "opportunity_type")private WebElement opportunity_type;
	@FindBy(name ="leadsource")private WebElement leadsource;
	@FindBy(name="amount")private WebElement amount;
	@FindBy(name="closingdate")private WebElement closingdate;
	@FindBy(name="sales_stage")private WebElement sales_stage;
	@FindBy(name="probability")private WebElement probability;
	@FindBy(name="description")private WebElement description;
	@FindBy(name="button")private WebElement savebutton;
	//@FindBy(name="(//input[@class='crmbutton small save'])[2]")private WebElement savebutton;
@FindBy(name="(//input[@class='crmbutton small cancel'])[2]")private WebElement cancelbutton;
public Opportunitiespage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getOpportunities() {
	return Opportunities;
}
public WebElement getOpportunity() {
	return getOpportunity();
}
public WebElement getPotentialname() {
	return potentialname;
}
public WebElement getOpportunity_type(WebElement type, String string) {
	return opportunity_type;
}
public WebElement getLeadsource() {
	return leadsource;
}
public WebElement getAmount() {
	return amount;
}
public WebElement getClosingdate() {
	return closingdate;
}
public WebElement getSales_stage() {
	return sales_stage;
}
public WebElement getProbability() {
	return probability;
}
public WebElement getDescription() {
	return description;
}
public WebElement getSavebutton() {
	return savebutton;
}
public WebElement getCancelbutton() {
	return cancelbutton;
}
public WebElement getplplueicon() {
	return plueicon;
	// TODO Auto-generated method stub
	
}
public void selectoptionbycontains(WebElement address, String string) {
	// TODO Auto-generated method stub
	
}

}