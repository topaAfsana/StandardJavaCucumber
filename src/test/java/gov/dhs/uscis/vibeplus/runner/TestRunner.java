package gov.dhs.uscis.vibeplus.runner;


import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"/Users/abraartishan/Desktop/TOPA_QA/CODE BASE/StandardCucumberJavaFrame/src/test/java/gov/dhs/uscis/vibeplus"},
        glue="gov/dhs/uscis/vibeplus/stepdefs",
        tags="@Test",
        plugin={"pretty"}
)


public class TestRunner {
}
