@amazon
Feature: US1003_amazon_search_parametreli


  @wip
  Scenario: TC05_parametre_kullanma
    When kullanici amazon anasayfaya gider
    And "hasan" icin arama yapar
    Then sonucun "kemal" icerdigini test eder
    And kullanici sayfayi kapatir