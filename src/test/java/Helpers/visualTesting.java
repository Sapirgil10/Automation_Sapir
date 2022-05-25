package Helpers;

import PageObjects.preLogin;
import Utilities.commonOps;
import Utilities.helperMethods;
import org.testng.annotations.Test;

public class visualTesting extends commonOps {


    @Test
    public void createScreenShot() {
        helperMethods.takeElementScreenShot(preLoginScreen.imgLogo, "PreLoginLogo");
    }

}

