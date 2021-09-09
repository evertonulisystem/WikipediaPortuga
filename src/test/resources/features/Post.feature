
#  Funcionalidade: Consultar produto
#    Cenario: Consulta Ovos de Pascoa
#      Dado que acesso o wikipedia
#      Quando pesquiso por "Ovos de Páscoa"
#      Entao exibe a pesquisa "Ovos de Páscoa" no titulo da pagina


Feature: Consultar produto
 Scenario: Consulta Ovos de Pascoa
    Given que acesso o wikipedia
    When pesquiso por "Ovos de Páscoa"
    Then exibe a pesquisa "Ovos de Páscoa" no titulo da pagina
