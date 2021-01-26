@dbread
Feature: US1015_DBUtils
  Scenario: TC_23 Kullanici tHotel tablosundan mail fıeldini okur
    Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
    And kullanici DBUtils ile "tHotel" tablosundan "Email" verilerini okur
    Then IDHotel degeri 8 olan kaydin Email bilgisinin "new@email" oldugunu test eder

  @dbupdate1
  Scenario: TC_24 Kullanici tHotel tablosundan istedigi Emaili ubdate eder
    Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
    Then IDHotel degeri 3 olan kaydin Email degerini "batch11@javadabulusuruz.com" yapar

  @dbupdate
  Scenario: TC_25 Kullanici tHotel tablosunda update yapar
    Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
    Then IDHotel degeri 11 olan kaydin Email bilgisini buisbukadar@gmail.com yapar

  @dbcreate
  Scenario: TC_26 Kullanici uygun degerlerle tHotel tablosuna yeni kayit ekler
    Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
    And uygun degerlerle tabloya yeni kayit ekler
