#Author: adonai_cinga@hotmail.com

@web @login
Feature: Login Advantage Online Shopping
  Feature para testar login

  @positivo
  Scenario: Login com sucesso
  Given que acesse o site
  And clico na opcao usuario
  And informo Username de login
  And informo Password de login
  And clico em Sign In
  Then valido usuario logado
  
  @negativo
  Scenario: Login sem sucesso
 	Given que acesse o site
 	And clico na opcao usuario
 	But informo Username de login invalido
 	And informo Password de login
 	And clico em Sign In
 	Then valido erro no login
  