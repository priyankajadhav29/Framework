package GenericUtils;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ElementRepository.BasePage;
import ElementRepository.LoginPage;

public class BaseClass1 implements IAutoConstants,ITestListener {

	public static WebDriver driver ;
	public FileLibrary flib;
	public BasePage bp;
	public LoginPage lp;
	
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("before suite", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("before test", true);

	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("after suite", true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("after test", true);
	}

	@Parameters("bname")
	@BeforeClass
	public void launchBrowser(@Optional("chrome") String browsername) {
		Reporter.log("before class", true);
		if (browsername.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browsername.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (browsername.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		    lp = new LoginPage(driver);
		    flib = new FileLibrary();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitTimeOut));
	}

	@AfterClass
	public void tearDownBrowser() {
		Reporter.log("after class", true);
		driver.close();
		driver.quit();
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("after method", true);

	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("before method", true);
		driver.get(flib.fetchDataFromProperties(PropertyFilePath, "url"));
		lp.getLoginlink().click();
		lp.getEmailtextBox().sendKeys(flib.fetchDataFromProperties(PropertyFilePath, "email"));
		lp.getPasswordTextBox().sendKeys(flib.fetchDataFromProperties(PropertyFilePath, "password"));
		lp.getLoginButton();
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("[Testcase --"+result.getName()+"-- is started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("[Testcase --"+result.getName()+"-- is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("[Testcase --"+result.getName()+"-- is failed");
		LocalDateTime ldt =LocalDateTime.now();
		String time=ldt.toString().replace(":", "-");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(screenshotPath1 +"screenshot1.png");
		try {
			FileHandler.copy(src, dest);	
		}
	     catch (Exception e) {
			
		}
		
	}

	@Override 
	public void onTestSkipped(ITestResult result) {
		Reporter.log("[Testcase --"+result.getName()+"-- is skipped");
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("[ <test> --"+context.getName()+"----is started");
	
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("[ <test> --"+context.getName()+"----is finished");
		
			
	}
	


}
