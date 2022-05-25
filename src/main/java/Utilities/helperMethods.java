package Utilities;

import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;

import javax.imageio.ImageIO;
import java.io.File;

public class helperMethods extends commonOps {
    public static void takeElementScreenShot(WebElement imageElement, String imageName) {


        imageScreenShot = new AShot().takeScreenshot(driver, imageElement);
        try {
            ImageIO.write(imageScreenShot.getImage(), "png", new File(("/Users/SW17/Desktop/Sapir/Automation/Automation_Sapir/imageRepository/") + imageName + ".png"));


        } catch (Exception e) {
            System.out.println("Error writing image file, see details: " + e);

        }
    }
}
