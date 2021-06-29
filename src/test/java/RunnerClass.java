import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"C:\\Users\\91812\\IdeaProjects\\Selenium_Maven\\Cucumber\\Cucumber_Demo\\src\\test\\resources\\Naukri.feature"}
        ,glue={"C:\\Users\\91812\\IdeaProjects\\Selenium_Maven\\Cucumber\\Cucumber_Demo\\src\\test\\java\\StepDefenition.java"}
)

public class RunnerClass {


}


