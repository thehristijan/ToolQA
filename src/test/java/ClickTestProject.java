import Pages.HomePage;
import Pages.TutorialPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ClickTestProject {


    private String chromedriver = "webdriver.chrome.driver";
    private String chromePath = "C:\\Users\\Despotovski\\Desktop\\Chromedriver\\chromedriver.exe";
    static WebDriver driver;

    @BeforeTest
    public void setUp() {

        System.setProperty(chromedriver, chromePath);
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/");
    }

    @Test
    public void searchSeleniumonHomePage()  {


        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        TutorialPage tutorialPage = PageFactory.initElements(driver, TutorialPage.class);

        tutorialPage.clickAcceptCookieButton();
        homePage.clickTestProject();
        tutorialPage.closeAdd();
        tutorialPage.clickHomeButton();

        String homePageUrl = driver.getCurrentUrl();
        Assert.assertEquals(homePageUrl, "https://www.toolsqa.com/");

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
