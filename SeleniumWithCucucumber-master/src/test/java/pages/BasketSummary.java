package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jamesfairclough on 04/09/2018.
 */
public class BasketSummary {


    //create object of class
    public BasketSummary(WebDriver driver) {PageFactory.initElements(driver, this);}


    //find the securely checkout button on the basket summary
    @FindBy(how = How.ID, using = "checkoutSecurelyAndPuchBtn")
    public WebElement secureCheckout;


    //click on the securely checkout button from the basket summary
    public void clickSecureCheckout(){
        secureCheckout.click();
    }
}
