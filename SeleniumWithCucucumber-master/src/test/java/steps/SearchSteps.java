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
 * Created by James Fairclough 04/09/18
 */
public class SearchSteps extends BaseUtil{

    private  BaseUtil base;

    public SearchSteps(BaseUtil base) {
        this.base = base;
    }


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

    @Then("^I should see relevant product \"([^\"]*)\"$")
    public void iShouldSeeRelevantProductResults(String result) throws Throwable {

        //Confirm the page title contains the relevant product as per search term
        Assert.assertTrue(base.Driver
                .getTitle()
                .contains(result)
        );

        System.out.println("results found");
    }
}
