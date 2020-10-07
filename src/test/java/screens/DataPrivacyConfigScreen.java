package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Description:
 *
 */
public class DataPrivacyConfigScreen extends BaseScreen {

	/**
	 * Constructor method.
	 *
	 *
	 * @param pDriver : AndroidDriver
	 */
	public DataPrivacyConfigScreen(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);
	}

	// Locators
	private static final String TITLE = "new UiSelector().textContains(\"Configurar privacidad de datos\")";
	private static final String APPS_FLYER_CHECKBOX = "com.trivago:id/activityDataManagerAppsFlyerCheckbox";
	private static final String GMT_FIREBASE_CHECKBOX = "com.trivago:id/activityDataManagerFirebaseCheckbox";
	private static final String FACEBOOK_CHECKBOX = "com.trivago:id/activityDataManagerFacebookCheckbox";
	private static final String FIRST_PARAGRAPH_LABEL = "com.trivago:id/activityDataManagerTitleTextView";
	private static final String SECOND_PARAGRAPH_LABEL = "com.trivago:id/activityDataManagerLearnMoreTextView";
	private static final String SAVE_BUTTON = "com.trivago:id/activityDataManagerSaveButton";




	// AndroidElements
	@AndroidFindBy(uiAutomator = TITLE)
	private AndroidElement screenTitle;
	@AndroidFindBy(id = APPS_FLYER_CHECKBOX)
	private AndroidElement appsFlyerCheckbox;
	@AndroidFindBy(id = GMT_FIREBASE_CHECKBOX)
	private AndroidElement gmtFirebaseCheckbox;
	@AndroidFindBy(id = FACEBOOK_CHECKBOX)
	private AndroidElement facebookCheckbox;
	@AndroidFindBy(id = FIRST_PARAGRAPH_LABEL)
	private AndroidElement firstParagraphLabel;
	@AndroidFindBy(id = SECOND_PARAGRAPH_LABEL)
	private AndroidElement secondParagraphLabel;
	@AndroidFindBy(id = SAVE_BUTTON)
	private AndroidElement saveButton;

	public boolean titleExists(){
		return screenTitle.isDisplayed();
	}
	public boolean appsFlyerCheckboxIsChecked(){
		String checked = appsFlyerCheckbox.getAttribute("checked");
		return Boolean.valueOf(checked);
	}
	public boolean gmtFirebaseCheckboxIsChecked(){
		String checked = gmtFirebaseCheckbox.getAttribute("checked");
		return Boolean.valueOf(checked);
	}
	public boolean facebookCheckboxIsChecked(){
		String checked = facebookCheckbox.getAttribute("checked");
		return Boolean.valueOf(checked);
	}

	public boolean firstParagraphLabelContains(String text){
		return firstParagraphLabel.getText().contains(text);
	}

	public boolean secondParagraphLabelContains(String text){
		return secondParagraphLabel.getText().contains(text);
	}

	public SettingsScreen tabSaveButton( ){
		tabOnElement(saveButton);
		return new SettingsScreen(driver);
	}

	public void tabOnAppsFlyerCheckbox(){
		tabOnElement(appsFlyerCheckbox);
	}

	public void tabOnGmtFirebaseCheckbox(){
		tabOnElement(gmtFirebaseCheckbox);
	}

	public void tabOnFacebookCheckboxCheckbox(){
		tabOnElement(facebookCheckbox);
	}




}