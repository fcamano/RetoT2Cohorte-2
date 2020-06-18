#Autor:

@stories
Feature: automatiza registro en Demo Site
  el usuario, debe ingresar la pagina Automation Demo Site y verificar que se registro
  @scenario1
  Scenario: automatizar Demo Site
    Given Carlos quiere acceder a la Web Automation Demo Site
    When el realiza el registro en la página
      |name|last|address|email|number|language|skill|contry|selecontry|year|month|day|password|confirpassword|
      |Faustino|Camano|Ciudad-Panama|test@choucairtesting.com|1234567895|Arabic|Mac|Panama|Japan|1980|September|26|123456#Kk|123456#Kk|
    Then verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row
