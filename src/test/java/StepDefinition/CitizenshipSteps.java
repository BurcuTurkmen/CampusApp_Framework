package StepDefinition;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CitizenshipSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @When("User create Citizenship with {string} name and {string} shortname")
    public void user_create_citizenship_with_name_and_shortname(String name, String shortName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToCitizenshipPage();
        dialogContentElements.createCitizenship(name, shortName);
    }

    @When("User edit {string} citizenship to {string}")
    public void userEditCitizenshipTo(String name, String updatedName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToCitizenshipPage();
        dialogContentElements.editCitizenship(name, updatedName);
    }


    @When("User delete {string} citizenship")
    public void userDeleteCitizenship(String updatedName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToCitizenshipPage();
        dialogContentElements.deleteCitizenship(updatedName);

    }

}
