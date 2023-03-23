package com.coherentsolutions.training.auto.web.pashkovskaya.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static final String FILE_WITH_PATH = "/Users/viktoriapashkovskaya/IdeaProjects/Screenshorts/homePage.png";

    public static void takeScreenshot(WebDriver driver) throws IOException {
        File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(FILE_WITH_PATH);
        FileUtils.copyFile(scr, dest);
    }
}
