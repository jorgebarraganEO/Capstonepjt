import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public WebDriver driver = getDriverX();

    private WebDriver getDriverX(){
        System.setProperty("webdriver.chrome.driver","/Users/eb0821/CapstonePjt/webDrv/chromedriver");
        //System.setProperty("webdriver.firefox.driver","/Users/eb0821/CapstonePjt/webDrv/geckodriver");
        WebDriver driverX = new ChromeDriver();
        //WebDriver driverX = new FirefoxDriver();
        driverX.get("https://www.demoblaze.com/");
        return driverX;
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest(){
        System.out.println("<< Starts >>");
    }
    @AfterTest(alwaysRun = true)
    public void afterTest(){
        System.out.println("<< Ends >>");driver.quit();
    }
}
