package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBarElements extends BasePOM{

    public NavigationBarElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    public void clickNavigationBar() {

        setup.click();
        parameters.click();
        countries.click();


    }


}
