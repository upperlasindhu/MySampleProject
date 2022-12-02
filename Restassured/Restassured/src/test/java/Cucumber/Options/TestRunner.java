package Cucumber.Options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features/sample.feature" ,
glue= {"StepDefination"})
public class TestRunner {	

}
