package pageFacroty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constans.LocatorsConstants.USERNAME_ON_HOME_PAGE;
import static constans.WebElementsComstants.*;

public class PasswordPageFactory {
    protected WebDriver driver;

    public PasswordPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = PASSWORD_FIELD) public WebElement passwordField;
    @FindBy(id = LOGIN_BUTTON_ON_PASSWORD_PAGE) public WebElement logInButton;
//    @FindBy(xpath = USERNAME_ON_HOME_PAGE) public WebElement username;

    public HomePageFactory enterValidPassword(String password) {
        passwordField.sendKeys(password);
        logInButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(USERNAME_ON_HOME_PAGE));

        return new HomePageFactory(driver);
    }
}
