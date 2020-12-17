package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.GooglePage;
import utilities.Driver;

public class GoogleSearchStepDefinitions {
    GooglePage googlePage = new GooglePage();

    @Given("user is in the google page")
    public void user_is_in_the_google_page() {
        Driver.getDriver().get("https://www.google.com");

    }

    @Given("user searches teapod")
    public void user_searches_teapod() {
        googlePage.searchBox.sendKeys("teapot");
        googlePage.searchBox.submit();

    }

    @Then("verify result has teapot")
    public void verify_result_has_teapot() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("teapot"));

    }

    @Given("user searches nokia")
    public void user_searches_nokia() {

        googlePage.searchBox.sendKeys("nokia" + Keys.ENTER);
    }

    @Then("verify result has nokia")
    public void verify_result_has_nokia() {
    Assert.assertTrue(Driver.getDriver().getTitle().contains("nokia"));

    }

    @Given("user searches {string}")
    public void user_searches(String string) {
     googlePage.searchBox.sendKeys(string);
     googlePage.searchBox.submit();
    }

    @Then("verify result has {string}")
    public void verify_result_has(String string) {
        String googleTitle = Driver.getDriver().getTitle();
        System.out.println("Google Title: " + googleTitle);
        Assert.assertTrue(googleTitle.contains(string));
//        boolean hasValue = false;
//        for(WebElement w : googlePage.allLinks) {
//            if(w.getText().contains(string)) {
//                hasValue=true;
//                System.out.println("Link Text: " + w.getText());
//            }
//        }
//        Assert.assertTrue(hasValue);
    }



}
