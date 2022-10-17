package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class FooterTest extends BaseTest {

    private LoginPage Page;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        Page = new LoginPage(driver);
    }

        @Test(testName = "Surapat305 - Test footer of the page")
        public void test305() {

            Page.usernameField.sendKeys("standard_user");
            Page.passwordField.sendKeys("secret_sauce");
            Page.loginBtn.click();

            String expected = "© 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
            String actual = Page.footerPage.getText();
            Assert.assertEquals(expected, actual);
        }
    }
