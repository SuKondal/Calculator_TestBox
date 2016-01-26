package com.ruks.step;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import junit.framework.Assert;

import com.ruks.core.Multiplication;

@SuppressWarnings("deprecation")
public class MultiplicationStep {
	private Multiplication mulCal;
	
	@Given("a calculatorM")
	public void setMultiplyCal() {
		mulCal=new Multiplication();
		System.out.println("Multiplication Created");
	}

	
   @When("i multiply <number1> and <number2>")  
	public void MultiplyCal(@Named("number1") int x, @Named("number2") int y) {
	   mulCal.multiplyTwoNumber(x, y);
	}

    @Then("the outcome should be <result>")  
	public void testResultMultiplyCal(@Named("result") int output) {
		 Assert.assertEquals(output, mulCal.getMultiplyresult());

	    	System.out.println("AJIT: testResultMultiplyCal ");

		 //if(myCal.getresult()==output)
		 //System.out.println("AJIT: " +myCal.getresult());
	}
}
