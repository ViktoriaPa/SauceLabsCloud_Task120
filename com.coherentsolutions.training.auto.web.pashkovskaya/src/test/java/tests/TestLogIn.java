package tests;

import base.BaseTest;
import base.PageDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PasswordPage;
import pages.SignInPage;
import pages.UserNamePage;

import static constants.MainConstants.*;
import static org.testng.Assert.assertEquals;

public class TestLogIn extends BaseTest {
    @Test
    public void testLogin() throws InterruptedException {
        WebDriver driver = PageDriver.getDriver();
        driver.get(LINK_TO_MAIN_YANDEX_PAGE);
        Thread.sleep(20000);

        SignInPage signInPage = new SignInPage(driver);
        UserNamePage userNamePage = signInPage.openUserNamePage();
        PasswordPage passwordPage = userNamePage.enterValidUsername(USERNAME);
        HomePage homePage = passwordPage.enterValidPassword(PASSWORD);
        assertEquals(homePage.getMessageText(),"v1k.pa", "UserName mismatch");
    }
}
