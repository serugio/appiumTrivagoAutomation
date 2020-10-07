package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Description:
 *
 */
public class SearchDestinationScreen extends BaseScreen {

	/**
	 * Constructor method.
	 *
	 *
	 * @param pDriver : AndroidDriver
	 */
	public SearchDestinationScreen(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);
	}

	// Locators
	private static final String SEARCH_DESTINY_INPUT = "com.trivago:id/activitySearchDestinationSearchEditText";
	private static final String CARTAGENA_COLOMBIA_OPTION = "new UiSelector().text(\"Ciudad - Bolívar, Colombia, Centro- y Sudamérica\")";


	// AndroidElements
	@AndroidFindBy(id = SEARCH_DESTINY_INPUT)
	private AndroidElement searchDestinyInput;
	@AndroidFindBy(uiAutomator = CARTAGENA_COLOMBIA_OPTION)
	private AndroidElement cartagenaColombiaOption;



	public void typeOnSearchDestinationInput(String textToType){
		typeInInputText(searchDestinyInput, textToType);
	}

	public SelectDateScreen tabOnCartagenaColombiaOption(){
		tabOnElement(cartagenaColombiaOption);
		return new SelectDateScreen(driver);
	}



}