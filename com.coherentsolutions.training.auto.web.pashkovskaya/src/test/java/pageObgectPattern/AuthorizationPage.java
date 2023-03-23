package pageObgectPattern;

import org.openqa.selenium.WebDriver;

public class AuthorizationPage {
    protected WebDriver driver;
    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitle() {
        return driver.getTitle();
    }
}
