package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Crm.CustomerManagementGenericlibrary.SaleniumUtility;

public class Homepage {
//declaration
	@FindBy(xpath="//img[@src=\\\"themes/softed/images/user.PNG\\\"]")
	private WebElement profilelement;
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutelement;
	@FindBy(xpath="//a[text()='Organizations']/parent::td[@class='tabUnSelected']")
	private WebElement orgelement;
	public Object getplusicon;
	//initialization
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//utilization
	}
	public WebElement getProfilelement() {
		return profilelement;
	}
	public WebElement getSignoutelement() {
		return signoutelement;
	}
	public WebElement getOrgelement() {
		return orgelement;
	}
	//business logic
	
	public void logout(WebDriver driver) {
		Homepage hp=new Homepage(driver);
		WebElement element = hp.getProfilelement();
		SaleniumUtility s=new SaleniumUtility();
		s.mouseover(driver, element);
		hp.getSignoutelement().click();
	}
	@FindBy(xpath = "//a[text()='Opportunities'])[2]")private WebElement clickontheopp;
	public WebElement getClickontheopp() {
		return clickontheopp;
	}
	
}
