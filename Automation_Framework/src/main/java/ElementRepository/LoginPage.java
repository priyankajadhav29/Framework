package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "Email")
	private WebElement emailtextBox;
	
	@FindBy(id = "Password")
	private WebElement passwordTextBox;
	
	@FindBy(id="RememberMe")
	private WebElement rememberMeCheckBox;
	
	@FindBy(partialLinkText = "Forgot password?")
	private WebElement forgotPasswordLink;	
	
	@FindBy(xpath = "//input[@value=\"Log in\"]")
	private WebElement loginButton;
	
	
	public WebElement getEmailtextBox() {
		return emailtextBox;
	}
	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}
	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}
	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}	
	

}
