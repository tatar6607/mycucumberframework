package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AutomationPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.swing.*;

public class KullaniciKayitAutomationStepDef {
    AutomationPage automationPage = new AutomationPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    String firstname;
    String lastname;
    String email;


    @Given("user web sayfasinda")
    public void user_web_sayfasinda() {
        Driver.getDriver().get(ConfigurationReader.getProperty("automation_url"));
    }

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].click()", automationPage.siginButton);
    }

    @Given("user Create and account bolumune email adresi girer")
    public void user_Create_and_account_bolumune_email_adresi_girer() {
        email = faker.internet().emailAddress();
        automationPage.createAccountEmailTextbox.sendKeys(email);
    }

    @Given("Create an Account butonuna basar")
    public void create_an_Account_butonuna_basar() {
        automationPage.createAccountButton.click();
    }

    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        automationPage.genderRadioButton.click();
        firstname = faker.name().firstName();
        lastname = faker.name().lastName();
        automationPage.firstname1.sendKeys(firstname);
        automationPage.lastname1.sendKeys(lastname);
        automationPage.emailTextBox.click();
        automationPage.emailTextBox.clear();
        automationPage.emailTextBox.sendKeys(email);
        automationPage.passwordTextBox.sendKeys(faker.internet().password());
        Select options1 = new Select(automationPage.daysDropDown);
        options1.selectByIndex(21);
        Select options2 = new Select(automationPage.monthsDropDown);
        options2.selectByIndex(6);
        Select options3 = new Select(automationPage.yearsDropDown);
        options3.selectByValue("1980");

        automationPage.firstname2.sendKeys(firstname);
        automationPage.lastname2.sendKeys(lastname);
        automationPage.company.sendKeys(faker.company().name());
        automationPage.address1.sendKeys(faker.address().fullAddress());
        automationPage.address2.sendKeys(faker.address().cityPrefix());
        automationPage.city.sendKeys(faker.address().cityName());
        Select optionsState = new Select(automationPage.stateDropDown);
        optionsState.selectByIndex(8);
        automationPage.postcode.sendKeys("31785");
        Select optionsCountry = new Select(automationPage.countryDropDown);
        optionsCountry.selectByIndex(1);
        automationPage.noteTextBox.sendKeys(faker.lorem().paragraph());
        automationPage.homePhone.sendKeys("7630295057");
        automationPage.mobilePhone.sendKeys("7630295057");
        automationPage.aliasName.clear();
        automationPage.aliasName.sendKeys(faker.name().username());

    }

    @Given("user Register butonuna basar")
    public void user_Register_butonuna_basar() {
        automationPage.register.click();
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
//        wait.until(ExpectedConditions.visibilityOf(automationPage.myAccount));
    }

    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {
//        Assert.assertTrue(automationPage.myAccount.getText().contains("MY ACCOUNT"));
        Assert.assertTrue(automationPage.accountName.getText().contains(firstname));
        System.out.println(automationPage.accountName.getText());
    }
    @And("email kutusuna gecersiz email adresi yazar ve enter'a tiklar")
    public void emailKutusunaGecersizEmailAdresiYazarVeEnterATiklar() {
        automationPage.emailTextBox2.sendKeys("abcdef@mail.com");
        automationPage.passwordTextBox2.sendKeys("12345678");
        automationPage.siginButton.click();
    }

    @Then("error mesajinin Authentication failed. oldugunu dogrulayin")
    public void errorMesajininAuthenticationFailedOldugunuDogrulayin() {
        Assert.assertTrue(automationPage.errorMessage.getText().contains("Authentication"));
    }

    @Given("imleci Women linkinin uzerine ve daha sonra Tshirts'e tiklayin")
    public void imleci_Women_linkinin_uzerine_ve_daha_sonra_Tshirts_e_tiklayin() {
     actions.moveToElement(automationPage.woman).moveToElement(automationPage.tShirt).click().perform();

    }

    @Given("sayfada gorunen ilk urunun textini alin")
    public void sayfada_gorunen_ilk_urunun_textini_alin() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(automationPage.product1));
        System.out.println(automationPage.product1.getText());
    }

    @Given("sayfada ustte bulunan arama cubuguna ayni urun ismini girin ve search butonuna basin")
    public void sayfada_ustte_bulunan_arama_cubuguna_ayni_urun_ismini_girin_ve_search_butonuna_basin() {
        automationPage.searchBox.sendKeys(automationPage.product1.getText() + Keys.ENTER);
    }

    @Then("acilan sayfada cikan urunun T-Shirt sayfasinda goruntulenen urunle ayni oldugunu dogrulayin")
    public void acilan_sayfada_cikan_urunun_T_Shirt_sayfasinda_goruntulenen_urunle_ayni_oldugunu_dogrulayin() {
      Assert.assertTrue(automationPage.product1.getText().equals(automationPage.product2.getText()));
    }



}
