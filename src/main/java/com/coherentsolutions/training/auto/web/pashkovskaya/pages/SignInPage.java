package com.coherentsolutions.training.auto.web.pashkovskaya.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    @FindBy(xpath = "//a[@href='https://passport.yandex.com/auth?retpath=https%3A%2F%2Fmail.yandex.com']")
    public WebElement logInButton;

    public SignInPage(WebDriver driver){
        super(driver);
    }

    public UserNamePage openUserNamePage() {
        logInButton.click();

        return new UserNamePage(driver);
    }
}
