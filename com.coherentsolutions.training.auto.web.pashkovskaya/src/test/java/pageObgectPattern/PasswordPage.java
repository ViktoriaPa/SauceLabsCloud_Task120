package pageObgectPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constans.LocatorsConstants.*;

public class PasswordPage {
    protected WebDriver driver;

    public PasswordPage(WebDriver driver){
        this.driver = driver;
    }
    public HomePage enterValidPassword(String password) {
        WebElement passwordField = driver.findElement(PASSWORD_FIELD);
        passwordField.sendKeys(password);

        WebElement loginButton = driver.findElement(LOGIN_BUTTON_ON_PASSWORD_PAGE);
        loginButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(USERNAME_ON_HOME_PAGE));

        return new HomePage(driver);
    }
}
