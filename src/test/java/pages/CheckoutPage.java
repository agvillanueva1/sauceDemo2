package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CheckoutPage extends BasePage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement addBikeLight;

    @FindBy(id = "shopping_cart_container")
    public WebElement cart;

    @FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
    public WebElement bikeLightItem;

    @FindBy(id = "first-name")
    public WebElement firstNameField;

    @FindBy(id = "last-name")
    public WebElement lastNameField;

    @FindBy(id = "postal-code")
    public WebElement zipcode;

    @FindBy(id = "checkout")
    public WebElement checkoutBtn;


}
