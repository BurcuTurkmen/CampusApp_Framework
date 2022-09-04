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

    @FindBy(xpath = "//span[text()='Citizenships']/..")
    private WebElement citizenship;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;



    public void clickNavigationBar() {

        setup.click();
        parameters.click();
        countries.click();

        waitUntilLoading();

    }
    public void navigateToCitizenshipPage() {

        setup.click();
        parameters.click();
        citizenship.click();

    }

    public void navigateToFeesPage() {

        setup.click();
        parameters.click();
        fees.click();

    }

}
