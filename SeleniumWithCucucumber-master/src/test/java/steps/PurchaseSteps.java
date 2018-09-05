package steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.*;

/**
 * Created by jamesfairclough on 05/09/2018.
 */
public class PurchaseSteps extends BaseUtil{


    private  BaseUtil base;

    public PurchaseSteps(BaseUtil base) {
        this.base = base;
    }


    @And("^I navigate to new products$")
    public void iClickTheSubmitButton() throws Throwable {
        Home homepage = new Home(base.Driver);
        homepage.clickNewProducts();
    }


    @And("^I select Pneumatic Compnents$")
    public void iSelectPneumaticCompnents() throws Throwable {
        NewProducts newProducts = new NewProducts(base.Driver);
        newProducts.clickPneuComp();
    }

    @When("^I add the first new Pneumatic product to my basket$")
    public void iAddTheFirstProductToMyBasket() throws Throwable {
        PneumaticComponents pneuComp = new PneumaticComponents(base.Driver);
        pneuComp.clickAddPneuProd1();
    }

    @And("^Open my basket$")
    public void openMyBasket() throws Throwable {
        Common common = new Common(base.Driver);
        common.goToBasket();
    }

    @Then("^I should be able to proceed to checkout$")
    public void iShouldBeAbleToProceedToCheckout() throws Throwable {
        BasketSummary basketSummary = new BasketSummary(base.Driver);
        SecureCheckout secureCheckout = new SecureCheckout(base.Driver);

        basketSummary.clickSecureCheckout();

        //confirm guest checkout option is displayed
        Assert.assertTrue(secureCheckout.isGuestCheckout());

    }

    @And("^I select Diagnostic VideoScopes$")
    public void iSelectDiagnosticVideoScopes() throws Throwable {
        NewProducts newProducts = new NewProducts(base.Driver);
        newProducts.clickVideoScopes();
    }

    @When("^I add the first new Videosope product to my basket$")
    public void iAddTheFirstNewVideosopeProductToMyBasket() throws Throwable {
        DiagnosticVideoscopes diagScopes = new DiagnosticVideoscopes(base.Driver);
        diagScopes.clickDiagScopeProd1();
    }
}
