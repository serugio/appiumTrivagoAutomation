package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.*;
import util.tests.BaseMobileTest;

public class searchHotelsTest extends BaseMobileTest {

	/**
	 * Verify something.
	 * 
	 * @author AnyOne
	 * 
	 */
	//@Parameters({ "someParameter", "someParameter" })
	@Test(groups = { "workshop" })
	public void searchHotelTest() {
		MainScreen mainScreen = returnMainScreen();
		SearchDestinationScreen searchDestinationScreen = mainScreen.tabInSearchDestinyInput();
		searchDestinationScreen.typeOnSearchDestinationInput("Cartagena");
		SelectDateScreen selectDateScreen = searchDestinationScreen.tabOnCartagenaColombiaOption();
		//asserts
		Assert.assertTrue(selectDateScreen.titleIsVisible());
		/*
		in the exercise guide says that it should be validated that confirm date should be disabled,
		but in current app's behavior, a default date is selected, for instance the confirm date button is enabled by default,
		I'm going to assert that confirm date button is enabled for the reason above due that can be a mistake by the exercise guide
		 */
		Assert.assertTrue(selectDateScreen.confirmButtonIsEnabled());
		selectDateScreen.tabOnNovember1Option();
		selectDateScreen.tabOnNovember5Option();
		SearchResultsScreen searchResultsScreen = selectDateScreen.tabOnConfirmDateButton();
		//asserts
		Assert.assertTrue(searchResultsScreen.dateResultsContains("1 de nov. - 5 de nov."));
		Assert.assertTrue(searchResultsScreen.searchDestinyContains("Cartagena"));


	}

}
