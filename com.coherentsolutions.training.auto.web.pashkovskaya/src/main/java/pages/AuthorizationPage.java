package pages;

import org.openqa.selenium.WebDriver;

public class AuthorizationPage extends BasePage{

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
