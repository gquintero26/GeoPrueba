Feature: Yo como usuario requiero calcular mi tasa de interes

  Scenario Outline: Searching for a term
    Given Ana desea ingresar al sitio web
    When Ana Valida el ingreso al modulo de calculo de tasa
    Then Ingresa valores y calcula la tasa "<monto>"
    Examples:
      |monto|
      |20   |