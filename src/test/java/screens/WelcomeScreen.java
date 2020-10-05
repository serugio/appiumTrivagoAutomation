package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Description:
 *
 */
public class WelcomeScreen extends BaseScreen {

	/**
	 * Constructor method.
	 * 
	 * 
	 * @param pDriver : AndroidDriver
	 */
	public WelcomeScreen(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);
	}

	// Locators
	private static final String COLOMBIA_LOCATOR = "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
			+ ".scrollIntoView(new UiSelector().textContains(\"Colombia\").instance(0))";
	private static final String CONFIRM_BUTTON_LOCATOR = "com.trivago:id/activityPlatformSelectionConfirmButton";

	// AndroidElements
	@AndroidFindBy(uiAutomator = COLOMBIA_LOCATOR)
	private AndroidElement colombiaListItem;

	@AndroidFindBy(id = CONFIRM_BUTTON_LOCATOR)
	private AndroidElement confirmButton;

	public void tabOnColombiaListItem(){
		tabOnButton(colombiaListItem);
	}

	public DataPrivacyScreen tabOnConfirmButton(){
		tabOnButton(confirmButton);
		return new DataPrivacyScreen(driver);

	}

	/**
	 * Returns a SecondScreen after to do something.
	 * 
	 * 
	 * @return SecondScreen
	 */
	public DataPrivacyScreen returnSecondScreen() {
		// code
		return new DataPrivacyScreen(driver);
	}



	public void someInstructions() {
		// code.
	}
}