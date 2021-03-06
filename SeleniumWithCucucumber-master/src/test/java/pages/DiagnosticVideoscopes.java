package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jamesfairclough on 05/09/2018.
 */
public class DiagnosticVideoscopes {

    //create an object of the class
    public DiagnosticVideoscopes(WebDriver driver) {PageFactory.initElements(driver, this);}

    //find the add button for the first new diagnostic videoscope product
    @FindBy(how = How.XPATH, using = "//*[@id=\'search-results\']/div[3]/div/div[2]/div[4]/div[3]/div/div[1]/div/div[2]/form/button")
    public WebElement addDiagScopeProd1;


    //click on the first new diagnostic videoscope product
    public void clickDiagScopeProd1(){
        addDiagScopeProd1.click();
    }

}
