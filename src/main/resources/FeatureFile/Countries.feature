Feature: Countries Functionality

  Scenario: Create Country
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully
    When User creates a country
    Then Success message should be displayed


    Scenario: Edit Country
      Given User is on login page
      When User enter admin credentials
      Then User should login successfully
      When User edit country
      Then Success message should be displayed


      Scenario: Delete Country
        Given User is on login page
        When User enter admin credentials
        Then User should login successfully
        When User delete country
        Then Success message should be displayed


