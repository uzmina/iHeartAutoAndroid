package behavior;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileBy;


public class Disclaimer extends Page {
	
	public static boolean acceptDisclaimer(AndroidDriver<MobileElement> d){
		MobileElement disclaimerText = waitForVisible(d, find(elements.Disclaimer.disclaimerTextDesc),10);
		System.out.println("This is the disclaimer pop  - " + disclaimerText.getText());
		MobileElement acceptDisclaimer = waitForVisible(d, find(elements.Disclaimer.acceptDisclaimerButton),10);
		acceptDisclaimer.click();
		System.out.println("accept button clicked");
		MobileElement auxConnectGrowl = waitForVisible(d, MobileBy.id(elements.AnonymousUser.auxConnectedGrowl),10);
		System.out.println("Aux is connected growl visible  - " + auxConnectGrowl.getText() );
		return waitForVisible(d, MobileBy.id(behavior.AnonymousUser.getDefaultlocation(d)),10) != null;
		
	}
	

	public void denyDisclaimer(AndroidDriver<MobileElement> d){
		waitToClick(d, find(elements.Disclaimer.denyDisclaimerButton),10);
		
	}
	

}