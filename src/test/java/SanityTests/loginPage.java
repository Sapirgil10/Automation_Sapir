package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import Utilities.constants;
import WorkFlows.AutomationSite.*;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)

public class loginPage extends commonOps {

    @Test(description = " Test_02: Opening new account ")
    @Description(" Test description: Verifying Headline and send first user info ")
    public void test01_signUpNewUser() {
        verifications.visualElements(preLoginScreen.imgLogo, "PreLoginLogo");
        verifications.HeadLineCheck(preLoginScreen.elem_heading_01, constants.heading_01);
        registrationPageFlow.createAccount(constants.email);
    }

    @Test(description = " Test_03: Registration page ")
    @Description("Test description: Verifying Headline and send all user information ")
    public void test02_personalInformationPage() {

        verifications.HeadLineCheck(userRegistrationScreen.elem_heading_02, constants.heading_02);
        newUserSignUpPageFlow.yourPersonalInformation(constants.firstName, constants.lastName, constants.password, constants.email);
        newUserSignUpPageFlow.yourAddress(constants.firstName_01, constants.lastName_01, constants.company, constants.address,
                constants.city, constants.zipCode, constants.country, constants.other,
                constants.homePhone, constants.mobilePhone, constants.alias);
    }

    @Test(description = " Test_04: Complete registration landing page ")
    @Description(" Test description: Complete registration and click on T-Shirts ")
    public void test03_myAccountPage() {
        verifications.HeadLineCheck(myAccountScreen.elem_heading_03, constants.heading_03);
        completeRegistrationFlow.myAccount();
    }

    @Test(description = " Test_05: Click on T-shirt ")
    @Description(" Test description: Click on item and proceed to checkout ")
    public void test04_listOfItems() {
        verifications.HeadLineCheck(cartAddingScreen.elem_heading_04, constants.heading_04);
        addToCartFlow.addToList();
        verifications.HeadLineCheck(cartAddingScreen.elem_heading_05, constants.heading_05);
        addToCartFlow.addToList2();
    }

    @Test(description = " Test_06: Payment page checkout ")
    @Description(" Test description: Complete payment ")
    public void test06_andOfPayment() {
        verifications.HeadLineCheck(endOfPaymentScreen.elem_confirm, constants.heading_06);
        summeryPaymentPageFlow.summeryAndPayment();
        verifications.HeadLineCheck(endOfPaymentScreen.elem_orderComplete, constants.heading_07);
    }
}
