package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DifLoginPage;
import pages.MediaPage;

public class DifLoginTest extends BaseTest {
    private DifLoginPage page;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        page = new DifLoginPage(driver);
    }

    @Test(testName = "US 303 - When problem_user logs in all items on homepage should display same images")
    public void test02() {
        page.usernameField.sendKeys("problem_user");

        page.passwordField.sendKeys("secret_sauce");
        page.loginBtn.click();

        for (WebElement eachImage : page.images) {
            eachImage.getText();
            Assert.assertTrue(eachImage.isDisplayed());
        }
    }
}
