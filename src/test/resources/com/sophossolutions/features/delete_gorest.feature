Feature: Automatizacion de Api Rest
  Yo como aprendiz
  Necesito automatizar la ejecucion de una api
  Para aprender a interactuar con los servicios

  Scenario: Eliminar usuario DELETE
    Given "Armando" establece la base url "https://gorest.co.in/" del servicio
    When consulta en el endpoint "public/v2/users/"  y eliminda el usuario por id "5938"
    Then valida que el estatus code sea 204 y la respuesta contenga null