Feature: Doing Everything

  Scenario: LoginPage
    Given openbrowser
    When presssignin
    Then insertUserName
    Then clicknext
    Then insertPassWord
