package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement signoutimg;

@FindBy(xpath="//a[text()='Sign Out']")
private WebElement signoutbtn;

@FindBy(xpath="//a[text()='Products']")
private WebElement productlink;

@FindBy(xpath="//a[.='Leads' and @href='index.php?module=Leads&action=index']")
private WebElement leads;




@FindBy(xpath="//img[@alt='Create Lead...']")
private WebElement createleadimg;






public WebElement getLeads() {
	return leads;
}

public WebElement getProductlink() {
	return productlink;
}

public Homepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

public WebElement getSignoutimg() {
	return signoutimg;
}

public WebElement getSignoutbtn() {
	return signoutbtn;
}

public void logout()
{
waitforvisibleelement(driver, signoutimg);
	movetoexpectedelement(driver, signoutimg);
	signoutbtn.click();

}

private void movetoexpectedelement(WebDriver driver2, WebElement signoutimg2) {
	// TODO Auto-generated method stub
	
}

private void waitforvisibleelement(WebDriver driver2, WebElement signoutimg2) {
	// TODO Auto-generated method stub
	
}

}
