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


    public NewProducts(WebDriver driver) {PageFactory.initElements(driver, this); }

    @FindBy(how = How.XPATH, using = "//*[@id=\'featprd-id-1\']/div/div[1]/div/div[1]/div/h2/a")
    public WebElement pneuComp;

    @FindBy(how = How.XPATH, using = "//*[@id=\'featprd-id-1\']/div/div[2]/div/div[1]/div/h2/a")
    public WebElement videoScopes;





    //reuse for many product categories
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
