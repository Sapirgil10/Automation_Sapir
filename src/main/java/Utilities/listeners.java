package Utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners extends commonOps implements ITestListener {
    public void onStart(ITestContext Result) {
        System.out.println("******** Starting Execution ********");
    }

    public void onFinish(ITestContext Result) {
        System.out.println("******** Execution Ended ********");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
    }

    // When Test case get failed, this method is called.
    public void onTestFailure(ITestResult Result) {
        System.out.println("Test ******** " + Result.getName() + " ******** Failed!");
        saveScreenShot();
    }

    // When Test case get Skipped, this method is called.
    public void onTestSkipped(ITestResult Result) {
        System.out.println("Test ******** " + Result.getName() + " ******** Skipped!");
    }

    // When Test case get Started, this method is called.
    public void onTestStart(ITestResult Result) {
        System.out.println("Test ******** " + Result.getName() + " ******** Started!");
    }

    // When Test case get passed, this method is called.
    public void onTestSuccess(ITestResult Result) {
        System.out.println("Test ******** " + Result.getName() + " ******** Passed!");
    }

    @Attachment(value = "Page screen shot", type = "image/png")
    public byte[] saveScreenShot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}