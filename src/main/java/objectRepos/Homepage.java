package objectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutil.WebDriverUtility;

public class Homepage extends WebDriverUtility{
	//declaration
	@FindBy(xpath="//a[text()='Organizations']")private WebElement orglnk;
	@FindBy(xpath="//a[text()='Opportunities']")private WebElement oppolnk;
	@FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")private WebElement admImg;
	@FindBy(xpath="//a[text()='Sign Out']")private WebElement signoutlnk;
	//initiolization
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//getters
	public WebElement getOrglnk() {
		return orglnk;
	}
	public WebElement getOppolnk() {
		return oppolnk;
	}
	public WebElement getAdmImg() {
		return admImg;
	}
	public WebElement getSignoutlnk() {
		return signoutlnk;
	}
	//Business Library
	public void clickonOrgLnk() {
		orglnk.click();
	}
	public void clickOnOpportunitiesLnk() {
		oppolnk.click();
	}
	public void logOutApp(WebDriver driver) {
    mouseoverToElement(driver,admImg);
	signoutlnk.click();
	}
	

}
