Feature: Test patch /orders/:orderId endpoint, Update an existing order. Requires authentication.

  Background:
    Given url 'https://simple-books-api.glitch.me'
    * def accessToken = karate.properties['accessToken']    //Obtener AccessToken guardado en varGlobal
    * karate.log ('El accessToken obtenido es: '+accessToken)
    * def orderId = karate.properties['orderId']    //Obtener orderId guardado en varGlobal
    * karate.log ('El orderId obtenido es: '+orderId)
    * def clientName = karate.properties['clientName']    //Obtener clientName guardado en varGlobal
    * karate.log ('El clientName obtenido es: '+clientName)

    Scenario: Actualizar información de una orden existente exitosamente
      * def newClientName = 'JohnNew'
      * def requestBody = { customerName: newClientName }

      And path 'orders', orderId
      And header Authorization = 'Bearer ' + accessToken
      And request requestBody
      When method patch
      Then status 204
