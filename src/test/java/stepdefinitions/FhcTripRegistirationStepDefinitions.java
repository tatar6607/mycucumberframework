package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FhcLoginPage;
import pages.FhcRegistirationPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class FhcTripRegistirationStepDefinitions {
    FhcLoginPage fhcLoginPage = new FhcLoginPage();
    FhcRegistirationPage fhcRegistirationPage = new FhcRegistirationPage();
    Faker faker;

    @Given("kullanici fc trip sayfasindadir")
    public void kullanici_fc_trip_sayfasindadir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
    }

    @Given("kullanici create a new account butonuna tiklar")
    public void kullanici_create_a_new_account_butonuna_tiklar() {
        // Javascript executer ile click yaptim.
        JavascriptExecutor jsExecuter = (JavascriptExecutor) Driver.getDriver();
        jsExecuter.executeScript("arguments[0].click();", fhcLoginPage.createButton);

    }

    @Given("kullanici username girer {string}")
    public void kullanici_username_girer(String string) {
        Faker faker = new Faker();
        string = faker.name().username();
        fhcRegistirationPage.username.sendKeys(string);
    }

    @Given("kullanici password girer {string}")
    public void kullanici_password_girer(String string) {
        fhcRegistirationPage.password.sendKeys(string);
    }

    @Given("kullanici email girer {string}")
    public void kullanici_email_girer(String string) {
        faker = new Faker();
        string = faker.internet().emailAddress();
        fhcRegistirationPage.mail.sendKeys(string);
    }

    @Given("kullanici fullname girer  {string}")
    public void kullanici_fullname_girer(String string) {
        fhcRegistirationPage.fullname.sendKeys(string);
    }

    @Given("kullanici phone girer {string}")
    public void kullanici_phone_girer(String string) {
        fhcRegistirationPage.phone.sendKeys(string);
    }

    @Given("kullanici SSN girer {string}")
    public void kullanici_SSN_girer(String string) {
        fhcRegistirationPage.ssnumber.sendKeys(string);
    }

    @Given("kullanici Driven lisans girer {string}")
    public void kullanici_Driven_lisans_girer(String string) {
        fhcRegistirationPage.drivingLicense.sendKeys(string);
    }

    @Given("kullanici country dropdown secer")
    public void kullanici_country_dropdown_secer() {
        Select optionsCountry = new Select(fhcRegistirationPage.Country);
        optionsCountry.selectByVisibleText("United States");
    }

    @Given("kullanici state dropdown secer")
    public void kullanici_state_dropdown_secer() {
      Select optionsState = new Select(fhcRegistirationPage.state);
      optionsState.selectByIndex(5);
    }

    @Given("kullanici adress girer {string}")
    public void kullanici_adress_girer(String string) {
       fhcRegistirationPage.address.sendKeys(string);
    }

    @Given("kullanici working sector girer {string}")
    public void kullanici_working_sector_girer(String string) {
        fhcRegistirationPage.sector.sendKeys(string);
    }

    @Given("kullanici birthday girer {string}")
    public void kullanici_birthday_girer(String string) {
        fhcRegistirationPage.birtdate.sendKeys(string);
    }

    @Then("save butonuna tiklar")
    public void save_butonuna_tiklar() {
        ((JavascriptExecutor)Driver.getDriver()).
                executeScript("arguments[0].click()",fhcRegistirationPage.saveButton);
    }

    @And("kullanici {string} mesajini goruntuler.")
    public void kullaniciMesajiniGoruntuler(String arg0) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(fhcRegistirationPage.successfullyMessage));
        System.out.println("Succes message: " + fhcRegistirationPage.successfullyMessage.getText() );
        Assert.assertTrue(fhcRegistirationPage.successfullyMessage.getText().equals(arg0));
    }

    @Then("kullanici alert mesajindaki OK butonuna tiklar.")
    public void kullaniciAlertMesajindakiOKButonunaTiklar() {
                fhcRegistirationPage.okButton.click();
    }
}
