package genericutil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepos.Homepage;
import objectRepos.LoginPage;

public class Base {
	  //globally acces all utilities by creating cbject
	public WebDriverUtility wu=new WebDriverUtility();
	public PropertyFileUtil  pu=new PropertyFileUtil();
	public  JavaUtility  ju=new  JavaUtility();
	public  ExcelFileUtil  eu=new ExcelFileUtil();
	public WebDriver driver=null;//runtime Polymophism
	@BeforeSuite
	public void bsconfig() {
		System.out.println("=====DB CONNECTION=======");
	}
	@BeforeClass
	public void bcconfig() throws Throwable {//Launch browser and app
        String     BROWSER=pu.readDataFromPf("browser");
        	String		URL=pu.readDataFromPf("url");
        	System.out.println("Browser name is "+"  "+ BROWSER);
        	System.out.println("URL is "+"  "+URL);
        	if(BROWSER.equalsIgnoreCase("chrome")) {
        		driver=new ChromeDriver();
        		System.out.println(BROWSER+" "+"IS launching");
              }
        	else if(BROWSER.equalsIgnoreCase("edge")) {
        		driver=new EdgeDriver();
        		System.out.println(BROWSER+" "+"IS launching");
        		}
        	else {
        		System.out.println("BROWSER IS INVALID");
        	}
        	driver.get(URL);
        	System.out.println("browser is launched");
		}
	@BeforeMethod
	public void bmconfig() throws Throwable {//login to app
	String	UN=pu.readDataFromPf("un");
	String	PWD=pu.readDataFromPf("pwd");
	//login page object
	LoginPage lp=new LoginPage(driver);
	lp.loginToApp(UN, PWD);
	System.out.println("login is done successfully");
	}
	@AfterMethod
	public void amconfig() {
		//homepage object
		Homepage  hp=new Homepage(driver);
		hp.logOutApp(driver);
		System.out.println("logout is done successfully");
	}
	@AfterClass
	public void acconfig() {
		driver.quit();
		System.out.println("browser is closed");
	}
	@AfterSuite
	public void asconfig() {
		System.out.println("=====DB DISCONNECTION======");
	}
	

	}
	
	


