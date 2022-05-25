package Utilities;

import PageObjects.*;
import org.openqa.selenium.support.PageFactory;

public class managePages extends base {

    public static void init() {

        preLoginScreen = PageFactory.initElements(driver, preLogin.class);
        userRegistrationScreen = PageFactory.initElements(driver, userRegistration.class);
        myAccountScreen = PageFactory.initElements(driver, myAccount.class);
        cartAddingScreen = PageFactory.initElements(driver, addItemToCart.class);
        endOfPaymentScreen = PageFactory.initElements(driver, paymentSteps.class);
    }
}
