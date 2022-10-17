package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MediaPage;
import pages.RemoveFromCartPage;

public class RemoveFromCartTest extends BaseTest {
    private RemoveFromCartPage page;
    private LoginPage loginPage;
    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        page = new RemoveFromCartPage(driver);
        loginPage = new LoginPage(driver);
        loginPage.usernameField.sendKeys("standard_user");
        loginPage.passwordField.sendKeys("secret_sauce");
        loginPage.loginBtn.click();
    }
    @Test(testName = "US 310 - Remove from cart")
    public void test001(){
        page.addToCartBtn.click();
        // checking if the item in the cart
        Assert.assertEquals(page.cart.isEnabled(), page.item.isDisplayed());
       page.remove.click();
       //after removing checking if item is there
      Assert.assertFalse(page.cart.getText().contains(page.item.getText()));
    }
}