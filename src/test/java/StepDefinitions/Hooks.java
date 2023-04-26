package StepDefinitions;

import Utilities.BasicDriver;
import io.cucumber.java.After;

public class Hooks {
    @After
    public void afterScenario() {
        BasicDriver.quitDriver();
    }

}
