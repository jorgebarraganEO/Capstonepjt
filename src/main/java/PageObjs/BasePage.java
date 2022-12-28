package PageObjs;

import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver webDriverT;

    public BasePage(WebDriver webDriver){
        this.webDriverT = webDriver;
    }
}
