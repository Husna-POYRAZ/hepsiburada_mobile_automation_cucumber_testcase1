@search
Feature: Konum kaydetme senaryosu
  Misafir kullanıcısı olarak uygulamayı açıp
  İl,ilçe,mahalle girerek konum kaydedip
  Herhangi bir kategoriye ait ürünleri listelemek istiyorum.

  @quick-cases
  Scenario: 1-Konum kaydetme
    Given Uygulama acilir
    When Anasayfada Konum alanina tiklanir
    And Il ilce ve mahalle secilir ve kaydet butonuna tiklanir
    And Tab bar uzerinden kategoriler tabina tiklanir
    And Herhangi bir kategori secilip listeleme sayfasina yonlendirilir
    Then Secilen urun kategorisinin listelendigi gorulur