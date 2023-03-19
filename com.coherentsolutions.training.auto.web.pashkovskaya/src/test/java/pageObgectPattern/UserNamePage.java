package pageObgectPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constans.LocatorsConstants.*;


public class UserNamePage {
    protected WebDriver driver;

    public UserNamePage(WebDriver driver){
        this.driver = driver;
    }
    public PasswordPage enterValidUsername(String userName) {
        WebElement usernameField = driver.findElement(USERNAME_FIELD);
        usernameField.sendKeys(userName);

        WebElement submitUsername = driver.findElement(LOGIN_BUTTON_ON_USERNAME_PAGE);
        submitUsername.click();

        return new PasswordPage(driver);
    }
}
