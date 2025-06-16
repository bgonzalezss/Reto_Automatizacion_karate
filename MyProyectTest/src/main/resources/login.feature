Feature: simple test

  Scenario: GET inventory PetStore
    Given url 'https://petstore.swagger.io/v2/store/inventory'
    When method GET
    Then status 200
