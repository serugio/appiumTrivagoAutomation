package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Description:
 *
 */
public class SelectDateScreen extends BaseScreen {

	/**
	 * Constructor method.
	 *
	 *
	 * @param pDriver : AndroidDriver
	 */
	public SelectDateScreen(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);
	}

	// Locators
	private static final String SEARCH_DESTINY_INPUT = "com.trivago:id/activitySearchDestinationSearchEditText";
	private static final String CARTAGENA_COLOMBIA_OPTION = "new UiSelector().text(\"Ciudad - Bolívar, Colombia, Centro- y Sudamérica\")";
	private static final String SELECT_DATE_TITLE = "new UiSelector().text(\"Seleccionar fechas\")";
	private static final String CONFIRM_DATE_BUTTON = "com.trivago:id/activityDatesSelectionCalendarApplyTextView";
	private static final String NOVEMBER_1_OPTION = "new UiSelector().text(\"noviembre de 2020\").fromParent(new UiSelector().resourceId(\"com.trivago:id/calendar_grid\")).childSelector(new UiSelector().index(0)).childSelector(new UiSelector().index(0))";
	private static final String NOVEMBER_5_OPTION = "new UiSelector().text(\"noviembre de 2020\").fromParent(new UiSelector().resourceId(\"com.trivago:id/calendar_grid\")).childSelector(new UiSelector().index(0)).childSelector(new UiSelector().index(4))";


	// AndroidElements
	@AndroidFindBy(id = SEARCH_DESTINY_INPUT)
	private AndroidElement searchDestinyInput;
	@AndroidFindBy(uiAutomator = CARTAGENA_COLOMBIA_OPTION)
	private AndroidElement cartagenaColombiaOption;
	@AndroidFindBy(uiAutomator = SELECT_DATE_TITLE)
	private AndroidElement selectDateTitleLabel;
	@AndroidFindBy(id = CONFIRM_DATE_BUTTON)
	private AndroidElement confirmDateButton;
	@AndroidFindBy(uiAutomator = NOVEMBER_1_OPTION)
	private AndroidElement november1Option;
	@AndroidFindBy(uiAutomator = NOVEMBER_5_OPTION)
	private AndroidElement november5Option;



	public void typeOnSearchDestinationInput(String textToType){
		typeInInputText(searchDestinyInput, textToType);
	}

	public void tabOnCartagenaColombiaOption(){
		tabOnElement(cartagenaColombiaOption);
	}

	public boolean titleIsVisible(){
		return selectDateTitleLabel.isDisplayed();
	}

	public boolean confirmButtonIsEnabled(){
		return confirmDateButton.isEnabled();
	}

	public void tabOnNovember1Option(){
		tabOnElement(november1Option);
	}

	public void tabOnNovember5Option(){
		tabOnElement(november5Option);
	}

	public SearchResultsScreen tabOnConfirmDateButton(){
		tabOnElement(confirmDateButton);
		return new SearchResultsScreen(driver);
	}





}