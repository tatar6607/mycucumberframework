@UserRegister
Feature: Kullanici Kayıt Islemi Otomasyonu

  @userReg
  Scenario: Kullanici Kayıt
    Given user web sayfasinda
    And user sign in linkine tiklar
    And user Create and account bolumune email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrulayin

  @AutomationNegative
  Scenario:Geçersiz email ve password hatasını doğrulayın.
    Given user web sayfasinda
    And user sign in linkine tiklar
    And email kutusuna gecersiz email adresi yazar ve enter'a tiklar
    Then error mesajinin Authentication failed. oldugunu dogrulayin

  @SearchProduct
  Scenario:Automation Practise 3
    Given user web sayfasinda
    And imleci Women linkinin uzerine ve daha sonra Tshirts'e tiklayin
    And sayfada gorunen ilk urunun textini alin
    And sayfada ustte bulunan arama cubuguna ayni urun ismini girin ve search butonuna basin
    Then acilan sayfada cikan urunun T-Shirt sayfasinda goruntulenen urunle ayni oldugunu dogrulayin