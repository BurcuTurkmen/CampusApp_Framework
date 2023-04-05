Feature: Citizenship Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario: Create Citizenship
    When User create Citizenship with "AmericanoLatte" name and "AL" shortname
    Then Success message should be displayed


  Scenario: Edit Citizenship
    When User edit "AmericanoLatte" citizenship to "LatteAmericano"
    Then Success message should be displayed


  Scenario: Delete Citizenship
    When User delete "LatteAmericano" citizenship
    Then Success message should be displayed