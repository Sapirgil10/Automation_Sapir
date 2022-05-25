package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class commonOps extends base {


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
    @BeforeClass
    public void startSession() {
//        String platform = "web";
        if (constants.browser.equalsIgnoreCase("Web"))
            initBrowser("Chrome");
        else
            throw new RuntimeException("Invalid platform name stated");
        managePages.init();
    }

    @AfterClass
    public void closeSession() {
        driver.quit();
    }
}
