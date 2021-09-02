@test
Feature: Login scenarios

#  Scenario Outline: Navigate to the myaccount section
#    When I am in the homepage
#    And  Navigating to the myaccount screen
#    And  I tapped on login button
#    Then Login screen appears
#    Examples:
#      |profile|login|
#      |       |     |

  Scenario Outline: Navigate to the myaccount section
    When I am in the homepage
#    And  I am tapping on the allow Once button
#    And  I am tapping on the allow button
    And  Navigating to the myaccount screen
    And  I tapped on login button
    Then Login screen appears
    Examples:
      |profile|login|
      |       |     |

  Scenario Outline: Checking Blank details
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then login should fail with an error "<err>"
    Examples:
      | username | password | err |
      |  |  | Kindly fill in the required info. |

  Scenario Outline: Checking Blank Email Validation
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then login should fail with an error "<err>"
    Examples:
      | username | password | err |
      |  | 123456789 | Kindly enter your email. |

  Scenario Outline: Checking Blank Password Validation
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then login should fail with an error "<err>"
    Examples:
      | username | password | err |
      | nagarjunam@becon.co |  | Kindly enter a password. |

  Scenario Outline: Checking invalid email Validation
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then login should fail with an error "<err>"
    Examples:
      | username | password | err |
      | nagarjunambecon | 123456789 |Entered email is invalid. |

  Scenario Outline: Login with invalid password
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then login should fail with an error "<err>"
    Examples:
      | username | password | err |
      | nagarjunam@becon.co | 1234567890 | Email/Password combination invalid |

  Scenario Outline: Login with valid user name and password
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then I should see Products page with title "<title>"
    Examples:
      | username | password | title |
      | nagarjunam@becon.co | 123456789 | nagarjunam@becon.co |