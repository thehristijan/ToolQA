package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

        final WebDriver driver;
        public WebDriverWait wait;
        private String searchText = "Selenium";

        @FindBy(xpath = ("//a[text()='Test Project']"))
        WebElement testProject;
        @FindBy(xpath ="//div/div/div[3]/div/div[2]/form/input")
        WebElement searchBar;

    public HomePage(WebDriver driver) {
            this.driver = driver;
            wait = new WebDriverWait(driver,30);

        }

        public void clickTestProject(){

            testProject.click();
        }

        public void searchSelenium(){

            searchBar.sendKeys(searchText, Keys.ENTER);
        }

    }

