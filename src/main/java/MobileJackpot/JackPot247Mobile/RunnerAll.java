 package MobileJackpot.JackPot247Mobile;


	import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

	// runner class
	

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(features = {"src\\main\\resources\\"},format={"pretty","html:target/site/cucumber-pretty",
		"json:target/cucumber.jason"},tags = {"~@ignore"})
//@Cucumber.Options(format={"html:output"}
	
	public class RunnerAll {
	
		
	
		
	
}
