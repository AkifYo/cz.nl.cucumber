package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZorgvinderPage {
    public ZorgvinderPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id = "CybotCookiebotDialogBodyButtonDecline")
    public WebElement cookieBtn;
    @FindBy (id = "zoekbox-zorg")
    public WebElement zoekBoxZorg;

    @FindBy (id = "zoekbox-locatie")
    public WebElement zoekBoxLocatie;

    @FindBy (xpath = "//span[text()='Voer een geldige zorgsoort in']")
    public WebElement foutMeldingText;

    @FindBy (xpath = "//button[@type='button']//span")
    public WebElement zoekBtn;


    @FindBy (xpath = "//a[@href='https://zorgvinder.cz.nl/']//span[@class='c-toptask__data']")
    public WebElement zorgVinderBtn;
    @FindBy (css = "div#__next > p")
    public WebElement foutMessageText;



}
