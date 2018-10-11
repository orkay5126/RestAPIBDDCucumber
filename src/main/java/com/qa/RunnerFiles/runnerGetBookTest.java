package com.qa.RunnerFiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\java\\com\\qa\\FeatureFiles\\GETBookFeature.feature",
		glue = {"com.qa.StepDefinitions"},
		plugin = {"pretty","html:test-outout","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		dryRun = false,
		monochrome = true
		)


public class runnerGetBookTest {

}
