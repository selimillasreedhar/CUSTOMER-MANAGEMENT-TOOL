package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//declaration
	@FindBy(name="user_name")
	private WebElement usernametbx;
	@FindBy(name="user_password")
	private WebElement passwordtbx;
	@FindBy(id="submitButton")
	private WebElement logginbutton;
	
	//initialization
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//utilization

	public WebElement getUsernametbx() {
		return usernametbx;
	}

	public WebElement getPasswordtbx() {
		return passwordtbx;
	}

	public WebElement getLogginbutton() {
		return logginbutton;
	}
	
	//business logic
	public void login(WebDriver driver,String username,String pw) {
		Loginpage lp=new Loginpage(driver);
		lp.getUsernametbx().sendKeys(pw);
		lp.getLogginbutton().click();
	}

}
