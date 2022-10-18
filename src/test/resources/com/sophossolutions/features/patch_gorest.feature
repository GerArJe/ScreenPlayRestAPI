Feature: Automatizacion de Api Rest
  Yo como aprendiz
  Necesito automatizar la ejecucion de una api
  Para aprender a interactuar con los servicios

  Scenario Outline: Actualizar un usuario con metodo Patch
    Given "Jose" establece la base url "https://gorest.co.in/" del servicio
    When proporciona la informacion del usuario "public/v2/users/" con id "5922"
      | name   | <name>   |
      | status | <status> |
    Then valida que la respuesta tenga el nombre "<name>" y el status code sea 200

    Examples:
      | name         | status |
      | Jose Alberto | Active |