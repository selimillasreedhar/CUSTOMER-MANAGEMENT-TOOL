package ObjectRepository;

	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class organizationpage {
	
		@FindBy (xpath = "(//a[text()='Organizations'] )[1]") private WebElement organization ;
		@FindBy(xpath = "//img[@alt='Create Organization...'] ")private WebElement plueicon ;
		@FindBy(name = "accountname") private WebElement Organizationname;
		@FindBy(name = "website") private WebElement website;
		@FindBy(name = "tickersymbol") private WebElement tickersymbol;
		@FindBy(name="account_name") private WebElement account_name;
		@FindBy(name="email2") private WebElement email;
		@FindBy(name="industry")private WebElement industry;
		@FindBy(name ="accounttype") private WebElement accounttype;
		@FindBy(name ="emailoptout") private WebElement emailoptout;
		
		@FindBy(name = "bill_street") private WebElement bill_street;
		@FindBy(name = "bill_city") private WebElement bill_city;
		@FindBy(name = "bill_state") private WebElement bill_state;
		@FindBy(name = "bill_country") private WebElement bill_country;
		
		@FindBy(id="phone")private WebElement phone;
		@FindBy(id="fax")private WebElement fax;
		@FindBy(id="otherphone")private WebElement otherphone;
		@FindBy(id="email1")private WebElement email1;
		@FindBy(id="ownership")private WebElement ownership;
		@FindBy(name="rating")private WebElement rating;
		@FindBy(name="siccode")private WebElement siccode;
		@FindBy(name="annual_revenue")private WebElement annual_revenue;
		@FindBy(name="notify_owner")private WebElement notify_owner;
		@FindBy(name="ship_street")private WebElement ship_street;
		@FindBy(name="ship_pobox")private WebElement ship_pobox;
		@FindBy(name="ship_state")private WebElement ship_state;
		@FindBy(name="ship_code")private WebElement ship_code;
		@FindBy(name="ship_country")private WebElement ship_country;
		@FindBy(name="description")private WebElement description;
		@FindBy(xpath ="(//input[@class='crmbutton small save'])[2]")private WebElement save;
		@FindBy(xpath = "//input[@value='Cancel']")private WebElement cancle ;
		
		public organizationpage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}

		public WebElement getOrganization() {
			return organization;
		}

		public WebElement getPlueicon() {
			return plueicon;
		}

		public WebElement getOrganizationname() {
			return Organizationname;
		}

		public WebElement getWebsite() {
			return website;
		}

		public WebElement getTickersymbol() {
			return tickersymbol;
		}

		public WebElement getAccount_name() {
			return account_name;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getIndustry() {
			return industry;
		}

		public WebElement getAccounttype() {
			return accounttype;
		}

		public WebElement getEmailoptout() {
			return emailoptout;
		}

		public WebElement getBill_street() {
			return bill_street;
		}

		public WebElement getBill_city() {
			return bill_city;
		}

		public WebElement getBill_state() {
			return bill_state;
		}

		public WebElement getBill_country() {
			return bill_country;
		}

		public WebElement getPhone() {
			return phone;
		}

		public WebElement getFax() {
			return fax;
		}

		public WebElement getOtherphone() {
			return otherphone;
		}

		public WebElement getEmail1() {
			return email1;
		}

		public WebElement getOwnership() {
			return ownership;
		}

		public WebElement getRating() {
			return rating;
		}

		public WebElement getSiccode() {
			return siccode;
		}

		public WebElement getAnnual_revenue() {
			return annual_revenue;
		}

		public WebElement getNotify_owner() {
			return notify_owner;
		}

		public WebElement getShip_street() {
			return ship_street;
		}

		public WebElement getShip_pobox() {
			return ship_pobox;
		}

		public WebElement getShip_state() {
			return ship_state;
		}

		public WebElement getShip_code() {
			return ship_code;
		}

		public WebElement getShip_country() {
			return ship_country;
		}

		public WebElement getDescription() {
			return description;
		}

		public WebElement getSave() {
			return save;
		}

		public WebElement getCancle() {
			return cancle;
		}

		
		
	
	}
