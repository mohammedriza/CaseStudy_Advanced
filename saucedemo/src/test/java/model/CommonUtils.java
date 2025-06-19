package model;

import cucumber.webDriver.WebDriverInit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class CommonUtils extends WebDriverInit {
    public static String appUrl; // Configured in Hooks
    public final String appUsername = "standard_user";
    public final String appPassword = "secret_sauce";

    public void gotoUrl(String url) {
        webDriver().get(url);
    }

    public void maximizeWindow() {
        webDriver().manage().window().maximize();
    }

    public void sendKeys(By element, String value) {
        webDriver().findElement(element).sendKeys(value);
    }

    public void click(By element) {
        webDriver().findElement(element).click();
    }

    public void assertAppUrlContains(String url) {
        Assert.assertTrue(webDriver().getCurrentUrl().contains(url));
        System.out.println("App url contains : " + url);
    }

    public void waitFor(long seconds) {
        try {
            Thread.sleep(seconds / 1000);
        } catch (Exception e) {
            System.out.println("Error occurred while waiting... | " + e);
        }
    }

    public List<WebElement> findElementList(By element) {
        return webDriver().findElements(element);
    }

    public WebElement findElement(By element) {
        return webDriver().findElement(element);
    }

    public void quitDriver() {
        webDriver().quit();
    }

    public void closeDriver() {
        webDriver().close();
    }

    public void takeScreenshot() {
        try {
            File file = ((TakesScreenshot) webDriver()).getScreenshotAs(OutputType.FILE);

            File destFile = new File("src/test/resources/screenshots/Screenshot_" + getUniqueValue() + ".png");
            FileUtils.copyFile(file, destFile);
        } catch (Exception e) {
            System.out.println("ERROR: Failed to take screenshot");
            ;
        }
    }

    private String getUniqueValue() {
        LocalDateTime datetime = LocalDateTime.now();
        return datetime.getHour() + "_" + datetime.getMinute() + "_" + datetime.getSecond();
    }
}
