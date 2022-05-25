package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccount {

    @FindBy(xpath = "//*[@id='center_column']/h1")
    public WebElement elem_heading_03;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]")
    public WebElement btn_Tshirts;

}
