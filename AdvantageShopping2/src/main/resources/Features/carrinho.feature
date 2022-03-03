#Author: adonai_cinga@hotmail.com

@web @carrinho
Feature: carrinho Advantage Online Shopping
  Feature para testar carrinho

  @positivo
  Scenario: Adicionar produto no carrinho
  Given que acesse o site
  And clico em speakers
  And seleciono produto
  And clico em add to cart
  And clico em carrinho
  Then valido produto no carrinho