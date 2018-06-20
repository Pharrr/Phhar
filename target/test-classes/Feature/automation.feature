Feature: Blablabla

  @qiaoqiao
  Scenario: SignIn
    Given OpenBrowser
    When Signin
    When InsertUserNanme
    Then InsetPassWord
    And ClickLogin

  @qiaoqiao
  Scenario: 
    Given PressTshirt
    When SelectSize
    When Select Color
