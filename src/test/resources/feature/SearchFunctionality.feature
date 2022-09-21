@smoke
Feature: Smoke test for job search functionality on Brook Source Website

  Scenario: User should be able to search on given website
    Given user navigates to job search page
    When user search for job using keywords "test"
    Then user should be able to see the job positions
