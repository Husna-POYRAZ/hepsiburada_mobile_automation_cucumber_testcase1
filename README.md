# Mobile Automation with Cucumber in Java

@search<br>
<br>Feature: Konum kaydetme senaryosu
<br>Misafir kullanıcısı olarak uygulamayı açıp
<br>İl,ilçe,mahalle girerek konum kaydedip
<br>Herhangi bir kategoriye ait ürünleri listelemek istiyorum.

@quick-cases<br>
  Scenario: 1-Konum kaydetme<br>
    Given Uygulama acilir<br>
     When Anasayfada Konum alanina tiklanir<br>
      And İl ilce ve mahalle secilir ve kaydet butonuna tiklanir<br>
      And Tab bar uzerinden kategoriler tabına tiklanir<br>
      And Herhangi bir kategori secilip urun listeleme sayfasina yonlendirilir<br>
     Then Secilen urun kategorisinin listelendigi gorulur<br>


