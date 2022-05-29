package PageObjects.AutomationSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class userRegistration {

    //  YOUR PERSONAL INFORMATION
    @FindBy(xpath = "//*[@id=\"create-account_form\"]/h3")
    public WebElement elem_heading_02;

    @FindBy(id = "id_gender1")
    public WebElement btn_gender;

    @FindBy(id = "customer_firstname")
    public WebElement elem_FirstName;

    @FindBy(id = "customer_lastname")
    public WebElement elem_LastName;

    @FindBy(id = "email")
    public WebElement elem_Email;

    @FindBy(id = "passwd")
    public WebElement elem_PassWord;

    @FindBy(id = "days")
    public WebElement elem_days;

    @FindBy(id = "months")
    public WebElement elem_month;

    @FindBy(id = "years")
    public WebElement elem_years;

    @FindBy(id = "newsletter")
    public WebElement elem_newsLetter;

    @FindBy(id = "optin")
    public WebElement elem_specialOffers;


    // YOUR ADDRESS
    @FindBy(id = "firstname")
    public WebElement elem_addressFirstName;

    @FindBy(id = "lastname")
    public WebElement elem_addressLastName;

    @FindBy(id = "company")
    public WebElement elem_Company;

    @FindBy(id = "address1")
    public WebElement elem_AddressAddress;

    @FindBy(id = "city")
    public WebElement elem_addressCity;

    @FindBy(id = "id_state")
    public WebElement elem_state;

    @FindBy(id = "postcode")
    public WebElement elem_zipCode;

    @FindBy(id = "id_country")
    public WebElement elem_country;

    @FindBy(id = "other")
    public WebElement elem_other;

    @FindBy(id = "phone")
    public WebElement elem_HomePhone;

    @FindBy(id = "phone_mobile")
    public WebElement elem_MobilePhone;

    @FindBy(id = "alias")
    public WebElement elem_alias;

    @FindBy(id = "submitAccount")
    public WebElement btn_Submit;

}
