Feature: Ongeldige tekens


  Scenario:Testcase 1: Ongeldige tekens invoeren

    Given ga naar home pagina.
    When typ ongeldige  "+" and geldige "5571RE " het zoekvak.
    Then De foutmelding moet zichtbaar zijn.
    Then quit de driver.

  Scenario: Testcase 2: Ongeldige tekens invoeren
    Given ga naar home pagina.
    When typ ongeldige  "?" and geldige "5571RE " het zoekvak.
    Then De foutmelding moet zichtbaar zijn.
    Then quit de driver.