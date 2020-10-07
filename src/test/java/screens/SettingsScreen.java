package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Description:
 *
 */
public class SettingsScreen extends BaseScreen {

	/**
	 * Constructor method.
	 *
	 *
	 * @param pDriver : AndroidDriver
	 */
	public SettingsScreen(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);
	}

	// Locators
	private static final String DATA_CONFIGURATION_BUTTON = "com.trivago:id/fragmentSettingsManageMyDataTextView";


	// AndroidElements
	@AndroidFindBy(id = DATA_CONFIGURATION_BUTTON)
	private AndroidElement dataConfigurationButton;

	public DataPrivacyConfigScreen tabOnDataConfigurationButton(){
		customWait.waitAndroidElementVisibility(driver,dataConfigurationButton, 5);
		tabOnElement(dataConfigurationButton);
		return new DataPrivacyConfigScreen(driver);
	}



}