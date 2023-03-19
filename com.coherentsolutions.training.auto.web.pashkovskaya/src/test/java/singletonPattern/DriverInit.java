package singletonPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.util.concurrent.TimeUnit.SECONDS;

public class DriverInit {
    private static DriverInit instanceDriver  = null;
    private WebDriver driver;

    private DriverInit() {

    }

    public static DriverInit getInstance() {
        if (instanceDriver == null)
            instanceDriver = new DriverInit();
        return instanceDriver;
    }

    public WebDriver openBrowser(){
        ChromeOptions handlingSSL = new ChromeOptions();
        handlingSSL.setAcceptInsecureCerts(true);
        handlingSSL.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(handlingSSL);
        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        driver.manage().window().maximize();

        return driver;
    }
}
