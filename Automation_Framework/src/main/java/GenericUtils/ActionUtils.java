package GenericUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ActionUtils {

	Actions actions;

	public ActionUtils(WebDriver driver) {
		actions = new Actions(driver);
	}

	public void clickOnElement(WebElement ele) {
		actions.click(ele).perform();
	}

	public void passDataForElement(WebElement ele, CharSequence... data) {
		actions.sendKeys(ele, data).perform();

	}

	public void mouseOverOnElement(WebElement ele) {
		actions.moveToElement(ele).perform();

	}

	public void doubleClickOnElement(WebElement ele) {
		actions.doubleClick(ele).perform();
	}

	public void rightClickOnElement(WebElement ele) {
		actions.contextClick(ele).perform();
	}

	public void dragAndDropElememt(WebElement src, WebElement dest) {
		actions.dragAndDrop(src, dest).perform();
	}

	public void dragAndDropElementByOffset(WebElement ele, int XOffset, int YOffset) {
		actions.dragAndDropBy(ele, XOffset, YOffset);
	}

	public void scrollBasedOnAxis(int XOffset, int YOffset) {
		actions.scrollByAmount(XOffset, YOffset);

	}

	public void scrollUntilElementIsVisible(WebElement ele) {
		actions.scrollToElement(ele).perform();

	}

	public void scrollUntilElementVisible(WebElement ele, int XOffset, int YOffset) {
		ScrollOrigin origin = ScrollOrigin.fromElement(ele);
		actions.scrollFromOrigin(origin, XOffset, YOffset).perform();

	}

}
