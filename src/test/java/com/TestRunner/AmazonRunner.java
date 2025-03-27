package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*
 * To run single scenario: tags="@fashionpage"
 * To multiple scenarios : tags="@fashionpage or @bookpage or @homepage"
 * To skip any one specific scenario: tags=" not @fashionpage"
 * To skip multiple scenarios
 * 1.add scenario with @ignore
 * 2.in runner just add tags="not @ignore"
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Amazon.feature",
					glue="com.stepdef",
					tags="not @ignore")
public class AmazonRunner {

}
