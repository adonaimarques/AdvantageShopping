#Author: your.email@your.domain.com

@web @cadastro

Feature: cadastro Advantage Online Shopping
  Feature para testar cadastro

	@positivo
	Scenario: cadastro com sucesso
  	Given que acesse o site
 	 	And clico na opcao usuario
 	 	And clico em Create New Account 
 	 	And informo Username de Register
 	 	And informo Email 
 	 	And informo Password de Register
 	 	And confirmo Password de Register
 	 	And clico em I Agree 
  	And clico em Register
  	Then Valido usuario logado de Register
  	
  