# Mobile Automation with Cucumber in Java

@search<br>
*Feature: Konum kaydetme senaryosu
*Misafir kullanıcısı olarak uygulamayı açıp
*İl,ilçe,mahalle girerek konum kaydedip
*Herhangi bir kategoriye ait ürünleri listelemek istiyorum.

@quick-cases<br>
  Scenario: 1-Konum kaydetme<br>
    Given Uygulama acilir<br>
     When Anasayfada Konum alanina tiklanir<br>
      And İl ilce ve mahalle secilir ve kaydet butonuna tiklanir<br>
      And Tab bar uzerinden kategoriler tabına tiklanir<br>
      And Herhangi bir kategori secilip urun listeleme sayfasina yonlendirilir<br>
     Then Secilen urun kategorisinin listelendigi gorulur<br>


