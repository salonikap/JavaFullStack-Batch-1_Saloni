package com.verizon.mavencucumberapp1;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("com.verizon.cut")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "src.main.java")
public class RunCucumberTest {
}
 