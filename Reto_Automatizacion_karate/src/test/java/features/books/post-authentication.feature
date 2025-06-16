Feature: Test post /api-clients/ endpoint, Submit an Authentication.

  Background:
    Given url 'https://simple-books-api.glitch.me'
    * def clientName = 'AnaAnaPruebas'
    * def clientEmail = 'hapafad953.33anamtest@ihnpo.com'
    * karate.properties['clientName'] = clientName      //Guarda clientName en varGlobal
    * karate.properties['clientEmail'] = clientEmail      //Guarda clientEmail en varGlobal

  Scenario: Generar Autorización accessToken válida
    * def requestBody =  { clientName: '#(clientName)', clientEmail: '#(clientEmail)' }
    Given path '/api-clients/'
    And request requestBody
    When method post
    Then status 201
    * def accessToken = response.accessToken
    * karate.properties['accessToken'] = accessToken      //Guarda AccessToken en varGlobal
    * karate.log(accessToken)
    And match response.accessToken != null


  Scenario: Generar Autorización con un usuario ya registrado
    * def requestBody =  {  "clientName": "AnaPruebas","clientEmail": "AnaPruebas001@example.com"}
    Given path '/api-clients/'
    And request requestBody
    When method post
    Then status 409
    And match response == {"error":"API client already registered. Try a different email."}