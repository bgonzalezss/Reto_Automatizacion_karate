Feature: Test get /status endpoint

  Background:
    Given url 'https://simple-books-api.glitch.me'

  Scenario: Verificar que el estado de la API es "ok"
    Given path 'status'
    When method GET
    Then status 200
    And match response == { status: 'OK' }

  Scenario: Verificar que la respuesta tiene un formato JSON válido
    Given path 'status'
    When method GET
    Then status 200
    And match response == { status: 'OK' }

  Scenario: Verificar el comportamiento cuando no se puede acceder a la API
    Given path 'noexistepath'
    When method GET
    Then status 404
    And match response == '#string'

  Scenario: Verificar si el servidor responde en menos de 1 segundo
    Given path 'status'
    When method GET
    Then status 200
    And assert responseTime < 1000
