package testclasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericutil.Base;
import objectRepos.CreateNewOrgPage;
import objectRepos.Homepage;
import objectRepos.OrganizationInformationPage;
import objectRepos.OrganizationPage;

public class CreateAnyOrgTest extends Base {
	@Test
	public void TC1() throws Throwable {
		System.out.println("TC1 IS RUNNING");
		//CLICK ON ORG MODULE
		Homepage hp=new Homepage(driver);
		hp.clickonOrgLnk();
		//click on look up img
		OrganizationPage op=new OrganizationPage(driver);
		op.clickOnorglookupImg();
		//create new org
		CreateNewOrgPage  cnop=new CreateNewOrgPage(driver);
		cnop.createorganizationAndSaveit("TCs"+ju.getRandomNum());
		//create object of orginf page 
		Thread.sleep(8000);
		OrganizationInformationPage  oip=new  OrganizationInformationPage(driver);
		 String actText=oip.getTheTextOfOrgnization();
		 SoftAssert  s=new  SoftAssert();
		 s.assertTrue(actText.contains("TCS"));
		 System.out.println("TC IS PASSED,ORG IS CREATED");
		 s.assertAll();
		 
	}
	@Test
	public void TC2() {
		System.out.println("RUNNING TC2");
	}
	@Test
	public void TC3() {
		System.out.println("RUNNING TC3");
	}
	@Test
	public void TC4() {
		System.out.println("RUNNING TC4");
	}
}
