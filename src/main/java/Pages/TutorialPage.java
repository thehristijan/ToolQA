package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TutorialPage {

    final WebDriver driver;
    public WebDriverWait wait;

    @FindBy(css = ("a[class = 'fs-13 lh-26']"))
    WebElement homeMenuButton;
    @FindBy(css = "button[class = 'modal__close']")
    WebElement xButtonOnAdd;
    @FindBy (id = "accept-cookie-policy")
    WebElement acceptCookie;

    public TutorialPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,30);

    }

    public void clickHomeButton(){

        homeMenuButton.click();
    }

    public void closeAdd(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("advertisement-modal")));
        xButtonOnAdd.click();
    }

    public void clickAcceptCookieButton() {
        boolean cookieButton = driver.findElement(By.id("accept-cookie-policy")).isDisplayed();
        if (cookieButton == true){
        acceptCookie.click();}
        else{
            driver.close();
        }
    }
}
