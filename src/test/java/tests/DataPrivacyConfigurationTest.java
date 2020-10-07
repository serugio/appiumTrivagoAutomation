package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DataPrivacyConfigScreen;
import screens.MainScreen;
import screens.SettingsScreen;
import util.tests.BaseMobileTest;

public class DataPrivacyConfigurationTest extends BaseMobileTest {

	/**
	 * Verify data privacy settings screen.
	 * 
	 * @author sergioGarcia
	 * 
	 */
	@Test(groups = { "workshop" })
	public void searchHotelTest() {
		MainScreen mainScreen = returnMainScreen();
		SettingsScreen settingsScreen = mainScreen.tabOnSettingsButton();
		DataPrivacyConfigScreen dataPrivacyConfigScreen = settingsScreen.tabOnDataConfigurationButton();
		//asserts
		Assert.assertTrue(dataPrivacyConfigScreen.titleExists());

		/*
		I assumed that the desired behavior of checkboxes it's to be checked by default
		 */
		Assert.assertTrue(dataPrivacyConfigScreen.appsFlyerCheckboxIsChecked());
		Assert.assertTrue(dataPrivacyConfigScreen.gmtFirebaseCheckboxIsChecked());
		Assert.assertTrue(dataPrivacyConfigScreen.facebookCheckboxIsChecked());
		Assert.assertTrue(dataPrivacyConfigScreen.firstParagraphLabelContains("Tú tienes el control de tu experiencia trivago. Puedes inhabilitar determinados tipos de procesamiento de tus datos personales si utilizas el siguiente formulario."));
		Assert.assertTrue(dataPrivacyConfigScreen.secondParagraphLabelContains("Para obtener más información sobre tu derecho de oposición, consulta nuestra política de privacidad y nuestra política de cookies."));

		settingsScreen = dataPrivacyConfigScreen.tabSaveButton();
		dataPrivacyConfigScreen = settingsScreen.tabOnDataConfigurationButton();

		dataPrivacyConfigScreen.tabOnAppsFlyerCheckbox();
		dataPrivacyConfigScreen.tabOnGmtFirebaseCheckbox();
		dataPrivacyConfigScreen.tabOnFacebookCheckboxCheckbox();
		settingsScreen = dataPrivacyConfigScreen.tabSaveButton();
		dataPrivacyConfigScreen = settingsScreen.tabOnDataConfigurationButton();

		// assert that checkboxes states is saved and updated correctly
		Assert.assertFalse(dataPrivacyConfigScreen.appsFlyerCheckboxIsChecked());
		Assert.assertFalse(dataPrivacyConfigScreen.gmtFirebaseCheckboxIsChecked());
		Assert.assertFalse(dataPrivacyConfigScreen.facebookCheckboxIsChecked());






	}

}
