package POM;

import Utils.Driver;
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
    private WebElement nameInput;

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

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortNameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement intCodeInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityInput;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;


    public void userCreateNewCountry() {

        addButton.click();
        nameInput.sendKeys("Australia");
        code.sendKeys("AUS");
        saveButton.click();
    }

    public void userEditCountry() {
        searchField.sendKeys("Australia");
        searchButton.click();
        editButton.click();
        nameInput.clear();
        nameInput.sendKeys("Avvvusturuluya");
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
        Assert.assertTrue(successMessage.isDisplayed());
    }

    public void createCitizenship(String name, String shortName) {
        addButton.click();
        nameInput.sendKeys(name);
        shortNameInput.sendKeys(shortName);
        saveButton.click();
    }

    public void editCitizenship(String name, String updatedName) {
        searchField.sendKeys(name);
        searchButton.click();
        editButton.click();
        nameInput.clear();
        nameInput.sendKeys(updatedName);
        saveButton.click();
    }

    public void deleteCitizenship(String updatedName) {
        searchField.sendKeys(updatedName);
        searchButton.click();
        waitUntilLoading();

       waitUntilVisibleAndClickableThenClick(deleteButton);
       waitUntilVisibleAndClickableThenClick(deleteConfirmButton);
        //wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
        //wait.until(ExpectedConditions.visibilityOf(deleteButton)).click();
        //deleteConfirmButton.click();

    }
    public void validateSuccessMessage() {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.getText().contains("success".toLowerCase()));
        Assert.assertTrue(successMessage.isDisplayed());

    }

    public void createFees(String name, String code, String intCode, String priority) {
        addButton.click();
        nameInput.sendKeys(name);
        codeInput.sendKeys(code);
        intCodeInput.sendKeys(intCode);
        priorityInput.sendKeys(priority);
        saveButton.click();
    }
    public void editFees(String existingFeeName, String newFeeName) {
        searchField.sendKeys(existingFeeName);
        searchButton.click();

        waitUntilLoading();

        waitUntilVisibleAndClickableThenClick(editButton);
        wait.until(ExpectedConditions.visibilityOf(nameInput)).clear();
        Driver.wait(2);
        wait.until(ExpectedConditions.visibilityOf(nameInput)).sendKeys(newFeeName);
        waitUntilVisibleAndClickableThenClick(saveButton);
    }
    public void deleteFees(String feeName) {
        searchField.sendKeys(feeName);
        searchButton.click();
        Driver.wait(2);
        waitUntilVisibleAndClickableThenClick(deleteButton);
        waitUntilVisibleAndClickableThenClick(deleteConfirmButton);
    }


    }
