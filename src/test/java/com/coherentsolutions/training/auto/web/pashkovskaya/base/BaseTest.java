package com.coherentsolutions.training.auto.web.pashkovskaya.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.coherentsolutions.training.auto.web.pashkovskaya.util.DriverInit;
import com.coherentsolutions.training.auto.web.pashkovskaya.util.PageDriver;

import java.net.MalformedURLException;

public class BaseTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp () throws MalformedURLException {
        DriverInit instanseDriver = DriverInit.getInstance();
        driver = instanseDriver.openRemoteWebDriver("chrome");

        PageDriver.setDriver(driver);
    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }
}
