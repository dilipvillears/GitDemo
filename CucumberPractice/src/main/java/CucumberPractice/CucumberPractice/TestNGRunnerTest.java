package CucumberPractice.CucumberPractice;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features = "src/main/java/CucumberPractice/CucumberPractice", glue = "CucumberPractice.stepDefinition"
, monochrome= true, plugin= {"html:target/cucumber.html"})
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {
	
	
	
	
	

}
