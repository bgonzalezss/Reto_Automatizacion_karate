Feature: Test delete /orders/:orderId endpoint, Delete an existing order. Requires authentication.

  Background:
    Given url 'https://simple-books-api.glitch.me'
    * def accessToken = karate.properties['accessToken']    //Obtener AccessToken guardado en varGlobal
    * karate.log ('El accessToken obtenido es: '+accessToken)
    * def orderId = karate.properties['orderId']    //Obtener orderId guardado en varGlobal
    * karate.log ('El orderId obtenido es: '+orderId)

    Scenario: Eliminar una orden existente exitosamente
      And path 'orders', orderId
      And header Authorization = 'Bearer ' + accessToken
      When method delete
      Then status 204
      And match response == ('')

