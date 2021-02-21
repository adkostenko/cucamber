Feature: Test Automation for

  Background: Before test
    Given Navigate to the URL: "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/#/forms/components"

  Scenario: Fill out basic form
    Given Verify Form Components on the web page
    Then Fill out email in email field: "alona.kostenko@gmail.com"
    Then Fill out  password in password field :"Test123!"
    Then Attach a file: "06.pdf"
    Then Click on the 'Submit' button

  Scenario: Fill out Form Elements
    Given Click on "Extend" button
    Then Fill out Input with success field: "Success!"
    Then Fill out Input with warning field: "Warning!"
    Then Fill out Input with Error field: "Error!!!"

  Scenario: Fill out Custom Checkboxes and Radios Form
    Given Verify Custom Checkboxes and Radios Form
    Then Select "Option 3" in Radio
    Then Select "Option 2" in Checkbox
    Then Select "Option 1" in Inline Checkbox












