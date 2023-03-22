package com.coherentsolutions.training.auto.web.pashkovskaya.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserNamePage extends BasePage {
    @FindBy(id = "passp-field-login")
    public WebElement usernameField;
    @FindBy(id = "passp:sign-in")
    public WebElement logInButton;

    public UserNamePage(WebDriver driver){
        super(driver);
    }

    public PasswordPage enterValidUsername(String userName) {
        usernameField.sendKeys(userName);
        logInButton.click();

        return new PasswordPage(driver);
    }
}
