Feature:

  Scenario: Search for roundtrip way flight ticket for given date
    Given Go to Enuygun Flight Ticket Selection Page
    And Choose from which point to board the plane "<İstanbul>" to "<Ankara>"
    And Select departure date "<30-12-2023>"
    And Select return date "<31.12.2023>"
    When Click on find tickets
    Then Verify page listing roundtrip flight tickets 10:00 and 18:00.

  Scenario: Search for round-trip flight ticket for given dates
    Given Go to Enuygun Flight Ticket Selection Page
    And Choose from which point to board the plane "<İstanbul>" to "<Ankara>"
    And Select departure date "<30-12-2023>"
    And Select return date "<31.12.2023>"
    And Click on find THY tickets
    When Click on find tickets
    Then Verify page ascending order THY listing return flight tickets



