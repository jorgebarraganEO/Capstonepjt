package Steps;

import PageObjs.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageSteps extends BaseSteps{
    HomePage homePage = PageFactory.initElements(webDriverT,HomePage.class);
    public HomePageSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void leftMenuTest(){
        String lftMnuTitle = homePage.getLeftMenuTitle().getText(); System.out.println(lftMnuTitle);
        String lftMnuOp1 = homePage.getLeftMenuItemFirst().getText(); System.out.println(lftMnuOp1);
        String lftMnuOp2 = homePage.getLeftMenuItemSecond().getText(); System.out.println(lftMnuOp2);
        String lftMnuOp3 = homePage.getLeftMenuItemThird().getText(); System.out.println(lftMnuOp3);

    }


}
