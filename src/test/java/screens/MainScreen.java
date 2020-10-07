package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Description:
 *
 */
public class MainScreen extends BaseScreen {

	/**
	 * Constructor method.
	 *
	 *
	 * @param pDriver : AndroidDriver
	 */
	public MainScreen(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);
	}

	// Locators
	private static final String SEARCH_DESTINY_INPUT = "com.trivago:id/fragmentHomeExpandedDealformDestinationTextView";
	private static final String CONFIRM_BUTTON_LOCATOR = "com.trivago:id/activityPlatformSelectionConfirmButton";

	// AndroidElements
	@AndroidFindBy(id = SEARCH_DESTINY_INPUT)
	private AndroidElement searchDestinyInput;

	@AndroidFindBy(id = CONFIRM_BUTTON_LOCATOR)
	private AndroidElement confirmButton;

	public DataPrivacyScreen tabOnConfirmButton(){
		tabOnElement(confirmButton);
		return new DataPrivacyScreen(driver);
	}

	public SearchDestinationScreen tabInSearchDestinyInput(){
		tabOnElement(searchDestinyInput);
		return new SearchDestinationScreen(driver);

	}



}