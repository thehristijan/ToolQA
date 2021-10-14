package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

    public  WebDriver driver;
    public WebDriverWait wait ;
    private String searchText = "Selenium";

    By TestProject = By.xpath("//a[text()='Test Project']");
    By SearchBar = By.xpath("//div/div/div[3]/div/div[2]/form/input");
    By AcceptCookie = By.id("accept-cookie-policy");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,30);
    }

    public void clickTestProject(){

        wait.until(ExpectedConditions.elementToBeClickable(TestProject));
        driver.findElement(TestProject).click();

    }

    public void searchSelenium(){

        driver.findElement(SearchBar).sendKeys(searchText, Keys.ENTER);;
    }
    public void clickAcceptCookieButton() {
        boolean cookieButton = driver.findElement(By.id("accept-cookie-policy")).isDisplayed();
        if (cookieButton == true){
            wait.until(ExpectedConditions.elementToBeClickable(AcceptCookie));
            driver.findElement(AcceptCookie).click();}
        else{
            driver.close();
        }

    }
}
