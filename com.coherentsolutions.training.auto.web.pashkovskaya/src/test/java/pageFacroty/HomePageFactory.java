package pageFacroty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static constans.WebElementsComstants.*;


public class HomePageFactory {
    protected WebDriver driver;
    public HomePageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = USERNAME_ON_HOME_PAGE) public WebElement username;
    @FindBy(xpath = USER_ICON) public WebElement userIcon;
    @FindBy(xpath = LOG_OUT_BUTTON) public WebElement logOutButton;

    public String getMessageText() {
        return username.getText();
    }

    public AuthorizationPageFactory logOut(){
        userIcon.click();
        logOutButton.click();

        return new AuthorizationPageFactory(driver);
    }
}
