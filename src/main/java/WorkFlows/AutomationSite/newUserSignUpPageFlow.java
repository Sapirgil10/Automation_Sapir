package WorkFlows.AutomationSite;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class newUserSignUpPageFlow extends commonOps {

    @Step("Personal information_1")
    public static void yourPersonalInformation(String firstName, String lastName, String password, String email) {
        uiActions.click(userRegistrationScreen.btn_gender);
        uiActions.sendKeys(userRegistrationScreen.elem_FirstName, firstName);
        uiActions.sendKeys(userRegistrationScreen.elem_LastName, lastName);
        uiActions.clear(userRegistrationScreen.elem_Email);
        uiActions.click(userRegistrationScreen.elem_Email);
        uiActions.sendKeys(userRegistrationScreen.elem_Email, email);
        uiActions.sendKeys(userRegistrationScreen.elem_PassWord, password);
        uiActions.dropDown(userRegistrationScreen.elem_days, 11);
        uiActions.dropDown(userRegistrationScreen.elem_month, 9);
        uiActions.dropDown(userRegistrationScreen.elem_years, 30);
        uiActions.click(userRegistrationScreen.elem_newsLetter);
        uiActions.click(userRegistrationScreen.elem_specialOffers);
    }

    @Step("Personal information_2")
    public static void yourAddress(String firstName, String lastName, String company,
                                   String address, String city, String zipCode, String country, String other, String homePhone, String mobilePhone, String alias) {
        uiActions.sendKeys(userRegistrationScreen.elem_addressFirstName, firstName);
        uiActions.sendKeys(userRegistrationScreen.elem_addressLastName, lastName);
        uiActions.sendKeys(userRegistrationScreen.elem_Company, company);
        uiActions.sendKeys(userRegistrationScreen.elem_AddressAddress, address);
        uiActions.sendKeys(userRegistrationScreen.elem_addressCity, city);
        uiActions.dropDown(userRegistrationScreen.elem_state, 5);
        uiActions.sendKeys(userRegistrationScreen.elem_zipCode, zipCode);
        uiActions.sendKeys(userRegistrationScreen.elem_country, country);
        uiActions.dropDown(userRegistrationScreen.elem_state, 5);
        uiActions.sendKeys(userRegistrationScreen.elem_other, other);
        uiActions.sendKeys(userRegistrationScreen.elem_HomePhone, homePhone);
        uiActions.sendKeys(userRegistrationScreen.elem_MobilePhone, mobilePhone);
        uiActions.clear(userRegistrationScreen.elem_alias);
        uiActions.click(userRegistrationScreen.elem_alias);
        uiActions.sendKeys(userRegistrationScreen.elem_alias, alias);
        uiActions.click(userRegistrationScreen.btn_Submit);
    }
}
