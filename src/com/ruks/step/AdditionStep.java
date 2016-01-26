package com.ruks.step;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import junit.framework.Assert;

import com.ruks.core.Addition;

@SuppressWarnings("deprecation")
public class AdditionStep {
	private Addition myCal;
	
	@Given("a calculatorA")
	public void setAddCal() {
		myCal=new Addition();
		System.out.println("Addition Created");
	}

	
   @When("i add <number1> and <number2>")  
	public void AddCal(@Named("number1") int x, @Named("number2") int y) {
		myCal.addTwoNumber(x, y);
	}

    @Then("the outcome should be <result>")  
	public void testResultAddCal(@Named("result") int output) {
		 Assert.assertEquals(output, myCal.getAddresult());
		 
		 System.out.println("AJIT: testResultAddCal " );
	}
}
