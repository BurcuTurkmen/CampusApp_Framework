package StepDefinition;

import Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks {

    WebDriver driver = Driver.getDriver();

    @Before
    public void setup() {
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

   // public void scrollToElement(WebElement element) {
   //     JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
   //     js.executeScript("arguments[0].scrollIntoView();", element);
   // }

    @After
    public void tearDown(Scenario scenario) {

        if(scenario.isFailed()) {

            TakesScreenshot screenshot = ((TakesScreenshot) driver); // which driver to get a screenshot

            File srcFile = screenshot.getScreenshotAs(OutputType.FILE); //file class and create it`s object. when we take a ss, then will be storing in this file.

            String scenarioName = scenario.getName();

            File destinationFile = new File("target/FailedScreenshots/" + scenarioName + ".png");

            try {
                FileUtils.copyFile(srcFile, destinationFile);

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

        Driver.quitDriver();
    }





}
