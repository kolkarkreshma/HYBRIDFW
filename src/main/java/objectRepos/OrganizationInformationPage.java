package objectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage {
//declaration
@FindBy(xpath="//span[@class=\"dvHeaderText\"]")private WebElement orgheadtxt;
//Initialization
public OrganizationInformationPage (WebDriver  driver) {
	PageFactory.initElements(driver, this);
	//getters
}
public WebElement getOrgheadtxt() {
	return orgheadtxt;
}
//Business Library
public String getTestoforg() {
	return orgheadtxt.getText();
}
public String getTheTextOfOrgnization() {
	// TODO Auto-generated method stub
	return null;
}
}
