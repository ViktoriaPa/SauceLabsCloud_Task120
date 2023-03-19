package pageFacroty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPageFactory {
    protected WebDriver driver;

    public AuthorizationPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
