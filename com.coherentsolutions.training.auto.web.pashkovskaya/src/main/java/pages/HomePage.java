package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[@class=\"user-account__name\"]") public WebElement username;
    @FindBy(xpath = "//div[@class=\"user-pic user-pic_has-plus_ user-account__pic\"] /img[contains(@src, 'https://avatars')]") public WebElement userIcon;
    @FindBy(xpath = "//a[@aria-label=\"Log out\"] /span[@class=\"menu__text\"]") public WebElement logOutButton;

    public String getMessageText() {
        return username.getText();
    }

    public AuthorizationPage logOut(){
        userIcon.click();
        logOutButton.click();

        return new AuthorizationPage(driver);
    }
}
