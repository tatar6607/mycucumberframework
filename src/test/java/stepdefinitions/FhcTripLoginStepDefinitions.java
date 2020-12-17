package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FhcLoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FhcTripLoginStepDefinitions {
    FhcLoginPage fhcLoginPage = new FhcLoginPage();

    @Given("user is on the fhctriplogin page")
    public void user_is_on_the_fhctriplogin_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
    }

    @Given("user enters valid username")
    public void user_enters_valid_username() {
        fhcLoginPage.usernameTextbox.sendKeys(ConfigurationReader.getProperty("valid_username"));
    }

    @Given("user enters  valid password")
    public void user_enters_valid_password() {
        fhcLoginPage.passwordTextbox.sendKeys(ConfigurationReader.getProperty("valid_password"));

    }

    @Given("user clicks login button")
    public void user_clicks_login_button() {
        fhcLoginPage.loginButton.click();

    }

    @Then("verify login is successfull")
    public void verify_login_is_successfull() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("ListOfUsers"));
    }

    //===== invalid test ===//
    @Given("user enters invalid username")
    public void user_enters_invalid_username() {
        fhcLoginPage.usernameTextbox.sendKeys(ConfigurationReader.getProperty("invalid_username"));
    }

    @Given("user enters  invalid password")
    public void user_enters_invalid_password() {
        fhcLoginPage.passwordTextbox.sendKeys(ConfigurationReader.getProperty("invalid_password"));
    }


    @Then("verify login is not successfull")
    public void verify_login_is_not_successfull() {
        Assert.assertTrue(fhcLoginPage.errorMessage.isDisplayed());
        System.out.println("Error mesaj:" + fhcLoginPage.errorMessage.getText());
    }

    @Given("user enters valid username {string}")
    public void user_enters_valid_username(String string) {
        fhcLoginPage.usernameTextbox.sendKeys(string);
    }

    @Given("user enters  valid password {string}")
    public void user_enters_valid_password(String string) {
        fhcLoginPage.passwordTextbox.sendKeys(string);
    }


}
