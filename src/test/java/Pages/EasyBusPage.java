package Pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EasyBusPage {
    public EasyBusPage(){
        PageFactory.initElements(Driver.getDriver(),this);

        //Cookies allow button

    }
}
