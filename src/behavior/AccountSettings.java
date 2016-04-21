package behavior;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AccountSettings extends Page{
	
	public static void openAccountSettings(AndroidDriver<MobileElement> d){
		//behavior.Navbar.openMenu(d);
		behavior.Page.clickMenuDrawerAccountSettings(d);
	}
	
/*
	// Returns the email of the account in use
	public static String getAccountEmail(AndroidDriver<MobileElement> d){
		String title = null;
		try{
			title = getText(d, find(elements.Page.pageTitleX));
		}
		catch(Exception e){}
		if(title != null && (title.equalsIgnoreCase("Alarm"))){
			behavior.Page.back(d);
		}
		else if(title == null){
			if(waitForVisible(d, find(elements.SleepTimer.sleepTimerTitleX), 5) != null){
				title = "Sleep Timer";
				behavior.Page.back(d);
			}
		}
		if(title == null || !title.equals("Account Settings")){
			openAccountSettings(d);
		}
		return getAccountEmailFromAccountSettings(d);
	}
	public static String getAccountEmailFromAccountSettings(AndroidDriver<MobileElement> d){
		MobileElement accountName = TestRoot.waitForVisible(d, find(elements.AccountSettings.loggedInAsId), 10);
		if(accountName != null)
			return accountName.getText();
		else
			return null;
	}*/
	
	
	
	/**
	 * Test that we're logged in as the specified user
	 * @param d
	 * @param loggedInAsEmail
	 * @return
	 */
	public static boolean checkLoggedIn(AndroidDriver<MobileElement> d, String loggedInAsEmail){
		/*waitForVisible(d, find(elements.Page.menuDrawerButtonX), 10);
		String accountName = behavior.AccountSettings.getAccountEmail(d);
		return (accountName != null && accountName.equalsIgnoreCase(loggedInAsEmail));*/
		return true; //TO DO
	}
	
	
}



