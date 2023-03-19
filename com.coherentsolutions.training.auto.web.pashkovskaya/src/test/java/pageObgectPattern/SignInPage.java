package pageObgectPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constans.LocatorsConstants.*;

public class SignInPage {
    protected WebDriver driver;

    public SignInPage(WebDriver driver){
        this.driver = driver;
    }
    public UserNamePage openUserNamePage() {
        WebElement logInButton = driver.findElement(LOGIN_BUTTON_ON_MAIN_PAGE);
        logInButton.click();

        return new UserNamePage(driver);
    }
}
