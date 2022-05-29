package PageObjects.AutomationSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class preLogin {

    @FindBy(xpath = "//div[@id='center_column']/h1")
    public WebElement elem_heading_01;

    @FindBy(id = "email_create")
    public WebElement elem_newEmail;

    @FindBy(id = "SubmitCreate")
    public WebElement btn_createAnAccount;

    @FindBy(css = "#header_logo > a > img")
    public WebElement imgLogo;

}
