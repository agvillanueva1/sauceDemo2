package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {

    HomePage page;

    @BeforeMethod
    public void setUp() {

        page = new HomePage(driver);
    }

    @Test(testName = "sample")
    public void test01 (){
        System.out.println("Test");
    }
}