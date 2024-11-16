package genericutil;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtility {
	/**
	 * author K Reshma
	 * it is used to maximize browsers window
	 * @param driver
	 */
	public void maximizewindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * author K Reshma
	 * it is used to minimize browsers window
	 * @param driver
	 */
	public void minimizewindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	/**
	 * author K Reshma
	 * it is used for implicitly wait
	 * @param driver
	 */
	public void WaitForpageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	public void handleDD(WebElement element,int index) {
		Select  s=new  Select(element);
		s.selectByIndex(index);
	}
	public void handleDD(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
		}
	public void handleDD(String visibleText,WebElement element) {
		Select s=new Select(element);
		s.selectByVisibleText(visibleText);
		}
	public void mouseoverToElement(WebDriver driver,WebElement	 ele) {
		Actions a=new  Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	public void rightClickPage(WebDriver driver) {
		Actions  a=new  Actions(driver);
		a.contextClick();
	}
	public void rightClickonelement(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void doubleclickAction(WebDriver driver) {
		Actions a=new Actions(driver);
		a.doubleClick().perform();
   }
	public void dragAndDrop(WebDriver driver,WebElement src, WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest);
	}
	/**
	 * @author K Reshma
	 * it is used to handle frame
	 */
	public void switchtoParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	/**
	 * @author K Reshma
	 * it is used to handle frame
	 */
	public void switchtodefaultFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	/**
	 * @author K Reshma
	 * it is used to handle frame
	 */
	public void switchtoFrame(WebDriver driver,String idOrname) {
		driver.switchTo().frame(idOrname);
	}
	/**
	 * @author K Reshma
	 * it is used to handle the popup to click on ok button
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * @author K Reshma
	 * it is used to handle the popup to click on cancel button
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * @author K Reshma
	 * it is used to handle the popup to get the text on alert popup
	 */
	public void getTextOnAlert(WebDriver driver) {
		driver.switchTo().alert().getText();
	}
	/**
	 * author K Reshma
	 * it is used to handle the Scrolling mechanism
	 */
	public void handleScroll(WebDriver driver) {
		JavascriptExecutor  jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000);");
		}
	/**
	 * author K Reshma
	 * it is used to take the screenshot
	 * @throws Throwable 
	 */
	public String takeScreenshot(WebDriver driver,String SCNAME) throws Throwable {
		TakesScreenshot  ts=(TakesScreenshot)driver;
	File	src=ts.getScreenshotAs(OutputType.FILE);
	File    dest=new File("./"+SCNAME+"//png");
	Files.copy(src, dest);
	return dest.getAbsolutePath();
	}
	/**
	 * @author K Reshma
	 * it is used toget the title of the webpage
	 */
	public String  gettitleofwebpage(WebDriver driver) {
		return driver.getTitle();
	}
}
