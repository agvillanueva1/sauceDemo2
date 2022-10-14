package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        driver.findElement(By.xpath("//nav/a[text()='Calendar']")).click();
        loginPage = new LoginPage(driver);
    }

    @Test(testName = "US301 Verify standard_user can login with right password")
    public void test01 (){
        System.out.println("Test");
    }

    @Test(testName = "US302 ")
    public void test02() {
    }
}
