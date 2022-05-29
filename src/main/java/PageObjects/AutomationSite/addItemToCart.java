package PageObjects.AutomationSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addItemToCart {

    @FindBy(xpath = "//*[@id='layered_block_left']/p")
    public WebElement elem_heading_04;

    @FindBy(xpath = "//*[@id='center_column']/div/div/div[3]/h1")
    public WebElement elem_heading_05;

    @FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[2]/h5/a")
    public WebElement btn_AddToCart;

    @FindBy(xpath = "//*[@id='add_to_cart']/button/span")
    public WebElement btn_BlueAddToCart;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
    public WebElement btn_ProceedToCheckout;
}
