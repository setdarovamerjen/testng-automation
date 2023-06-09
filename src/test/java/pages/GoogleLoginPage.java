package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleLoginPage {

    public GoogleLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}