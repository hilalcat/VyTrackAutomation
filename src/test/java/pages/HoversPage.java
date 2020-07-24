package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.PublicKey;

public class HoversPage {

    public HoversPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/a/span")
    public WebElement HoverOverFleet;

    @FindBy(xpath = "//*[@id=\"container\"]")
    public WebElement vehicleOdometerPage;



}
