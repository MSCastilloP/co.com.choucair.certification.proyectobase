package co.com.choucair.certification.proyectobase.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/technicalTest.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.proyectobase.stepdefinitions",
        snippets = SnippetType.CAMELCASE)


public class RunnerTags {


}
