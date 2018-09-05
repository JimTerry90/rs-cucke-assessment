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
