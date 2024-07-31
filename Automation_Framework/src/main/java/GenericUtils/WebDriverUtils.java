package GenericUtils;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverUtils {

	WebDriver driver;

	public WebDriverUtils(WebDriver driver) {

		this.driver = driver;

	}

	public void switchToWindowBasedOnTitle(String title) {

		Set<String> allWindowIds = driver.getWindowHandles();
		for (String windowId : allWindowIds) {
			driver.switchTo().window(windowId);

			if (driver.getTitle().equals(title))
				;
			{
				break;
			}

		}
	}

	public void switchToWindowBasedOnUrl(String url) {

		Set<String> allWindowIds = driver.getWindowHandles();
		for (String windowId : allWindowIds) {
			driver.switchTo().window(windowId);

			if (driver.getCurrentUrl().equals(url))
				;
			{
				break;
			}
		}
	}

	public void switchToAlertAndClickOnOk() {

		driver.switchTo().alert().accept();

	}

	public void switchToAlertAndClickOnCancel() {
		driver.switchTo().alert().dismiss();

	}

	public String getAlertText() {
		return driver.switchTo().alert().getText();
	}

	public void passValueAlertTextBox(String data) {
		driver.switchTo().alert().sendKeys(data);
	}

	public void switchToFrame(int index) {
		driver.switchTo().frame(index);

	}

	public void switchToFrame(String nameOrid) {
		driver.switchTo().frame(nameOrid);

	}

	public void switchToFrame(WebElement ele) {

		driver.switchTo().frame(ele);
	}

	public void switchToParentFrame() {
		driver.switchTo().parentFrame();

	}

	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();

	}

}
