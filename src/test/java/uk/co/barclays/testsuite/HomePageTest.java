package uk.co.barclays.testsuite;

import org.testng.annotations.Test;
import uk.co.barclays.homepage.HomePage;
import uk.co.barclays.testbase.TestBase;

public class HomePageTest extends TestBase {
    HomePage homePage=new HomePage();
    @Test
    public void verifyContactUsLinkIsDisplayed(){
        homePage.clickOnLoginLink();
    }
}
