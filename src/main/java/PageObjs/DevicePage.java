package PageObjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DevicePage extends BasePage{

    public DevicePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.ID, using = "imgp")
    private WebElement deviceImage;
    @FindBy(how = How.CLASS_NAME, using = "name")
    private WebElement deviceTitle;

    @FindBy(how = How.CLASS_NAME, using = "price-container")
    private WebElement devicePrice;

    @FindBy(how = How.ID, using = "more-information")
    //@FindBy(how = How.XPATH, using = "//*[@id="more-information"]/strong")
    private WebElement deviceDescription;

    @FindBy(how = How.LINK_TEXT, using = "Add to cart")
    private WebElement deviceCartButton;

    @FindBy(how = How.LINK_TEXT, using = "Product Added")
    private WebElement deviceAddedPopup;

    @FindBy(how = How.LINK_TEXT, using = "OK")
    private WebElement deviceAcceptBtn;

    public boolean getDeviceImage() { return deviceImage.isDisplayed(); }

    public WebElement getDeviceTitle(){
        return deviceTitle;
    }

    public WebElement getDevicePrice(){
        return devicePrice;
    }

    public WebElement getDeviceDescriptionTitle(){
        return deviceDescription;
    }

    public WebElement getDeviceCartButton() { return deviceCartButton; }

    public WebElement getDeviceAddedPopup() { return deviceAddedPopup; }

    public WebElement getDeviceAcceptBtn() { return deviceAcceptBtn; }

}
