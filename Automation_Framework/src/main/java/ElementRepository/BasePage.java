package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.BaseClass;

public class BasePage extends BaseClass{
	@FindBy(partialLinkText = "Register")
	private WebElement registerlink;
	
	@FindBy(partialLinkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(partialLinkText = "Shopping cart")
	private WebElement shoppingcartlink;
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement wishlistlink;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement Bookslink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computerlink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicslink;
	
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement apparelshoeslink;
	
	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement digitaldownloadslink;
	
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement  jewelrylink;
	
	
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftcardlink;
	
	@FindBy(partialLinkText = "Log out")
	private WebElement logoutlink;
	
	
	@FindBy(id="small-searchterms")
	private WebElement searchbox;
	
	@FindBy(xpath="//input[@value=\"Search\"]")
	private WebElement searchbutton;
	
	@FindBy(xpath="//img[@alt=\"Tricentis Demo Web Shop\"]")
	private WebElement logo;
	
	public WebElement getRegisterlink() {
		return registerlink;
	}




	public WebElement getLoginlink() {
		return loginlink;
	}




	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}




	public WebElement getWishlistlink() {
		return wishlistlink;
	}




	public WebElement getBookslink() {
		return Bookslink;
	}




	public WebElement getComputerlink() {
		return computerlink;
	}




	public WebElement getElectronicslink() {
		return electronicslink;
	}




	public WebElement getApparelshoeslink() {
		return apparelshoeslink;
	}




	public WebElement getDigitaldownloadslink() {
		return digitaldownloadslink;
	}




	public WebElement getJewelrylink() {
		return jewelrylink;
	}




	public WebElement getGiftcardlink() {
		return giftcardlink;
	}




	public WebElement getLogoutlink() {
		return logoutlink;
	}




	public WebElement getSearchbox() {
		return searchbox;
	}




	public WebElement getSearchbutton() {
		return searchbutton;
	}




	public WebElement getLogo() {
		return logo;
	}




	public WebElement getTricentis() {
		return tricentis;
	}




	public WebElement getNewslettertextbox() {
		return newslettertextbox;
	}




	@FindBy(partialLinkText = "Tricentis")
	private WebElement tricentis;
	
    @FindBy(id="newsletter-email")
    private WebElement newslettertextbox;
    
 


	public BasePage(WebDriver driver) {
		
	PageFactory.initElements(driver,this);
}
}
