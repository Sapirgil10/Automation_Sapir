package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class uiActions extends commonOps {

    @Step("Click on element")
    public static void click(WebElement elem) {
//        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Clear text from text-field")
    public static void clear(WebElement elem) {
//        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.clear();
    }

    @Step("Send text to text-field")
    public static void sendKeys(WebElement elem, String value) {
//        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.sendKeys(value);
    }

    @Step("Update DropDown field")
    public static void dropDown(WebElement elem, int value) {
//        wait.until(ExpectedConditions.visibilityOf(elem));
        Select myValue = new Select(elem);
        myValue.selectByIndex(value);
    }

    @Step("Mouse hover to elements")
    public static void mouseHoverElement(WebElement elem) {
        action.moveToElement(elem).click().build().perform();
    }

}
