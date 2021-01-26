Feature: US1010_Ck_Hotels_farkli_kullanici_deneme

  #Kullanici adi ve sifre parametreli olarak
  Scenario: TC12_yanlis_kullaniciAdi_sifre_yazarak_deneyelim
    Given kullanici "Ck_Hotels_Url" anasayfaya gider
    Then Log in yazisina tiklar
    And username olarak "Manager1" girer
    And password olarak "Manager1" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder

  #Coklu deger girerek test yapma
  Scenario Outline: TC13_yanlis_kullaniciAdi_sifre_yazarak_deneyelim
    Given kullanici "Ck_Hotels_Url" anasayfaya gider
    Then Log in yazisina tiklar
    And username olarak "<Username>" girer
    And password olarak "<Password>" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    Examples:
      | Username | Password |
      |Manager   |Manager   |
      |Manager1  |Manager1  |
      |Manager2  |Manager2  |
      |Manager3  |Manager3  |