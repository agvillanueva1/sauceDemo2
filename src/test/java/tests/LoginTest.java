package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        //driver.findElement(By.xpath("//nav/a[text()='Calendar']")).click();
        loginPage = new LoginPage(driver);
    }

    @Test(testName = "US301: Verify standard_user can login with right password ")
    public void test01() {
        //Input correct username
        loginPage.usernameField.sendKeys("standard_user");

        //Input password
        loginPage.passwordField.sendKeys("secret_sauce");

        //Click login
        loginPage.loginBtn.click();

        //Verify user is logged in by checking shopping cart logo
        Assert.assertTrue(loginPage.shoppingCartLogo.isDisplayed());

    }

    @Test(testName = "US302: Error Message for 'locked_out_user' login attempt")
    public void test02(){
        //Input "locked_out_user" in username
        loginPage.usernameField.sendKeys("locked_out_user");

        //Input password
        loginPage.passwordField.sendKeys("secret_sauce");

        //Click login
        loginPage.loginBtn.click();

        //Verify error message is displayed
        Assert.assertTrue(loginPage.errorMsgForLockedOutUser.isDisplayed());



    }
}
