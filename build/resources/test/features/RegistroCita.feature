#Autor:

@stories
Feature: automatizar cita
  el usuario, debe regitrar una nueva cita y verificar que se guarde correctamente
  @scenario1
  Scenario: automatizar cita medica
    Given Luis necesita registrar una nuevo cita
    When registra la cita en el hospital
      |diacita|cedula|doctorid|observacion|
      |06/20/2020|7777777|8-888-22|test|
    Then verificar que se guardo - Datos guardados correctamente

