package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class verifications extends commonOps {

    @Step("Verify text in element")
    public static void HeadLineCheck(WebElement elem, String expectedValue) {
        assertEquals(elem.getText().toUpperCase().trim(), expectedValue.toUpperCase());
    }

    @Step("Verify Elements Visually")
    public static void visualElements(WebElement imageElement, String expectedImageName) {
        BufferedImage expectedImage = null;
        try {
            expectedImage = ImageIO.read(new File(("/Users/SW17/Desktop/Sapir/Automation/Automation_Sapir/imageRepository/") + expectedImageName + ".png"));
        } catch (Exception e) {

            System.out.println("Error writing image file, see details: " + e);
        }

        Screenshot imageScreenShot = new AShot().takeScreenshot(driver, imageElement);
        BufferedImage actualImage = imageScreenShot.getImage();
        diff = imgDiff.makeDiff(actualImage, expectedImage);
        assertFalse(diff.hasDiff(), "Images are not the same");
    }
}
