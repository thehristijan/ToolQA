package test;

import org.testng.annotations.*;


import static org.testng.AssertJUnit.assertTrue;

public class SearchSelenium extends BaseTest {

    @Test
    public void searchSeleniumOnHomePage() {

        homePage.searchSelenium();
        String seleniumText = driver.getTitle();
        assertTrue(seleniumText.contains("Selenium"));

    }
}

