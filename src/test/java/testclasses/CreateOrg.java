package testclasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import genericutil.Base;
import objectRepos.CreateNewOrgPage;
import objectRepos.Homepage;
import objectRepos.OrganizationPage;

public class CreateOrg extends Base {
	@Test
	public void Createorganization()throws Throwable {
		//homepage click on org module
		Homepage  hp=new Homepage(driver);
		hp.clickonOrgLnk();
		//organization page
		OrganizationPage   op=new  OrganizationPage(driver);
		op.clickOnorglookupImg();
		//give org name
		CreateNewOrgPage   cnop=new CreateNewOrgPage(driver);
		cnop.createorganizationAndSaveit(eu.readDataFromExcel("sheet1",0,0)+ju.getRandomNum());
	}
}


