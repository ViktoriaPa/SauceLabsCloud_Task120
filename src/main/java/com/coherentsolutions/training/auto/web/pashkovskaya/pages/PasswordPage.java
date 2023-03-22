package com.coherentsolutions.training.auto.web.pashkovskaya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PasswordPage extends BasePage {
    @FindBy(id = "passp-field-passwd")
    public WebElement passwordField;
    @FindBy(id = "passp:sign-in")
    public WebElement logInButton;

    public PasswordPage(WebDriver driver){
        super(driver);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickLogInButton(){
        logInButton.click();
    }
    public HomePage enterValidPassword(String password) {
        enterPassword(password);
        clickLogInButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='user-account__name']")));

        return new HomePage(driver);
    }
}
