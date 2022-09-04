package StepDefinition;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.And;

public class FeeSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @And("User create Fee {string} and {string} and {string} and {string}")
    public void userCreateFeeAndAndAnd(String name, String code, String intCode, String priority) {

        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToFeesPage();
        dialogContentElements.createFees(name, code, intCode, priority);
    }

    @And("User edit Fee {string} and change it to {string}")
    public void userEditFeeAndChangeItTo(String existingFeeName, String newFeeName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToFeesPage();
        dialogContentElements.editFees(existingFeeName, newFeeName);

    }

    @And("User delete Fee {string}")
    public void userDeleteFee(String feeName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToFeesPage();
        dialogContentElements.deleteFees(feeName);
    }
}
