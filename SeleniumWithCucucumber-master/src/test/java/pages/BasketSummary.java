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

    public BasketSummary(WebDriver driver) {PageFactory.initElements(driver, this);}



    @FindBy(how = How.ID, using = "checkoutSecurelyAndPuchBtn")
    public WebElement secureCheckout;



    public void clickSecureCheckout(){
        secureCheckout.click();
    }
}
