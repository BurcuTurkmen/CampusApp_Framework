package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DialogContentElements extends BasePOM {

    public DialogContentElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement name;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement code;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder, 'FIELD.NAME')]//input")
    private WebElement searchField;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//button[@type='submit']//span[text()=' Delete ']")
    private WebElement deleteConfirmButton;


    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    public void userCreateNewCountry() {

        addButton.click();
        name.sendKeys("Australia");
        code.sendKeys("AUS");
        saveButton.click();
    }

    public void userEditCountry() {
        searchField.sendKeys("Australia");
        searchButton.click();
        editButton.click();
        name.clear();
        name.sendKeys("Avvvusturuluya");
        saveButton.click();

    }

    public void userDeleteCountry() {
        searchField.sendKeys("Avvvusturuluya");
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
        wait.until(ExpectedConditions.visibilityOf(deleteButton)).click();
        deleteConfirmButton.click();

    }

    public void validateSuccessfulMessage() {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.getText().contains("success".toLowerCase()));
    }

}
