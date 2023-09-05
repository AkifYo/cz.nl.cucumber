package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ZorgvinderPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MyStepdefs {
    ZorgvinderPage zorgvinderPage = new ZorgvinderPage();


    @Then("quit de driver.")
    public void quitDeDriver() {
        Driver.getDriver().close();
    }


        @Then("De foutmelding moet zichtbaar zijn.")
    public void deFoutmeldingMoetZichtbaarZijn() {
       // String actualText = zorgvinderPage.foutMeldingText.getText();

       // System.out.println(actualText);

       Boolean isZoekBtnDisplayed= zorgvinderPage.foutMessageText.isDisplayed();
            System.out.println(zorgvinderPage.foutMessageText.getText());
            Assert.assertTrue(isZoekBtnDisplayed);


    }

    @Given("ga naar home pagina.")
    public void gaNaarHomePagina() {
        ReusableMethods.pleaseWait(1);
        Driver.getDriver().get(ConfigReader.getProperty("homepageUrl"));
        Driver.getDriver().manage().window().maximize();
        ReusableMethods.pleaseWait(1);
        zorgvinderPage.cookieBtn.click();
        ReusableMethods.pleaseWait(2);
        zorgvinderPage.zorgVinderBtn.click();
        ReusableMethods.pleaseWait(1);
        zorgvinderPage.cookieBtn.click();
    }

    @When("typ ongeldige  {string} and geldige {string} het zoekvak.")
    public void typOngeldigeAndGeldigeHetZoekvak(String teken, String locatie) {
        ReusableMethods.pleaseWait(2);
        zorgvinderPage.zoekBoxZorg.click();
        zorgvinderPage.zoekBoxZorg.sendKeys(teken);
        ReusableMethods.pleaseWait(2);
       // zorgvinderPage.zoekBoxLocatie.click();
       // zorgvinderPage.zoekBoxLocatie.sendKeys(locatie);
       // zorgvinderPage.zoekBtn.click();
    }
}
