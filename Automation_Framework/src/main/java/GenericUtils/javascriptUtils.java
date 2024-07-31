package GenericUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class javascriptUtils {
	WebDriver driver;
	JavascriptExecutor js;
	public javascriptUtils(WebDriver driver) {
	this.driver=driver;
	js=(JavascriptExecutor)driver;
	
	
	}

}
