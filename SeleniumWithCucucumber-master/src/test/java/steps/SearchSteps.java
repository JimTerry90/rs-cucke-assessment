package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.Home;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karthik on 10/15/2016.
 */
public class SearchSteps extends BaseUtil{

    private  BaseUtil base;

    public SearchSteps(BaseUtil base) {
        this.base = base;
    }



    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {

        Assert.assertEquals("Its not displayed", base.Driver.findElement(By.id("Initial")).isDisplayed(), true);
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {

        System.out.println("Navigate Login Page");
        base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
    }


    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        LoginPage page = new LoginPage(base.Driver);
        page.ClickLogin();
    }


    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) throws Throwable {
        System.out.println("UserName is : " + userName);
        System.out.println("Password is : " + password);
    }

    @Then("^I should see the userform page wrongly$")
    public void iShouldSeeTheUserformPageWrongly() throws Throwable {

        Assert.assertEquals("Its not displayed", base.Driver.findElement(By.id("sdfgdsfsd")).isDisplayed(), true);
    }

    /*
    My tests steps start
     */

    @Given("^I browse to the website$")
    public void iBrowseToTheWebsite() throws Throwable {
        base.Driver.get("https://uk.rs-online.com/web/");
    }


    @When("^I enter a valid search \"([^\"]*)\"$")
    public void iEnterAValidSearchTerm(String searchValue) throws Throwable {
        Home homepage = new Home(base.Driver);
        homepage.searchInput(searchValue);

    }

    @And("^I click the submit button$")
    public void iClickTheSubmitButton() throws Throwable {
        Home homepage = new Home(base.Driver);
        homepage.searchSubmit();
    }

    @Then("^I should see relevant product results$")
    public void iShouldSeeRelevantProductResults() throws Throwable {
        Thread.sleep(5000);

        System.out.println("results found");
    }
}
