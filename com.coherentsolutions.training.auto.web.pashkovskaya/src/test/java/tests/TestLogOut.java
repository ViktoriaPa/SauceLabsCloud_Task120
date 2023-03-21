package tests;

import base.BaseTest;
import base.PageDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.*;

import static constants.MainConstants.*;
import static org.testng.Assert.assertEquals;

public class TestLogOut extends BaseTest {

    @Test
    public void testLogOut() throws InterruptedException {
        WebDriver driver = PageDriver.getDriver();
        driver.get(LINK_TO_MAIN_YANDEX_PAGE);
        Thread.sleep(20000);

        SignInPage signInPage = new SignInPage(driver);
        UserNamePage userNamePage = signInPage.openUserNamePage();
        PasswordPage passwordPage = userNamePage.enterValidUsername(USERNAME);
        HomePage homePage = passwordPage.enterValidPassword(PASSWORD);
        AuthorizationPage authorizationPage = homePage.logOut();
        Thread.sleep(20000);
        assertEquals(authorizationPage.getTitle(),"Authorization", "Title mismatch");
    }
}
