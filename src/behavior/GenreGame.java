package behavior;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GenreGame extends Page {

	public static boolean selectGenre(AndroidDriver<MobileElement> d){
		waitToClick(d, find(elements.GenreGame.genreGamePage1Item1),5);
		//return isVisible(elements.GenreGame.GenreSelected) ;
		waitToClick(d, find(elements.GenreGame.GenreContinueBtn), 3);
		return isVisible(elements.Disclaimer.disclaimerTitle);
	}
	
	

	public static boolean clickDone(AndroidDriver<MobileElement> d) {
		waitToClick(d, find(elements.GenreGame.GenreContinueBtn),5);
		return isVisible(elements.Disclaimer.disclaimerTitle);
	}
	
}
	
	
