package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.AutomationPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.*;

public class AutomationProductPricesStepDefinations {
    AutomationPage automationPage = new AutomationPage();
    List<Double> allPrice = new ArrayList<>();

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("automation_url"));
    }

    @Given("User click Dresses link")
    public void user_click_Dresses_link() {
        automationPage.dressesLink.click();
    }

    @Given("User see all product price  then to do list all product and price")
    public void user_see_all_product_price_then_to_do_list_all_product_and_price() {
        WebElement element = Driver.getDriver().findElement(By.xpath("(//div[@class='product-count'])[2]"));
        JavascriptExecutor jsExecutor = ((JavascriptExecutor) Driver.getDriver());
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        int i = 1;
        Double price =0.0;
        String productName = "";
        Map<String,Double> hMap= new HashMap<>();
        for (WebElement w : automationPage.allProductPrice) {
            if (!w.getText().equals("")) {
                System.out.println(i++ + ".product: " + w.getText());
                price = new Double(w.getText().substring(1));
                allPrice.add(new Double(w.getText().substring(1)));
            }
        }
        int x =0;
        for(WebElement n : automationPage.allProductName) {
            productName = n.getText();
            hMap.put(productName,allPrice.get(x++));
        }
        System.out.println(hMap);
        System.out.println("Listedeki toplam eleman sayisi :" + automationPage.allProductPrice.size());
    }

    @Given("select highest price product.")
    public void select_highest_price_product() {
        Collections.sort(allPrice);
        System.out.println(allPrice.get(allPrice.size() - 1));
    }

    @Then("Verify selected product price expensive than {int} USD")
    public void verifySelectedProductPriceExpensiveThanUSD(int arg0) {
        double highPrice = allPrice.get(allPrice.size() - 1);
        Assert.assertTrue(highPrice > arg0);
        System.out.println("En Yuksek Fiyat: " + highPrice);

    }
}
