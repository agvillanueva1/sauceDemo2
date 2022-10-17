package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveFromCartPage extends BasePage {
    WebDriver driver;

    public RemoveFromCartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
    public WebElement item;

    @FindBy(id = "remove-sauce-labs-bike-light")
    public WebElement remove;

    @FindBy(xpath= "//a[@class='shopping_cart_link']")
    public WebElement cart;
}
