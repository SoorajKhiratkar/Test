package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//input[@id='userid']") private WebElement userIdTextbox;
	@FindBy(xpath="//input[@id='password']") private WebElement passwordTextbox;
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement loginbtn;
	@FindBy(xpath="//img[@alt='Kite']") private WebElement kiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']") private WebElement zerodhalogo;
	@FindBy(xpath="//input[@id='pin']") private WebElement pinTextBox;
	@FindBy(xpath="//div[@class='form-header text-center']") private WebElement loginLabel;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueBtn;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginZerodhaApp() throws Throwable
	{
		//userIdTextbox.sendKeys(readExcelFile(0,1));
		userIdTextbox.sendKeys(readPropertyFile("userid"));
		//passwordTextbox.sendKeys(readExcelFile(0,2));
		passwordTextbox.sendKeys(readPropertyFile("password"));
		loginbtn.click();
		Thread.sleep(1000);
		//pinTextBox.sendKeys(readExcelFile(0,3));
		pinTextBox.sendKeys(readPropertyFile("pin"));
		continueBtn.click();

	}
	
	public String verifyAppTitle()
	{
		return driver.getTitle(); //title
	}
	
	public String verifyKiteLabel()
	{
		return loginLabel.getText();		
	}
	
	public boolean verifyKiteLogo()
	{
		return kiteLogo.isDisplayed();
	}
	public boolean verifyZerothaLogo()
	{
		return zerodhalogo.isDisplayed();
		
	}
	

}
