package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jamesfairclough on 04/09/2018.
 */
public class Home {

    public Home(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID_OR_NAME, using = "searchTerm")
    public WebElement searchField;

    @FindBy(how = How.ID, using = "btnSearch")
    public WebElement searchSubmit;

    @FindBy(how = How.CLASS_NAME, using = "newProducts")
    public WebElement newProducts;


    public void searchInput(String searchValue){
        searchField.sendKeys(searchValue);

    }

    public void searchSubmit() {
        searchSubmit.submit();
    }

    public void clickNewProducts() {newProducts.click();}

}
