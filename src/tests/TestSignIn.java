package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.*;

import utilities.TestRoot;


@SuppressWarnings("unused")
public class TestSignIn extends TestRoot{
	
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
	
	// Sign in from gate
	@Test
	public void testSignInFromGate(){
		if(behavior.Gate.clickLogIn(driver)){
			behavior.Account.signIn(driver);
			AssertJUnit.assertTrue(behavior.AccountSettings.checkLoggedIn(driver, elements.AccountSettings.iHeartAccountEmail));
		}
		else{
			AssertJUnit.fail("Could not click login");
		}
	}
	

	
	
}
