package io.makepad;

import com.google.common.collect.ClassToInstanceMap;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.print.PageSize;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

public class Generator {
    protected final WebDriver driver;
    protected final WebDriverWait wait;

    public Generator() throws IOException {
        FirefoxOptions options = new FirefoxOptions();
        this.driver = new FirefoxDriver(options);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        this.driver.manage().window().maximize();
    }

    public void takeSS(String url, String xpath, String path) throws IOException {
        this.driver.get(url);
        WebElement element = this.driver.findElement(By.xpath(xpath));
        // capture screenshot with getScreenshotAs() of the dropdown
        File f = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f, new File(path));
        driver.quit();
    }
}