package test;


import org.testng.Assert;
import org.testng.annotations.Test;


public class ClickTestProject extends BaseTest {

    @Test
    public void clickAndOpenTestProject() throws InterruptedException {

        homePage.clickAcceptCookieButton();
        homePage.clickTestProject();
        tutorialPage.closeAdd();
        tutorialPage.clickHomeButton();

        String homePageUrl = driver.getCurrentUrl();
        Assert.assertEquals(homePageUrl, "https://www.toolsqa.com/");

    }
}
