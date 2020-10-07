package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Object of SecondScreen.
 * 
 **/
public class DataPrivacyScreen extends BaseScreen {

	/**
	 * Constructor method.
	 *
	 *
	 * @param pDriver
	 *            : AndroidDriver
	 */
	public DataPrivacyScreen(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);
	}

	// AndroidElements
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Privacidad de datos\")")
	protected AndroidElement title;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Creemos que mereces la mejor experiencia posible cuando usas trivago.\")")
	protected AndroidElement firstParagraph;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Por ello, nosotros y los sitios web de nuestros socios externos compartimos y recopilamos datos, y usamos cookies y otras tecnologías para funcionamiento del sitio, seguimiento, análisis y publicidad personalizada dentro y fuera de trivago.\")")
	protected AndroidElement secondParagraph;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Si estás de acuerdo, confirma tu consentimiento haciendo clic en “Aceptar todo” o personaliza tus preferencias en la configuración de privacidad de tus datos.\")")
	protected AndroidElement thirdParagraph;
	@AndroidFindBy(id = "com.trivago:id/activityCookieConsentContentAcceptButton")
	protected AndroidElement acceptAllButton;

	public boolean titleExists(){
		return title.isDisplayed();
	}


	public boolean firstParagraphExists(){
		return firstParagraph.isDisplayed();
	}

	public boolean secondParagraphExists(){
		return secondParagraph.isDisplayed();
	}

	public boolean thirdParagraphExists(){
		return thirdParagraph.isDisplayed();
	}

	public MainScreen tabOnAcceptAllButton(){
		tabOnElement(acceptAllButton);
		return new MainScreen(driver);
	}



}
