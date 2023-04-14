package com.coherentsolutions.training.auto.web.pashkovskaya.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static java.util.concurrent.TimeUnit.SECONDS;

public class DriverInit {
    private static DriverInit instanceDriver  = null;
    private WebDriver driver;

    private DriverInit() {

    }

    public synchronized static DriverInit getInstance() {
        if (instanceDriver == null) {
            instanceDriver = new DriverInit();
        }
        return instanceDriver;
    }

    public WebDriver openLocalChromeBrowser(){
        ChromeOptions handlingSSL = new ChromeOptions();
        handlingSSL.setAcceptInsecureCerts(true);
        handlingSSL.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(handlingSSL);
        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        driver.manage().window().maximize();

        return driver;
    }

    public WebDriver openRemoteWebDriver(String browserName) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();

        if(browserName.equals("chrome")) {
            dc.setBrowserName("chrome");
        } else if (browserName.equals("firefox")) {
            dc.setBrowserName("firefox");
        } else if (browserName.equals("edge")) {
            dc.setBrowserName("MicrosoftEdge");
        } else if (browserName.equals("safari")) {
            dc.setBrowserName("safari");
        }

        driver = new RemoteWebDriver(new URL("http://localhost:4444"), dc);
        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        driver.manage().window().maximize();

        return driver;
    }
}
