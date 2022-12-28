import Steps.CartPageSteps;
import Steps.DevicePageSteps;
import Steps.HomePageSteps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ElementsTests extends BaseTest {
    HomePageSteps homePageSteps = new HomePageSteps(driver);
    DevicePageSteps devicePageSteps = new DevicePageSteps(driver);

    CartPageSteps cartPageSteps = new CartPageSteps(driver);

    @Test (description = "Test to Validate Left Menu items Present", priority = 1)
    public void leftMenuTest() throws InterruptedException {
        homePageSteps.leftMenuTest();
        Thread.sleep(2000);
    }

    @Test (description = "Test to verify selected device info page", priority = 2)
    /*"Samsung Galaxy s6","Nokia Lumia 1520","Nexus 6","Samsung Galaxy s7","Iphone 6 32gb","Sony xperia z5",
    "HTC One m9","Sony vaio i5","Sony vaio i7","Apple monitor 24","MacBook air","Dell i7 8gb","2017 Dell 15.6 Inch",
     "ASUS Full HD","MacBook Pro"*/
    public void deviceInfoTest() throws InterruptedException {
        WebElement waitElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Samsung galaxy s6")));
        devicePageSteps.deviceSelectionTest("Samsung galaxy s6");
        devicePageSteps.deviceInfoTest();
    }

    @Test (description = "Test Alert device added to Cart", priority = 3)
    public void cartAddedInfoTest() throws InterruptedException {
        WebElement waitElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Samsung galaxy s6")));
        devicePageSteps.deviceSelectionTest("Samsung galaxy s6");
        WebElement waitElement2 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add to cart")));
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(2000);
        Alert deviceAlert = driver.switchTo().alert();
        deviceAlert.accept();

    }

    @Test (description = "Test to Validate Device is added to cart with correct information", priority = 4)
    public void deviceInCartInfoTest() throws InterruptedException {
        WebElement waitElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Samsung galaxy s6")));
        devicePageSteps.deviceSelectionTest("Samsung galaxy s6");
        WebElement waitElement2 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add to cart")));
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(2000);
        Alert deviceAlert = driver.switchTo().alert();
        deviceAlert.accept();
        driver.findElement(By.linkText("Cart")).click(); Thread.sleep(2000);
        cartPageSteps.devInfoTest();
    }
}
