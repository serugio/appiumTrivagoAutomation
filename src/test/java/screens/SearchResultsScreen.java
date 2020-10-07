package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Description:
 *
 */
public class SearchResultsScreen extends BaseScreen {

	/**
	 * Constructor method.
	 *
	 *
	 * @param pDriver : AndroidDriver
	 */
	public SearchResultsScreen(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);
	}

	// Locators
	private static final String SEARCH_DESTINY_INPUT = "com.trivago:id/fragmentHotelSearchResultsExpandedDealformDestinationTextView";
	private static final String DATE_RESULTS = "com.trivago:id/fragmentHotelSearchResultsExpandedDealformCalendarTextView";


	// AndroidElements
	@AndroidFindBy(id = SEARCH_DESTINY_INPUT)
	private AndroidElement searchDestinyInput;
	@AndroidFindBy(id = DATE_RESULTS)
	private AndroidElement dateResultsLabel;



	public void typeOnSearchDestinationInput(String textToType){
		typeInInputText(searchDestinyInput, textToType);
	}

	public boolean dateResultsContains(String text){
		customWait.waitAndroidElementVisibility(driver, dateResultsLabel, 10);
		return  elementContainsText(dateResultsLabel, text);
	}
	public boolean searchDestinyContains(String text){
		customWait.waitAndroidElementVisibility(driver, searchDestinyInput , 10);
		return  elementContainsText(searchDestinyInput, text);
	}



}