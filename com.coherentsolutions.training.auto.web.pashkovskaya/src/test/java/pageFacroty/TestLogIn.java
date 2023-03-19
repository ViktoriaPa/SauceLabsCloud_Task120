package pageFacroty;

import base.BaseTest;
import base.PageDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static constans.MainConstants.*;
import static org.testng.Assert.assertEquals;

public class TestLogIn extends BaseTest {
    @Test
    public void testLogin() throws InterruptedException {
        WebDriver driver = PageDriver.getDriver();
        driver.get(LINK_TO_MAIN_YANDEX_PAGE);
        Thread.sleep(20000);

        SignInPageFactory signInPage = new SignInPageFactory(driver);
        UserNamePageFactory userNamePage = signInPage.openUserNamePage();
        PasswordPageFactory passwordPage = userNamePage.enterValidUsername(USERNAME);
        HomePageFactory homePage = passwordPage.enterValidPassword(PASSWORD);
        assertEquals(homePage.getMessageText(),"v1k.pa", "UserName mismatch");
    }
}
