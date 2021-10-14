package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import pages.HomePage;
import pages.TutorialPage;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    private String chromedriver = "webdriver.chrome.driver";
    private String chromePath = "C:\\Users\\Despotovski\\Desktop\\Chromedriver\\chromedriver.exe";
    protected HomePage homePage;
    protected TutorialPage tutorialPage;


    @BeforeClass
    public void setUp() {
        System.setProperty(chromedriver, chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        homePage = new HomePage(driver);
        tutorialPage = new TutorialPage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
