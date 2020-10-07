package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import screens.DataPrivacyScreen;
import screens.MainScreen;
import screens.WelcomeScreen;
import util.tests.BaseMobileTest;

public class DataPrivacyTest extends BaseMobileTest {

	/**
	 * Verify something.
	 * 
	 * @author AnyOne
	 * 
	 */
	//@Parameters({ "someParameter", "someParameter" })
	@Test(groups = { "workshop" })
	public void acceptDataPrivacy() {
		WelcomeScreen welcomeScreen = returnWelcomeScreen();
		welcomeScreen.tabOnColombiaListItem();
		DataPrivacyScreen dataPrivacyScreen = welcomeScreen.tabOnConfirmButton();
		//asserts
		Assert.assertTrue(dataPrivacyScreen.titleExists());
		Assert.assertTrue(dataPrivacyScreen.firstParagraphExists());
		Assert.assertTrue(dataPrivacyScreen.secondParagraphExists());
		Assert.assertTrue(dataPrivacyScreen.thirdParagraphExists());

		MainScreen mainScreen = dataPrivacyScreen.tabOnAcceptAllButton();
		Assert.assertFalse(dataPrivacyScreen.titleExists());

	}

}
