package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
//import org.testng.Assert;
import org.testng.annotations.*;

import utilities.TestRoot;

public class TestGate extends TestRoot{
	@BeforeTest
	public void before(){
		if(!setup()){
			AssertJUnit.fail("Could not load driver");
		}
	}
	@AfterTest
	public void after(){
		quit();
	}
	
	@Test
	public void testSignUpButton(){
		AssertJUnit.assertTrue(behavior.Gate.clickSignUp(driver));
	
	}
	
	
	@Test
	public void testLogInButton(){
		AssertJUnit.assertTrue(behavior.Gate.clickLogIn(driver));
	}
	
	@Test
	public void testMaybeLaterButton(){
		AssertJUnit.assertTrue(behavior.Gate.clickMaybeLater(driver));
	}
	
}

