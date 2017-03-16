package com.hamsa.seleniumcucumber.training.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "html:target/cucumber-html-report", "json:target/cucumber.json" }, features = {
		"src/test/resources/features" }, glue = "com.hamsa.seleniumcucumber.training.steps")

public class TestRunner {
}