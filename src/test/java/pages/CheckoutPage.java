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

    @FindBy(id = "first-name")
    public WebElement firstNameTxt;

    @FindBy(id = "last-name")
    public WebElement lastNameTxt;

    @FindBy(id = "postal-code")
    public WebElement zipcode;

}
