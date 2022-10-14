package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MediaPage;

public class MediaTest extends BaseTest {
    private MediaPage page;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        page = new MediaPage(driver);
        page.usernameInput.sendKeys("standard_user");
        page.passwordInput.sendKeys("secret_sauce");
        page.loginBtn.click();
    }

    @Test(testName = "US 307 - Social media buttons. Verify there are 3 social media buttons are present: twitter, facebook and linkedIn")
    public void test01() {


        for (WebElement eachMedia : page.medias) {
            eachMedia.getText();
            Assert.assertTrue(eachMedia.isDisplayed());
        }
    }
}