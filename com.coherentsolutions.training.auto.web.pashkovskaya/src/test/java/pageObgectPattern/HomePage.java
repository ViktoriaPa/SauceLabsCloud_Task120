package pageObgectPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constans.LocatorsConstants.*;

public class HomePage {
    protected WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public String getMessageText() {
        return driver.findElement(USERNAME_ON_HOME_PAGE).getText();
    }
    public AuthorizationPage logOut(){
        WebElement userIcon = driver.findElement(USER_ICON);
        userIcon.click();

        WebElement logOutButton = driver.findElement(LOG_OUT_BUTTON);
        logOutButton.click();
        return new AuthorizationPage(driver);
    }
}
