package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.MainScreen;
import screens.SearchDestinationScreen;
import screens.SearchResultsScreen;
import screens.SelectDateScreen;
import util.tests.BaseMobileTest;

public class NavigationBarElementsTest extends BaseMobileTest {

	/**
	 * Verify navigation bar.
	 * 
	 * @author sergioGarcia
	 * 
	 */
	@Test(groups = { "workshop" })
	public void navigationBarTest() {
		MainScreen mainScreen = returnMainScreen();
		//asserts
		Assert.assertTrue(mainScreen.elementsFromNavigationBarExists());


	}

}
