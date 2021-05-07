package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(xpath= "//input[@name='user_name']")
	private WebElement usernametxtfield;


	@FindBy(name = "user_password")
	private WebElement pwdtxbox;

	@FindBy(id="submitButton")
	private WebElement submitbtn;


	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	/*public void logintoApp(String username, String password)
	{
		usernametxtfield.sendKeys(username);
		pwdtxbox.sendKeys(password);
		submitbtn.click();
	}*/

	public WebElement getUsernametxtfield() {
		return usernametxtfield;
	}

	public WebElement getPwdtxbox() {
		return pwdtxbox;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	public void logintoApp(String username,String password)
	{
		usernametxtfield.sendKeys(username);
		pwdtxbox.sendKeys(password);
		submitbtn.click();
	}

}
