package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Karthik on 10/17/2016.
 */
public class Hook extends BaseUtil{


    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {

        System.out.println("Opening the browser...");

        /**
         * Expected Firefox would be the best browser to use as it usually works out of the box
         * for demo purposes (like this assessment!)
         * The versions of FF and GeckoDriver in this project are facing issues with .sendKeys methods
         * So i have refactored the browser init to use ChromeDriver
         */


        /*base.Driver = new FirefoxDriver();
        base.Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        base.Driver.manage().window().maximize();*/



        //Chrome driver
        WebDriverManager.chromedriver().setup();

        base.Driver = new ChromeDriver();
        base.Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        base.Driver.manage().window().maximize();
    }


    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        base.Driver.quit();
    }

}
