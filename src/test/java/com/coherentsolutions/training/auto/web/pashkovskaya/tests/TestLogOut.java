package com.coherentsolutions.training.auto.web.pashkovskaya.tests;

import com.coherentsolutions.training.auto.web.pashkovskaya.base.BaseTest;
import com.coherentsolutions.training.auto.web.pashkovskaya.util.DriverInit;
import com.coherentsolutions.training.auto.web.pashkovskaya.util.TestAllureListener;
import com.coherentsolutions.training.auto.web.pashkovskaya.pages.AuthorizationPage;
import com.coherentsolutions.training.auto.web.pashkovskaya.pages.HomePage;
import com.coherentsolutions.training.auto.web.pashkovskaya.pages.PasswordPage;
import com.coherentsolutions.training.auto.web.pashkovskaya.pages.SignInPage;
import com.coherentsolutions.training.auto.web.pashkovskaya.pages.UserNamePage;
import com.coherentsolutions.training.auto.web.pashkovskaya.util.PageDriver;
import com.coherentsolutions.training.auto.web.pashkovskaya.util.Screenshots;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import static com.coherentsolutions.training.auto.web.pashkovskaya.util.MainConstants.*;
import static org.testng.Assert.assertEquals;
@Listeners({ TestAllureListener.class })
public class TestLogOut  {
    private WebDriver driver;

    @BeforeMethod
    public void setUp () throws MalformedURLException {
        DriverInit instanseDriver = DriverInit.getInstance();
        driver = instanseDriver.openRemoteWebDriver("edge");

        PageDriver.setDriver(driver);
    }
    @Test(groups = {"LogOut"}, description = "Logout from Home page")
    public void testLogOut() throws InterruptedException, IOException {
        WebDriver driver = PageDriver.getDriver();
        driver.get(LINK_TO_MAIN_YANDEX_PAGE);
        Thread.sleep(20000);

        SignInPage signInPage = new SignInPage(driver);
        UserNamePage userNamePage = signInPage.openUserNamePage();
        PasswordPage passwordPage = userNamePage.enterValidUsername(USERNAME);
        HomePage homePage = passwordPage.enterValidPassword(PASSWORD);
        Screenshots.takeScreenshot(driver);
        Screenshots.takeScreenshotFullScreen(driver);
        AuthorizationPage authorizationPage = homePage.logOut();
        Thread.sleep(20000);
        assertEquals(authorizationPage.getTitle(),"Authorization", "Title mismatch");
    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }
}
