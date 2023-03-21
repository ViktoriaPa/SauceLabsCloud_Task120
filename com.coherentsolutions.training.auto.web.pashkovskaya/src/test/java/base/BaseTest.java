package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.DriverInit;

public class BaseTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp () {
        DriverInit instanseDriver = DriverInit.getInstance();
        driver = instanseDriver.openBrowser();

        PageDriver.setDriver(driver);
    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }
}
