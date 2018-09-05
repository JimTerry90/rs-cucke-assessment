package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jamesfairclough on 05/09/2018.
 */
public class NewProducts {

    //create an object of the class
    public NewProducts(WebDriver driver) {PageFactory.initElements(driver, this); }

    //find the pneumatic components category from the new products page
    @FindBy(how = How.XPATH, using = "//*[@id=\'featprd-id-1\']/div/div[1]/div/div[1]/div/h2/a")
    public WebElement pneuComp;

    //find the diagnostic videoscopes category from the new products page
    @FindBy(how = How.XPATH, using = "//*[@id=\'featprd-id-1\']/div/div[2]/div/div[1]/div/h2/a")
    public WebElement videoScopes;





    //reusable function for clicking any product category
    public void selectCategory(WebElement myElement){
        myElement.click();

    }

    //click the pneumatic components category
    public void clickPneuComp(){
        selectCategory(pneuComp);
    }

    //click the diagnostic videoscopes category
    public void clickVideoScopes(){
        selectCategory(videoScopes);
    }



}
