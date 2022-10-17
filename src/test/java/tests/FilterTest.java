package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FilterPage;
import pages.LoginPage;
import pages.RemoveFromCartPage;

public class FilterTest extends BaseTest {
    private FilterPage page;
    private LoginPage loginPage;
    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        page = new FilterPage(driver);
        loginPage = new LoginPage(driver);
        loginPage.usernameField.sendKeys("standard_user");
        loginPage.passwordField.sendKeys("secret_sauce");
        loginPage.loginBtn.click();
    }
    @Test(testName = "US 306 - Filter options. When user clicks the filter it should have following options: *Name(A to Z), *Name(Z to A), *Price(low to high), *Price(high to low)")
    public void test001(){

page.filter.click();

        for (WebElement eachOption: page.options){
            System.out.println(eachOption.getText());
            Assert.assertTrue(eachOption.isDisplayed());
        }

}}