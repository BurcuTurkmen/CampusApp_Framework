package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    /*
    *               SINGLETON DRIVER CLASS
    *
    *  - We`re using singleton driver because we need 1 driver for every class in our project
    *  - We`ll be using this in our entire framework
    *
    *
     */

    // if it's static that means it's single (only 1 copy) but it doesn't say anything about access level so
    // I can call this static variable from any class and maybe assign a new ChromeDriver() for example.
    //But if you make it private nobody have direct access from different classes nobody can update this driver!
    //  We use encapsulation here --> because we can have access to hidden data by public get/set

    private static WebDriver driver; // this is public variable before we make it private. We don`t want anyone to change it

    public static WebDriver getDriver() {

        // if the driver object is equal to null (there is no active driver instance) then we`ll create new driver
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // if we don`t hae have this line, next scenario will fail
                           // after driver.quit we need to set driver object to null
        }

    }

}
