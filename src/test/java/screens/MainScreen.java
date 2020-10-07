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
	private static final String SEARCH_OPTION_NAVIGATION_BAR = "new UiSelector().resourceId(\"com.trivago:id/bottomNavigation\").childSelector(new UiSelector().index(0)).childSelector(new UiSelector().resourceId(\"com.trivago:id/action_home\"))";
	private static final String DISCOVER_OPTION_NAVIGATION_BAR = "new UiSelector().resourceId(\"com.trivago:id/bottomNavigation\").childSelector(new UiSelector().index(0)).childSelector(new UiSelector().resourceId(\"com.trivago:id/action_explore\"))";
	private static final String FAVOURITE_OPTION_NAVIGATION_BAR = "new UiSelector().resourceId(\"com.trivago:id/bottomNavigation\").childSelector(new UiSelector().index(0)).childSelector(new UiSelector().resourceId(\"com.trivago:id/action_favourites\"))";
	private static final String SETTINGS_OPTION_NAVIGATION_BAR = "new UiSelector().resourceId(\"com.trivago:id/bottomNavigation\").childSelector(new UiSelector().index(0)).childSelector(new UiSelector().resourceId(\"com.trivago:id/action_settings\"))";



	// AndroidElements
	@AndroidFindBy(id = SEARCH_DESTINY_INPUT)
	private AndroidElement searchDestinyInput;
	@AndroidFindBy(id = CONFIRM_BUTTON_LOCATOR)
	private AndroidElement confirmButton;
	@AndroidFindBy(uiAutomator = SEARCH_OPTION_NAVIGATION_BAR)
	private AndroidElement searchButton;
	@AndroidFindBy(uiAutomator = DISCOVER_OPTION_NAVIGATION_BAR)
	private AndroidElement discoverButton;
	@AndroidFindBy(uiAutomator = FAVOURITE_OPTION_NAVIGATION_BAR)
	private AndroidElement favouriteButton;
	@AndroidFindBy(uiAutomator = SETTINGS_OPTION_NAVIGATION_BAR)
	private AndroidElement settingsButton;


	public DataPrivacyScreen tabOnConfirmButton(){
		tabOnElement(confirmButton);
		return new DataPrivacyScreen(driver);
	}


	public SearchDestinationScreen tabInSearchDestinyInput(){
		tabOnElement(searchDestinyInput);
		return new SearchDestinationScreen(driver);
	}

	public boolean elementsFromNavigationBarExists(){
		boolean flag = true;
		customWait.waitAndroidElementVisibility(driver,searchButton, 5);
		if (!searchButton.isDisplayed() || !discoverButton.isDisplayed() || !favouriteButton.isDisplayed() || !settingsButton.isDisplayed())
			flag = false;

		return flag;
	}

	public SettingsScreen tabOnSettingsButton(){
		customWait.waitAndroidElementVisibility(driver,settingsButton, 5);
		tabOnElement(settingsButton);
		return new SettingsScreen(driver);
	}




}