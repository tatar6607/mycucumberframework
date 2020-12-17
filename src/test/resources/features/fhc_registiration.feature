@fhcregister
Feature: FhcTrip Registiration
  @SingleDataRegister
  Scenario: fhcTrip registiration test
    Given kullanici fc trip sayfasindadir
    And kullanici create a new account butonuna tiklar
    And kullanici username girer "Ahmet"
    And kullanici password girer "123Manager!"
    And kullanici email girer "faker ile olusturuluyor"
    And kullanici fullname girer  "Ahmet Ali Bey"
    And kullanici phone girer "0312456879"
    And kullanici SSN girer "010102098"
    And kullanici Driven lisans girer "010203AB01"
    And kullanici country dropdown secer
    And kullanici state dropdown secer
    And kullanici adress girer "Asagiayranci"
    And kullanici working sector girer "QA"
    And kullanici birthday girer "2/21/1980"
    And save butonuna tiklar
    And kullanici "User Data was inserted successfully" mesajini goruntuler.
    Then kullanici alert mesajindaki OK butonuna tiklar.


  @RegisterOutlineData
  Scenario Outline: FhcTrip registiration test

    Given kullanici fc trip sayfasindadir
    And kullanici create a new account butonuna tiklar
    And kullanici username girer "<name>"
    And kullanici password girer "<password>"
    And kullanici email girer "<mail>"
    And kullanici fullname girer  "<fullname>"
    And kullanici phone girer "<phone>"
    And kullanici SSN girer "<ssnumber>"
    And kullanici Driven lisans girer "<ehliyet>"
    And kullanici country dropdown secer
    And kullanici state dropdown secer
    And kullanici adress girer "<adress>"
    And kullanici working sector girer "<sector>"
    And kullanici birthday girer "<birhday>"
    Then save butonuna tiklar

    Examples:
    |name      |password|mail                   |fullname|phone      |ssnumber |ehliyet   |adress       |sector|birhday   |
    |Ali Veli  |123Ma!  |faker ile olusturuluyor|Ali Can |12365478956|123457987|123ABc1232|Asagi Ayranci|QA    |20/01/2001|

