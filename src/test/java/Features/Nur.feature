Feature: Fields feature under Parameter

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  Scenario: Validate as an Admin User i should be able to add a new field in Fields
    And I click on the set up
    And I click on the parameters
    And I click on fields
    And I click on the add button
    And fill up the new field form
    And I click on the save button
    Then user should see the success message about adding new field

  Scenario: Validate as an Admin User is  able to edit with new code in created field in Fields
    And I click on the set up
    And I click on the parameters
    And I click on fields
    And I input a data in search name box
    And click on search button
    And  I click edit button of a field that I want to edit
    And  I Change the code
    And I click on the save button
    Then user should see the success message about editing new field

  Scenario: Validate as an Admin User is able to delete a created field in Fields
    And I click on the set up
    And I click on the parameters
    And I click on fields
    And I send a created field name that i want to delete to the search box
    And  click on search button
    And I click on the delete button
    And I click on the warning delete
    Then user should see the success message about deleting a field

  Scenario: Validate as an Admin User i should not  be able to add a new field with already created name in Fields
    And I click on the set up
    And I click on the parameters
    And I click on fields
    And I click on the add button
    And fill up the new field form with already created name
    And I click on the save button
    Then user should see the Warning message about adding new field

  Scenario: Validate as an Admin User i should not be able to edit a field with already created code in Fields
    And I click on the set up
    And I click on the parameters
    And I click on fields
    And I click on the add button
    And I click on inactive save button
    Then user should see the name placeholder in red