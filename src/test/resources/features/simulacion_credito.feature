#Author: Gestion plan de estudios
  #Languaje: es
  #HU1

Feature: Como cliente de Bancolombia deseo realizar la simulacion de un credito de libre inversion
  para que el sistema calcule el valor de la cuota mensual que debo pagar.

  Scenario Outline: Simulacion de Credito de Libre Inversion con calculo de cuota mensual.
    Given ingreso al sitio web 'https://www.bancolombia.com/personas'
    When doy clic en la opcion saber mas en el bloque creditos
    And selecciono la opcion simular en el apartado credito libre inversion bancolombia
    And diligencio el monto con "<monto>", el plazo con "<plazo>" y la fecha de nacimiento "<fechaNacimiento>"
    Then el sistema calculara y mostrara la cuota mensual que debo pagar
    Examples:
      | monto    | plazo | fechaNacimiento |
      | 20000000 | 50    | 23/6/1997       |
