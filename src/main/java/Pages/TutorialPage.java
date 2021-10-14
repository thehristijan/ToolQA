package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TutorialPage {

    public WebDriver driver;
    public WebDriverWait wait;

    By HomeMenuButton = By.cssSelector("a[class = 'fs-13 lh-26']");
    By XButtonOnAdd = By.cssSelector("button[class = 'modal__close']");


    public TutorialPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,30);
    }

    public void clickHomeButton(){

        driver.findElement(HomeMenuButton).click();
    }

    public void closeAdd(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("advertisement-modal")));
        driver.findElement(XButtonOnAdd).click();

    }
}
