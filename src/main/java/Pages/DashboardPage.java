package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase{
	@FindBy(xpath="//span[text()='Suraj']") private WebElement nicknameLabel;
	@FindBy(xpath="//span[@class='user-id']") private WebElement userIdLabel;
	@FindBy(xpath="//span[text()='SR']") private WebElement usernameLabel;
	@FindBy(xpath="//div[@class='email']") private WebElement emailLabel;
	@FindBy(xpath="//span[@class='icon icon-exit']") private WebElement logoutLink;
	@FindBy(xpath="//a[@class='button button-blue']") private WebElement Activatebtn ;
	@FindBy(xpath="//div[@class='avatar']") private WebElement AvatarIcon;
	
	public DashboardPage()
	{
		PageFactory.initElements(driver,this);
		
	}
	public String verifyNickname()
	{
		return nicknameLabel.getText();	
	}
	public String verifyUserId()  
	{    
		AvatarIcon.click();
		return userIdLabel.getText();
	}
	
	public String verifyEmailId()  
	{
	  AvatarIcon.click();
	  return emailLabel.getText(); 
	}
	
	public String verifyUsername()  
	{
		AvatarIcon.click();
		return usernameLabel.getText();

	}
	
	public String verifyactivateBtnLabel() throws Throwable
	{
		Thread.sleep(1000);
		Activatebtn.click();
		return Activatebtn.getText();
	}
	
	

}
