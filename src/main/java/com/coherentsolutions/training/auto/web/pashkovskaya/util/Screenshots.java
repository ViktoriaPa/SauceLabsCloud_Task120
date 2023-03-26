package com.coherentsolutions.training.auto.web.pashkovskaya.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Screenshots {
    public static final String FILE_WITH_PATH = "/Users/viktoriapashkovskaya/IdeaProjects/Screenshorts/homePage.png";
    public static final String FULL_FILE_WITH_PATH = "/Users/viktoriapashkovskaya/IdeaProjects/Screenshorts/fullHomePage.png";
    public static void takeScreenshot(WebDriver driver) throws IOException {
        File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(FILE_WITH_PATH);
        FileUtils.copyFile(scr, dest);
    }
    public static void takeScreenshotFullScreen(WebDriver driver) throws IOException {
        Screenshot fullScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(ShootingStrategies.scaling(2f), 1000)).takeScreenshot(driver);
        ImageIO.write(fullScreenshot.getImage(),"PNG",new File(FULL_FILE_WITH_PATH));
    }
}
