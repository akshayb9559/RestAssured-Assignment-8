package stepDefinitions;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Features", glue = { "stepDefinitions" })
public class TestNG_Annotation_Runner extends TestNG_Annotation_Step{

}
