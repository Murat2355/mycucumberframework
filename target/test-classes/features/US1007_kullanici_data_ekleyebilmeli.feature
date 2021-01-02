@smoke
Feature: US1007_kullanici_data_ekleyebilmeli

  Scenario Outline: TC09_5_farkli_kisi_ile_farkli_kombinasyonlari_calismali

    When kullanici "datatable_url" anasayfaya gider
    Then new butonuna basar
    And first name girer "<firstname>"
    And "1" saniye bekler
    And Last name girer "<Lastname>"
    And Position girer "<position>"
    And Office girer "<office>"
    And Extention girer "<extention>"
    And Start date girer "<startdate>"
    And Salary girer "<salary>"
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu dogrular
    And kullanici sayfayi kapatir

    Examples:
      | firstname | Lastname | position | office | extention | startdate | salary |
      | Murat     |Ozben     | QA       | Tech   | Dr        | 2020-12-23| 12000  |
      | Ahmet     | Kartal   | manager  | Tech   | Dr        | 2020-12-23| 6500   |
      | Mehmet    | Sahin    | TESTER   | Tech   | Dr        | 2020-12-23| 60050  |
      | Ayse      | Bulanik  | SM       | Tech   | Dr        | 2020-12-23| 6000   |
      | Sevgi     | Deniz    | QA lead  | Tech   | Dr        | 2020-12-23| 6000   |