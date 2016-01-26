package com.ruks.step;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import junit.framework.Assert;

import com.ruks.core.Division;

@SuppressWarnings("deprecation")
public class DivisionStep {
	private Division divCal;
	
	@Given("a calculatorD")
	public void setDivideCal() {
		divCal=new Division();
		System.out.println("Division Created");
	}

	
   @When("i divide <number1> with <number2>")  
	public void DivideCal(@Named("number1") int x, @Named("number2") int y) {
	   divCal.divideTwoNumber(x, y);
	}

    @Then("the outcome should be <result>")  
	public void testResultDivideCal(@Named("result") int output) {
		 Assert.assertEquals(output, divCal.getDivideresult());

	    	System.out.println("AJIT : testResultDivideCal ");

	}
}
