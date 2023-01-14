Feature: Test TCB Scans Website

  Scenario: Home Page
    Given I am on the TCB Home Page
    When I click on the Projects tab
    Then I should end up on the Projects page

    Scenario: Navigate to Chapters Page
      Given I navigate to the One Piece Chapters Page
      When I click on the One Piece image
      Then I should get to the Chapters Page