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



//ISSUE:JRE/JDK/COMPILER ISSUE
//
//SOLUTION:
//1.CHANGE BUILD PATH IN ECLIPSE JRE TO JDK
//       ADD JDK AS  ALTERNATE INSTALLED ONE AND AS EXECUTE JDK
//2.ADD SETTINGS FILE TO .M2 FOLDER
//        UNDER USER FOLDER
//3.MAVEN COMPILER PLUG IN TO RIGHT JAVA VERSION 1.8 OR SO
//IN POM FILE PLUG IN SECTION
//<plugin>
//<groupId>org.apache.maven.plugins</groupId>
//<artifactId>maven-compiler-plugin</artifactId>
//<version>3.8.1</version>
//<configuration>
//<source>1.8</source>
//<target>1.8</target>
//</configuration>
//</plugin>