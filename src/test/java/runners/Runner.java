package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //@RunWith ==> cucumber.class ile birlikte calistir.
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                  "json:target/json-reports/cucumber.json",
                  "junit:target/xml-report/cucumber.xml"
        },
        features = "src\\test\\resources\\features", // gerkin dili olan feature //1. sabit
        glue = "stepdefinitions", // java kodlarinin yazildi yer oldugu icin bunuda buraya yapistirdik. //2. sabit
        tags = "@Deneme123", /// sadece calistirmak istedigimiz featureleri yaziyoruz. birden fazla ise aralarina "or" yazilir. ==> "@abc or @def"
        // plugin = "html:target/cucumber", // rapor almak icin plugin kullaniyoruz html raporu ve target ta cucumbere kaydet
        dryRun = false//tarayiciyi acip acmamaya karar verir. true acar. false tayiciyi acmadan kontrol edder.
)

public class Runner {

}
