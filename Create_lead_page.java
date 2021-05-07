package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_lead_page {
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastnametbox;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companttbox;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]' and @class='crmButton small save']")
	private WebElement savebutton;
	
	public WebElement getLastnametbox() {
		return lastnametbox;
	}



	public WebElement getCompanttbox() {
		return companttbox;
	}



public WebElement getSavebutton() {
		return savebutton;
	}







	public Create_lead_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
}
