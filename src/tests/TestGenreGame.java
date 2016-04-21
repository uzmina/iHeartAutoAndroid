package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
//import behavior.GenreGame;
import utilities.TestRoot;

public class TestGenreGame extends TestRoot{
	
	@BeforeMethod
	public void before(){
		if(!setup()){
			AssertJUnit.fail("Could not load driver");
		}
	}
	@AfterMethod
	public void after(){
		quit();
	}
	
	// Test anonymous user logging in and using app
	@Test
	
	
	
	public void testSingleGenreSelection(){
		// Click maybe later
		 behavior.AnonymousUser.clickMayBeLater(driver);
		// Select a single genre, assert we can click done
		AssertJUnit.assertTrue("Could not select genres", behavior.GenreGame.selectGenre(driver));
		AssertJUnit.assertTrue("Could not click done after selecting genres", behavior.GenreGame.clickDone(driver));
	}
	
	
	
}

