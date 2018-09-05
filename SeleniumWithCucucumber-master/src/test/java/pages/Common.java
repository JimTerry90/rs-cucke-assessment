package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jamesfairclough on 05/09/2018.
 */
public class Common {

    //create an object of the class
    public Common(WebDriver driver) {PageFactory.initElements(driver, this);}

    //find the basket icon by the image classname
    @FindBy(how = How.CLASS_NAME, using = "shBasket")
    public WebElement basket;

    //click on the basket icon
    public void goToBasket(){
        basket.click();
    }

}
