package uk.co.barclays.homepage;

import org.openqa.selenium.By;
import uk.co.barclays.utility.Utility;

public class HomePage extends Utility {
    By logInLink = By.partialLinkText("Log In");


    //clicking on login button
    public void clickOnLoginLink(){
        clickOnElement(logInLink);
    }

}

