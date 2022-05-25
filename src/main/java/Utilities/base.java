package Utilities;

import PageObjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class base {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;

    // pages
    public static preLogin preLoginScreen;
    public static userRegistration userRegistrationScreen;
    public static myAccount myAccountScreen;
    public static addItemToCart cartAddingScreen;
    public static paymentSteps endOfPaymentScreen;

    //Ashot
    public static Screenshot imageScreenShot;
    public static ImageDiffer imgDiff = new ImageDiffer();
    public static ImageDiff diff;

}
