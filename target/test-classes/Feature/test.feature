Feature: Login Page

  @Login
  Scenario: NewTourSteps
    Given Open WebSite
    When Put my UserName
    Then Put my PassWord
    And click login button

  @Login
  Scenario: FlightFinder
    Given click types
    When select passengers
    When select departingform
    Then select month and date
    Then select Arriving in
    Then select Returning
    Then click Service Class
    Then select Airline
    And click and go to next page

  @Login
  Scenario: ReservingFlightsSteps
    Then click next button

  @Login
  Scenario: BuyFlightSteps
    Given put Names and slc Meal
    When CreditCard info
    Then Billing Address
    Then Delivery Address
    And Click Next
