package com.verizon.mavencucumberapp1;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

import com.verizon.cut.Belly;

public class StepDefinitions {

    @Given("I have {int} cakes in my belly")
    public void I_have_cakes_in_my_belly(int cakes) {
    	Belly belly=new Belly();
    	belly.eat(cakes);
    }

    @When("I wait 1 hour")
    public void allStepDefinitionsAreImplemented() {
    	Belly belly=new Belly();
    	belly.waitStep();
    }

    @Then("my belly should grow")
    public void theScenarioPasses() {
    	Belly belly=new Belly();
    	belly.endProcess();
    }
    

}
