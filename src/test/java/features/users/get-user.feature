Feature: Test GET User Endpoint on Reqres.in
  Background:
    * url 'https://reqres.in'

  Scenario: Obtener correctamente los datos de un usuario existente por ID (ID válido)
    Given path 'api', 'users', 2
    When method get
    Then status 200
    And match response.data.id == 2
    And match response.data.email == '#string'
    And match response.data.first_name == '#string'
    And match response.data.last_name == '#string'
    And match response.data.avatar == '#string'

  Scenario: Intentar obtener un usuario que no existe (ID inválido)
    Given path 'api', 'users', 23
    When method get
    Then status 404
    And match response == {}

  Scenario: Validar que el tipo de contenido sea JSON
    Given path 'api', 'users', 2
    When method get
    Then status 200
    And match header Content-Type contains 'application/json'

  Scenario: Validar que el campo 'support' existe y tiene valores esperados
    Given path 'api', 'users', 2
    When method get
    Then status 200
    And match response.support.url == '#string'
    And match response.support.text == '#string'

  Scenario: Obtener lista de usuarios - página 2
    Given path 'api', 'users'
    And param page = 2
    When method get
    Then status 200
    And match response.page == 2
    And match response.data != []

  Scenario: Página inexistente retorna lista vacía
    Given path 'api', 'users'
    And param page = 999
    When method get
    Then status 200
    And match response.data == []