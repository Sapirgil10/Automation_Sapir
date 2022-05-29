package PageObjects.AutomationSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class paymentSteps {

    @FindBy(xpath = "//div[@id='center_column']//a[@title='Proceed to checkout']")
    public WebElement btn_proceedToCheckout_summery;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
    public WebElement btn_proceedToCheckout_address;

    @FindBy(id = "cgv")
    public WebElement elem_iAgree;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
    public WebElement btn_proceedToCheckout_shipping;

    @FindBy(className = "bankwire")
    public WebElement btn_payByBankWire;

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
    public WebElement btn_confirm;

    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/span[2]")
    public WebElement elem_confirm;

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    public WebElement elem_orderComplete;
}
