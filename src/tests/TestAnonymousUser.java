package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.TestRoot;

public class TestAnonymousUser extends TestRoot {

	@BeforeMethod
	public void before() {
		if (!setup()) {
			Assert.fail("Could not load driver");
		}
	}

	@Test
	public void AnonymousUserWorkflow() {

		// check location setup

		// behavior.LocationSetup.clickSkipButton(driver);
		// Assert.assertTrue("location is ON'",
		// behavior.Gate.clickMaybeLater(driver));

		// Click maybe later
		behavior.AnonymousUser.clickMayBeLater(driver);
		// Select a single genre, assert we can click done
		behavior.GenreGame.selectGenre(driver);
		// Assert.assertTrue("Selected genre",
		// behavior.Disclaimer.acceptDisclaimer(driver));
		// Assert.assertTrue("Could not click done after selecting genres",
		// behavior.GenreGame.clickDone(driver));
		// Accept disclaimer

		behavior.Disclaimer.acceptDisclaimer(driver);
		// Assert.assertTrue("Disclaimer did not show'",
		// behavior.AnonymousUser.getDefaultlocation(driver));

		// behavior.AnonymousUser.getDefaultlocation(driver);
		behavior.AnonymousUser.getSongTitle(driver);
		behavior.AnonymousUser.getStationName(driver);
		behavior.AnonymousUser.getArtistName(driver);

		behavior.AnonymousUser.createStation(driver);
		behavior.AnonymousUser.favoriteStation(driver);
		behavior.AnonymousUser.thumbStation(driver);

		behavior.AnonymousUser.recentStations(driver);
		behavior.AnonymousUser.FavoriteAStation(driver);
		behavior.AnonymousUser.ForYouStations(driver);

		behavior.ArtistRadio.searchPlayArtistRadio(driver);
		behavior.Podcasts.searchPlayPodcast(driver);

		behavior.LiveRadio.playStationNearYou(driver);
		behavior.LiveRadio.playStationbylocation(driver);
		behavior.LiveRadio.playStationByGenre(driver);

		behavior.AnonymousUser.scanStation(driver);
	}

	@AfterMethod
	public void after() {
		quit();
	}
}
