Feature: Fee Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario Outline: Add Fees
    And User create Fee "<name>" and "<code>" and "<intCode>" and "<priority>"
    Then Success message should be displayed

      Examples:
      | name        | code    | intCode | priority  |
      | JohnSmith34 | 8975989 | paypal  | 923804    |
      | SmithCore13 | 0982293 | venmo   | 348908    |
      | DylanSoto24 | 2039093 | zelle   | 938457    |

  Scenario Outline: Edit Fees
    And User edit Fee "<existingFeeName>" and change it to "<newFeeName>"
    Then Success message should be displayed

    Examples:
      | existingFeeName | newFeeName     |
      | JohnSmith34     | MurphyssTest12 |
      | SmithCore13     | TestCookie39   |
      | DylanSoto24     | TestLexi102    |


  Scenario Outline: Delete Fees
    And User delete Fee "<FeeName>"
    Then Success message should be displayed

    Examples:
      | FeeName        |
      | MurphyssTest12 |
      | TestCookie39   |
      | TestLexi102    |