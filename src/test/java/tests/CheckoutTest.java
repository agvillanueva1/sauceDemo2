package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.LoginPage;

public class CheckoutTest extends BaseTest {

    private CheckoutPage checkoutPage;
    private LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        checkoutPage = new CheckoutPage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test(testName = "US 308 - Checkout: Your Information - Ketarin")
    public void test01(){

        //Input username
        loginPage.usernameField.sendKeys("standard_user");

        //Input password
        loginPage.passwordField.sendKeys("secret_sauce");

        //Click login
        loginPage.loginBtn.click();

        //click cart
        checkoutPage.cart.click();

        //click checkout button
        checkoutPage.checkoutBtn.click();

        //check first name field is displayed
        Assert.assertTrue(checkoutPage.firstNameField.isDisplayed());

        //check last name field is displayed
        Assert.assertTrue(checkoutPage.lastNameField.isDisplayed());

        //check zip-code field is displayed
        Assert.assertTrue(checkoutPage.zipcode.isDisplayed());
    }

    @Test(testName = "US 309 - Add to cart - Ketarin")
    public void test02(){

        //Input username
        loginPage.usernameField.sendKeys("standard_user");

        //Input password
        loginPage.passwordField.sendKeys("secret_sauce");

        //Click login
        loginPage.loginBtn.click();

        //add bike light to cart
        checkoutPage.addBikeLight.click();

        //click cart
        checkoutPage.cart.click();

        //compare text for bike light
        String expected = checkoutPage.bikeLightItem.getText();
        Assert.assertEquals(expected, "Sauce Labs Bike Light");
    }

}
