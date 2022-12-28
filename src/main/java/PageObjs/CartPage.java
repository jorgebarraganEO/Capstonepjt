package PageObjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage extends BasePage {
    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(how = How.CLASS_NAME, using = "col-lg-8")
    private WebElement pageSubtitle;

    @FindBy(how = How.CLASS_NAME, using = "col-lg-1")
    private WebElement totalTitle;

    @FindBy(how = How.ID, using = "totalp")
    private WebElement totalPrice;

    @FindBy(how = How.XPATH, using = "/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[1]/img")
    private WebElement deviceImgCart;

    @FindBy(how = How.XPATH, using = "/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[2]")
    private WebElement deviceNameCart;

    @FindBy(how = How.XPATH,using = "/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[3]")
    private WebElement devicePriceCart;

    @FindBy(how = How.LINK_TEXT,using = "Delete")
    private WebElement deviceDeleteCart;

    @FindBy(how = How.XPATH,using = "//*[@id=\"page-wrapper\"]/div/div[2]/button")
    private WebElement cartOrderBtn;

    public WebElement getPageSubtitle() { return pageSubtitle; }

    public WebElement getTotalTitle() { return totalTitle; }

    public WebElement getTotalPrice() { return totalPrice; }

    public WebElement getDeviceImgCart() { return deviceImgCart; }

    public WebElement getDeviceNameCart() { return deviceNameCart; }

    public WebElement getDevicePriceCart() { return devicePriceCart; }

    public WebElement getDeviceDeleteCart() { return deviceDeleteCart; }

    public WebElement getCartOrderBtn() { return cartOrderBtn; }

}
