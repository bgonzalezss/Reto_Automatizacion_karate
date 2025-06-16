Feature: Test get /books endpoint, Returns a list of books.

  Background:
    Given url 'https://simple-books-api.glitch.me'

    Scenario: Obtener la lista completa de los libros.
      Given path 'books'
      When method get
      Then status 200
      And match response != {}

  Scenario: Obtener libros con un path incorrecto
    Given path 'books/noexistepath'
    When method get
    Then status 404
    And match response == {"error":"No book with id NaN"}

  Scenario: Verificar la estructura de la respuesta de la lista de libros
    Given path 'books'
    When method get
    Then status 200
    And match response != {}
    And match response[0] == { id: '#number', name: '#string', type: '#string', available: '#boolean'}

  Scenario: Obtener libros filtrados por género "fiction"
    Given path 'books'
    And param type = 'fiction'
    When method get
    Then status 200
    And match each response[*].type == 'fiction'

  Scenario: Obtener libros con un parámetro inválido
    Given path 'books'
    And param type = 'noexistetype'
    When method get
    Then status 400
    And match response == {"error":"Invalid value for query parameter 'type'. Must be one of: fiction, non-fiction."}