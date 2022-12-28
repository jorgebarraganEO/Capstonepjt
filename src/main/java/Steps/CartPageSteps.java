package Steps;

import PageObjs.CartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CartPageSteps extends BaseSteps {
    CartPage cartPage = PageFactory.initElements(webDriverT, CartPage.class);
    public CartPageSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void devInfoTest(){
        String pageDubTtl = cartPage.getPageSubtitle().getText(); System.out.println(pageDubTtl);
        String pageTotalTtl = cartPage.getTotalTitle().getText(); System.out.println(pageTotalTtl);
        Boolean imgCart = cartPage.getDeviceImgCart().isDisplayed(); System.out.println(imgCart);
        String devNameCrt = cartPage.getDeviceNameCart().getText(); System.out.println(devNameCrt);
        String devPriceCart = cartPage.getDevicePriceCart().getText(); System.out.println(devPriceCart);
        String deleteOption = cartPage.getDeviceDeleteCart().getText(); System.out.println(deleteOption);
        String orderButton = cartPage.getCartOrderBtn().getText(); System.out.println(orderButton);
    }

}
