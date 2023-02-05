package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\feature\\fashion.feature",
glue={"com.stepdefenition","com.hooks"},
dryRun=false,
plugin = {"html:report/fashiontiy.html"},
publish=true



)


public class Runner {

}
