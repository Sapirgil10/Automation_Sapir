package Utilities;

import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class commonOps extends base {

    @BeforeClass
    public void startSession() {
        if (constants.platform.equalsIgnoreCase("Web"))
            initBrowser(constants.browserName);
        else if (constants.platform.equalsIgnoreCase("Mobile"))
            initMobile();
        else
            throw new RuntimeException("Invalid platform name stated");
        managePages.init();
    }

    public static void initBrowser(String browserType) {
        if (browserType.equalsIgnoreCase("Chrome"))
            driver = initChromeDriver();
        else if (browserType.equalsIgnoreCase("Firefox"))
            driver = initFirefoxDriver();
        else if (browserType.equalsIgnoreCase("Edge"))
            driver = initEdgeDriver();
        else
            throw new RuntimeException("Invalid platform name stated");

        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        action = new Actions(driver);
    }

    public static void initMobile() {
        dc.setCapability(MobileCapabilityType.UDID, constants.UDID);
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, constants.APP_PACKAGE);
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, constants.APP_ACTIVITY);
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), dc);
        } catch (Exception e) {
            System.out.println("Can not connect to Appium Server, See details + e");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public static WebDriver initChromeDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver initFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver initEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }


    @AfterClass
    public void closeSession() {
        driver.quit();
    }
}
