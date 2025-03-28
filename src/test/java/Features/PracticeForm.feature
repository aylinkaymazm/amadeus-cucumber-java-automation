Feature:

  Scenario: Send For Practice Form Students
    Given Go to Practice Form Page
    And Fill the First Name  "<Aylin>"
    And Fill the Last Name  "<Kaymaz>"
    And Fill the Email "<aylinkaymazm@gmail.com>"
    And Select Gender
    And Select Date of Birth
    When Click Submit Button
    Then Verify Submit




