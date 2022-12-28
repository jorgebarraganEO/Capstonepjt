package Steps;

import PageObjs.DevicePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DevicePageSteps extends BaseSteps {
    DevicePage devicePage = PageFactory.initElements(webDriverT,DevicePage.class);

    public DevicePageSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void deviceSelectionTest(String deviceName){
        System.out.println(webDriverT.findElement(By.linkText(deviceName)).getText());
        webDriverT.findElement(By.linkText(deviceName)).click();
    }

    public void deviceInfoTest() throws InterruptedException {
        Thread.sleep(2000);
        Boolean deviceImg = devicePage.getDeviceImage(); System.out.println(deviceImg);
        String deviceTitle = devicePage.getDeviceTitle().getText(); System.out.println(deviceTitle);
        String devicePrice = devicePage.getDevicePrice().getText(); System.out.println(devicePrice);
        String deviceDescTitle = devicePage.getDeviceDescriptionTitle().getText(); System.out.println(deviceDescTitle);
        String deviceCrtButton = devicePage.getDeviceCartButton().getText(); System.out.println(deviceCrtButton);
        Thread.sleep(2000);
    }

    public void deviceCartAddedTest() throws InterruptedException {
        Thread.sleep(2000);
        WebElement waitElement1 = new WebDriverWait(webDriverT, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Product Added")));
        String alertMessage= webDriverT.switchTo().alert().getText(); System.out.println(alertMessage);
        String deviceAdded = devicePage.getDeviceAddedPopup().getText(); System.out.println(deviceAdded);
        devicePage.getDeviceAcceptBtn().click();

    }
}
