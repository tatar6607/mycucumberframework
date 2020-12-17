package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@first",
        dryRun = false

        // paralel testingi baslatmak icin  console a ==> mvn clean verify <== yazmak gereklidir.
)

public class FirstTestRunner {
}
