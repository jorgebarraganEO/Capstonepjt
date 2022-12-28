package PageObjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage{
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.ID, using = "nava")
    private WebElement pageTitle;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Home')]")
    private WebElement menuItemFirst;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Contact')]")
    private WebElement upMenuItemFirst;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'About us')]")
    private WebElement upMenuItemSecond;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Cart')]")
    private WebElement upMenuItemThird;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Log in')]")
    private WebElement upMenuItemFourth;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Sign up')]")
    private WebElement upMenuItemFifth;

    @FindBy(how = How.ID, using = "cat")
    private WebElement leftMenuTitle;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Phones')]")
    private WebElement leftMenuItemFirst;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Laptops')]")
    private WebElement leftMenuItemSecond;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Monitors')]")
    private WebElement leftMenuItemThird;

    public WebElement getPageTitle(){
        return pageTitle;
    }

    public WebElement getUpMenuItemFirst(){
        return upMenuItemFirst;
    }

    public WebElement getUpMenuItemSecond(){
        return upMenuItemSecond;
    }

    public WebElement getUpMenuItemThird(){
        return upMenuItemThird;
    }

    public WebElement getUpMenuItemFourth(){
        return upMenuItemFourth;
    }

    public WebElement getUpMenuItemFifth(){
        return upMenuItemFifth;
    }

    public WebElement getLeftMenuTitle(){
        return leftMenuTitle;
    }

    public WebElement getLeftMenuItemFirst(){
        return leftMenuItemFirst;
    }

    public WebElement getLeftMenuItemSecond(){
        return leftMenuItemSecond;
    }

    public WebElement getLeftMenuItemThird(){return leftMenuItemThird; }

}
