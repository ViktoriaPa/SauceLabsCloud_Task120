package com.coherentsolutions.training.auto.web.pashkovskaya.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(className = "user-account__name")
    public WebElement username;
    @FindBy(xpath = "//div[@class='user-pic user-pic_has-plus_ user-account__pic'] /img[contains(@src, 'https://avatars')]")
    public WebElement userIcon;
    @FindBy(xpath = "//a[@aria-label='Log out'] /span[@class='menu__text']")
    public WebElement logOutButton;
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getMessageText() {
        return username.getText();
    }

    public void clickUserIcon(){
        userIcon.click();
    }

    public void clickLogOutButton(){
        logOutButton.click();
    }

    public AuthorizationPage logOut(){
        clickUserIcon();
        clickLogOutButton();

        return new AuthorizationPage(driver);
    }
}
