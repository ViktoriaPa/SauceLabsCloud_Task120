package pageFacroty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static constans.WebElementsComstants.*;

public class SignInPageFactory {
    protected WebDriver driver;

    public SignInPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = LOGIN_BUTTON_ON_MAIN_PAGE) public WebElement logInButton;

    public UserNamePageFactory openUserNamePage() {
        logInButton.click();

        return new UserNamePageFactory(driver);
    }
}
