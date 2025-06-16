Feature: Test get /books/:bookId endpoint, Retrieve detailed information about a book.

  Background:
    Given url 'https://simple-books-api.glitch.me'

  Scenario Outline: Obtener libro por ID válido
    Given path 'books', <id>
    When method get
    Then status 200
    And match response.id == <id>
    Examples:
      | id  |
      | 1   |
      | 3   |
      | 5   |

  Scenario: Obtener libro por ID inválido
    Given path 'books', 'x*'
    When method get
    Then status 404
    And match response == {"error":"No book with id NaN"}

  Scenario Outline: Obtener libro por ID no existente
    Given path 'books', <id>
    When method get
    Then status 404
    And match response == {"error":"No book with id <id>"}
    Examples:
      | id  |
      | 87  |
      | 123 |
      | 999 |

  Scenario: Configurar timeout de la solicitud para obtener la lista de libros
  #  * configure timeout = 1000
    Given path 'books'
    When method get
    Then status 200
