Feature: Test POST User Endpoint on Reqres.in

  Background:
    * url 'https://reqres.in'

  Scenario: Crear un usuario exitosamente
    Given path 'api', 'users'
    And request {"name": "juan","job": "pilot"}
    When method post
    Then status 201
