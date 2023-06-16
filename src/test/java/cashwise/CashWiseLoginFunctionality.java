package cashwise;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CashwiseHomePage;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;
import utilities.TestBase;

public class CashWiseLoginFunctionality extends TestBase {

    @Test
    public void login(){
        CashwiseHomePage cashwiseHomePage=new CashwiseHomePage();
        Driver.getDriver().get(Config.getValue("cashwiseURL"));
        ApplicationFlow.pause(4000);
        cashwiseHomePage.signIn("merjen@gmail.com", "merjen123");
        String expectedURL="https://cashwise.us/dashboard/infographics";
        ApplicationFlow.pause(4000);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedURL);
    }

}
