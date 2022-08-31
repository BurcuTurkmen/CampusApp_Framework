package StepDefinition;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;

public class CountriesSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;


    @When("User creates a country")
    public void user_creates_a_country() {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();
        navigationBarElements.clickNavigationBar();
        dialogContentElements.userCreateNewCountry();
    }

    @When("User edit country")
    public void user_edit_country() {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();
        navigationBarElements.clickNavigationBar();
        dialogContentElements.userEditCountry();
    }

    @When("User delete country")
    public void user_delete_country() {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();
        navigationBarElements.clickNavigationBar();
        dialogContentElements.userDeleteCountry();
    }

    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();
        dialogContentElements.validateSuccessfulMessage();
    }

}
