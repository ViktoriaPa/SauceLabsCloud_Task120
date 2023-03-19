package pageFacroty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static constans.WebElementsComstants.*;

public class UserNamePageFactory {
    protected WebDriver driver;

    public UserNamePageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = USERNAME_FIELD) public WebElement usernameField;
    @FindBy(id = LOGIN_BUTTON_ON_USERNAME_PAGE) public WebElement logInButton;

    public PasswordPageFactory enterValidUsername(String userName) {
        usernameField.sendKeys(userName);
        logInButton.click();

        return new PasswordPageFactory(driver);
    }
}
