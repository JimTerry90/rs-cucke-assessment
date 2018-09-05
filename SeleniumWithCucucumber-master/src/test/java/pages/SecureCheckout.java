package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jamesfairclough on 04/09/2018.
 */
public class SecureCheckout {

    //create an object of the class
    public SecureCheckout(WebDriver driver) {PageFactory.initElements(driver, this);}

    //find the guest checkout button
    @FindBy(how = How.ID, using = "guestCheckoutForm:guestCheckout")
    public WebElement guestCheckoutBtn;

    //check to see if the guest checkout button is displayed
    public boolean isGuestCheckout(){

        return guestCheckoutBtn.isDisplayed();
    }


}
