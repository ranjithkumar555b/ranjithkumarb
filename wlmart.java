package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Generic_Utilities.Excel_Utility;
import Generic_Utilities.Webdriverutility;
import Generic_Utilities.tvname;

public class wlmart {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();
		Webdriverutility wlib = new Webdriverutility();
		wlib.implicit(driver);

		driver.get("https://www.walmart.com/");

		// to take sceenshot of homepage

		wlib.takescreenshot(driver, null);

		// to verify homepage

		String title = driver.getTitle();

		System.out.println(title);

		if (title.contains("Walmart.com | Save Money. Live Better.")) {
			System.out.println("validated");
		} else {
			System.out.println("not valid");
		}
		//to click on search dropdown
		WebElement arrow = driver.findElement(By.xpath(
				"//img[@src='//i5.walmartimages.com/dfw/63fd9f59-392b/48a699e6-5299-4b55-8895-28b7af730df3/v1/caret-down-black.5d3320ad009f3bcb0c940ed92c776cce3840db43.svg']"));
		wlib.waitforvisibleelement(driver, arrow);
		
		arrow.click();
		//to click on electronics
		WebElement electronics = driver.findElement(By.xpath("//button[@class='g_a p_a p_aw p_l p_b bf_c'and @data-catid='3944']"));
		wlib.waitforvisibleelement(driver, electronics);
		electronics.click();
		
		//to click on search image
		driver.findElement(By.xpath("//img[@src='//i5.walmartimages.com/dfw/63fd9f59-43e0/1ed7036a-feba-43ca-8885-1d937a9aa4f2/v1/search-nav-black.b92f68559cf70c3bcfb9eae1d8dcca59ca58af11.svg']")).click();
		//to click on tvs
	 WebElement tvs = driver.findElement(By.xpath("//img[@id='TVs']"));
	 wlib.waitforvisibleelement(driver, tvs);
	 tvs.click();
	  
	 
	String tvpage = driver.getTitle();
	 
	
	System.out.println(tvpage);
	//to validate  tvpage
	if(tvpage.contains("Electronics - Walmart.com"))
	{
		System.out.println("tvpage validated");
	}
	else {
		System.out.println("tvpage not validated");
	}
	//to take sceenshot for tv page
	wlib.takescreenshot(driver,null);
	//to click on 70 and larger screensize
	driver.findElement(By.xpath("//input[@id='70--&-Larger-0-tv_screen_size_range_new']")).click();
	
	//to click on first tv
	tvname tv=new tvname(driver);
	WebElement ele3 = tv.gettvname();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",ele3);
	
	
	     
     ele3.click();
     
     // to get text of first tv
     WebElement ele4 = driver.findElement(By.xpath("//h1[@content=\"onn. 70” Class 4K UHD (2160P) LED Roku Smart TV HDR (100012588)\"]"));
     String text3 = ele4.getText();
     System.out.println(text3);
   
     
          if(text3.contains("70"))
     {
    	System.out.println("size validated");
     }
     else {
    	System.out.println("size is more");
     }
          
          Excel_Utility excel=new Excel_Utility();
          excel.setdata("sheet1",1,1,text3);
          
         WebElement price = driver.findElement(By.xpath("//span[@itemprop='price']"));
        String pricevalue = price.getText();
        
        excel.setdata("sheet1", 2, 2, pricevalue);
        
      WebElement elee = driver.findElement(By.xpath("//select[@aria-label='Quantity']"));
      
      wlib.selectbyvisibletext("2", elee);
      
      // to click on add to cart
      
     WebElement addtocart = driver.findElement(By.xpath("//button[@data-tl-id=\"ProductPrimaryCTA-cta_add_to_cart_button\"]"));
      addtocart.click();
      
      //to verify the cart text
      
      WebElement carttv = driver.findElement(By.xpath("//a[.='onn. 70” Class 4K UHD (2160P) LED Roku Smart TV HDR (100012588)']"));
      String carttext = carttv.getText();
      System.out.println(carttext);

      String value3 = excel.getdata("sheet1", 1, 1);
      System.out.println(value3);

      if(value3.contains(carttext));
      {
      	System.out.println("same item added");
      }
      //to verify the price of 2 quantity
     WebElement ele11 = driver.findElement(By.xpath("//span[.='Subtotal']/../..//span[@class=\"Discount order-summary-price text-right\"]"));
      String subtotal = ele11.getText();
      System.out.println(subtotal);
      
      //to get only numbers from subtotal string
     String s = subtotal.substring(1, 6);
    char[] ch = s.toCharArray();
    
    String amt="";
    String spl_chars="";
    for(int i=0;i<ch.length;i++)
    {
    	if(ch[i]>='0'&&ch[i]<'9')
    	{
    		amt=amt+ch[i];
    	}
    	else {
    		spl_chars=spl_chars+ch[i];
    	}
    }
    // to covert amount in string to integer
   int displayedamount = Integer.parseInt(amt);
  String amtfor1 = excel.getdata("sheet1", 2, 2);
 int amtamt = Integer.parseInt(amtfor1);
 int calculatedamt=amtamt+amtamt;
 
 if(calculatedamt==displayedamount)
 {
	 System.out.println("subtotal is validated");
 }
 else {
	 System.out.println("subtotal not validated");
 }
 
 // to take sceenshot
 
 wlib.takescreenshot(driver, amt);
 
  
  // to validate success message afte adding to cart
WebElement success = driver.findElement(By.xpath("//h3[@class=\"Cart-PACModal-Heading\"]"));
String successtext = success.getText();
System.out.println(successtext);
      // to click on view cart
      
       WebElement viewcart = driver.findElement(By.xpath("//div[@class=\" Cart-PACModal-Body-right-rail Grid-col u-size-1 u-size-1-2-m u-size-1-2-l\"]//span[.='View cart']"));
      wlib.elementtobeclickable(driver, viewcart);
  	viewcart.click();
  	 
  	//to launch the google url
  	driver.get("https://www.google.com/");
  	 //to click on googleapps button
  	driver.findElement(By.xpath("//*[name()='svg' and @class='gb_Xe']")).click();
  	
  	// to click on youtube
  	WebElement ele20 = driver.findElement(By.xpath("//iframe[@role='presentation']"));
  	wlib.switchToFrame(driver, ele20);
  	
  	driver.findElement(By.xpath("//span[.='YouTube']")).click();
  	
  	driver.navigate().refresh();
  	// to send data to search text field in youtube
  	driver.findElement(By.xpath("//input[@id='search']")).sendKeys(text3);
  	
  	// to click on search button
  	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
  	
  	wlib.takescreenshot(driver, null);
  	
    	  
      }
         
	}


