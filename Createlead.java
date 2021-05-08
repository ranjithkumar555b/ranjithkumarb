package testscripts;

import org.testng.annotations.Test;

import Generic_Utilities.Base_class;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.Webdriverutility;
import objectrepo.Create_lead_page;
import objectrepo.Homepage;

public class Createlead extends Base_class {
	
	@Test
	public void createlead() throws Throwable
	{
	Homepage hp=new Homepage(driver);
	Create_lead_page cl=new Create_lead_page(driver);
	Excel_Utility excel=new Excel_Utility();
	Webdriverutility wlib=new Webdriverutility();
	
	hp.getLeads().click();
	hp.getCreateleadimg().click();
	
	String lname = excel.getdata("sheet1", 0, 0);
	
	cl.getLastnametbox().sendKeys(lname);
	
	String cname = excel.getdata("sheet1", 1, 0);
	cl.getCompanttbox().sendKeys(cname);
	
	cl.getSavebutton().click();
	}
}
