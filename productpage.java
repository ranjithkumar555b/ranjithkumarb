package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productpage {
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement addimg;

	public void Productspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddimg() {
		return addimg;
	}

}
