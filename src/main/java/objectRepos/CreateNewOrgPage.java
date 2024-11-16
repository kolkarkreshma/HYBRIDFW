package objectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
	//Declations
	@FindBy(xpath="//input[@name=\"accountname\"]")private WebElement orgtext;
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")private WebElement saveBtn;
	//Initialization
	public CreateNewOrgPage(WebDriver  driver) {
		PageFactory.initElements(driver,this);
	}
	//getters
	public WebElement getOrgtext() {
		return orgtext;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	//Business Library
	public void createOrganization(String ORGNAME) {
		orgtext.sendKeys(ORGNAME);
		saveBtn.click();
		
		
	}
	public void createorganizationAndSaveit(int i) {
		// TODO Auto-generated method stub
		
	}
	public void createorganizationAndSaveit(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
