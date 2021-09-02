package com.qa.runners;


import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.ServerManager;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.apache.logging.log4j.ThreadContext;
import org.testng.annotations.*;

import java.awt.*;

@CucumberOptions(
        plugin = {"pretty"
        , "html:target/Pixel4A/cucumber/report.html"
        , "summary"
        , "de.monochromata.cucumber.report.PrettyReports:target/Pixel4A/cucumber-html-reports"}
        ,features = {"src/test/resources"}
        ,glue = {"com.qa.stepdef"}
        ,dryRun=false
        ,monochrome=true
        ,strict=true
        ,tags = "@test")

public class Pixel4ATestNGRunner extends RunnerBase{
}