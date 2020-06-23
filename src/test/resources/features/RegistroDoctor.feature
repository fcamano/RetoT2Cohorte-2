#Autor:

@stories
Feature: automatiza registro de un doctor
  el usuario, debe regitrar un nuevo doctor verificar que se guarde correctamente
  @scenario1
  Scenario: automatizar registro de doctor
    Given Carlos necesita registrar un nuevo doctor
    When realiza el registro del mismo en el aplicativo de Administración de Hospitales
      |nombre|apellido|telefono|tipoidentificaion|numerdoidentificacion|
      |Andreina|Test|12345678|Pasaportes|8-888-22|
    Then verifica que se presente en pantalla el mensaje Datos guardados correctamente

