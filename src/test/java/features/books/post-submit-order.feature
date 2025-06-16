Feature: Test post /orders endpoint, Allows you to submit a new order. Requires authentication.

  Background:
    Given url 'https://simple-books-api.glitch.me'
    * def accessToken = karate.properties['accessToken']    //Obtener AccessToken guardado en varGlobal
    * karate.log ('El accessToken obtenido es: '+accessToken)
    * def clientName = karate.properties['clientName']    //Obtener clientName guardado en varGlobal
    * karate.log ('El clientName obtenido es: '+clientName)

  Scenario: Generar una orden exitosamente
    And path '/orders/',
    And header Authorization = 'Bearer ' + accessToken
    And request  {  "bookId": 5,"customerName": '#(clientName)'}
    When method post
    Then status 201
    * def orderId = response.orderId
    * karate.log('Order ID es: '+ orderId)
    * karate.properties['orderId'] = orderId      //Guarda orderId en varGlobal
    And match response != null
    And match response.created == true
    And match response.orderId != null
