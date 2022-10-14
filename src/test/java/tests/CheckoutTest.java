package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckoutPage;

public class CheckoutTest extends BaseTest {

    private CheckoutPage checkoutPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        //driver.findElement(By.xpath("//nav/a[text()='Calendar']")).click();
        driver.get("https://www.saucedemo.com/checkout-step-one.html");
        checkoutPage = new CheckoutPage(driver);
    }

    @Test(testName = "US 308 - Checkout: Your Information")
    public void test01(){

        //check first name field is displayed
        Assert.assertTrue(checkoutPage.firstNameField.isDisplayed());

        //check last name field is displayed
        Assert.assertTrue(checkoutPage.lastNameField.isDisplayed());

        //check zip-code field is displayed
        Assert.assertTrue(checkoutPage.zipcode.isDisplayed());
    }

    @Test(testName = "US 309 - Add to cart")
    public void test02(){

        //add bike light to cart
        checkoutPage.addBikeLight.click();

        //click cart
        checkoutPage.cart.click();

        //compare text for bike light
        Assert.assertEquals(checkoutPage.bikeLightItem, "Sauce Labs Bike Light");
    }

}
