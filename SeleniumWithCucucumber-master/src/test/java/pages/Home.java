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

    //create an object of the class
    public Home(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //find the search bar
    @FindBy(how = How.ID_OR_NAME, using = "searchTerm")
    public WebElement searchField;

    //find the search submit button
    @FindBy(how = How.ID, using = "btnSearch")
    public WebElement searchSubmit;

    //find the new products nav menu item
    @FindBy(how = How.CLASS_NAME, using = "newProducts")
    public WebElement newProducts;


    //send a text input to the search bar
    public void searchInput(String searchValue){
        searchField.sendKeys(searchValue);

    }

    //click the search submit button
    public void searchSubmit() {
        searchSubmit.submit();
    }

    //click the new products nav menu option
    public void clickNewProducts() {newProducts.click();}

}
