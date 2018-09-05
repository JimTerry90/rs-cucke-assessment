package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jamesfairclough on 05/09/2018.
 */
public class PneumaticComponents {

    //create an object of the class
    public PneumaticComponents(WebDriver driver) {PageFactory.initElements(driver, this);}

    //find the add button for the first new pneumatic component
    @FindBy(how = How.XPATH, using = "//*[@id=\"search-results\"]/div[3]/div/div[2]/div[4]/div[3]/div/div[1]/div/div[2]/form/button")
    public WebElement addPneuProd1;



    //click the add button for the first new pneumatic component
    public void clickAddPneuProd1(){
        addPneuProd1.click();
    }


}
