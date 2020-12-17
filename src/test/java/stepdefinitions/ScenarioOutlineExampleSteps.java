package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ScenarioOutlineExamplePage;
import utilities.Driver;

public class ScenarioOutlineExampleSteps {
    ScenarioOutlineExamplePage scenarioOutlineExamplePage = new ScenarioOutlineExamplePage();

    @Given("User is on the datatables homepage")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");

    }

    @When("User clicks on new button")
    public void user_clicks_on_new_button() {
        scenarioOutlineExamplePage.newButton.click();
    }

    @When("User enters first name")
    public void user_enters_first_name() {
        scenarioOutlineExamplePage.firstName.sendKeys("AlexBey");
    }

    @When("User enters last name")
    public void user_enters_last_name() {
        scenarioOutlineExamplePage.lastName.sendKeys("Cordoba");

    }

    @When("User enters position")
    public void user_enters_position() {
        scenarioOutlineExamplePage.position.sendKeys("QA");
    }

    @When("User enters office")
    public void user_enters_office() {
        scenarioOutlineExamplePage.office.sendKeys("Paris");
    }

    @When("User enters extension")
    public void user_enters_extension() {
        scenarioOutlineExamplePage.extension.sendKeys("7777");
    }

    @When("User enters start date")
    public void user_enters_start_date() {
        scenarioOutlineExamplePage.startDate.sendKeys("2020-07-23");

    }

    @When("User enters salary")
    public void user_enters_salary() {
        scenarioOutlineExamplePage.salary.sendKeys("120000");

    }

    @When("User clicks Create button")
    public void user_clicks_Create_button() {
        scenarioOutlineExamplePage.createButton.click();
    }

    @When("User enters first name to the searchbox")
    public void user_enters_first_name_to_the_searchbox() {
        scenarioOutlineExamplePage.searchBox.sendKeys("AlexBey");
    }

    @Then("verify that user see the first name in the searchbox")
    public void verify_that_user_see_the_first_name_in_the_searchbox() {
        String name = scenarioOutlineExamplePage.firstDataBox.getText();
        Assert.assertTrue(name.contains("AlexBey"));
    }

    // 01 Example
    @When("User enters first name {string}")
    public void user_enters_first_name(String string) {
        scenarioOutlineExamplePage.firstName.sendKeys(string);
    }

    @When("User enters last name {string}")
    public void user_enters_last_name(String string) {
        scenarioOutlineExamplePage.lastName.sendKeys(string);
    }

    @When("User enters position {string}")
    public void user_enters_position(String string) {
        scenarioOutlineExamplePage.position.sendKeys(string);
    }

    @When("User enters office {string}")
    public void user_enters_office(String string) {
        scenarioOutlineExamplePage.office.sendKeys(string);
    }

    @When("User enters extension {string}")
    public void user_enters_extension(String string) {
        scenarioOutlineExamplePage.extension.sendKeys(string);
    }

    @When("User enters start date {string}")
    public void user_enters_start_date(String string) {
        scenarioOutlineExamplePage.startDate.sendKeys(string);
    }

    @When("User enters salary {string}")
    public void user_enters_salary(String string) {
        scenarioOutlineExamplePage.salary.sendKeys(string);
    }

    @When("User enters first name {string} to the searchbox")
    public void user_enters_first_name_to_the_searchbox(String string) {
        scenarioOutlineExamplePage.searchBox.sendKeys(string);
    }

    @Then("verify that user see the first name {string}  in the searchbox")
    public void verify_that_user_see_the_first_name_in_the_searchbox(String string) {
        String name = scenarioOutlineExamplePage.firstDataBox.getText();
        Assert.assertTrue(name.contains(string));
    }


}
