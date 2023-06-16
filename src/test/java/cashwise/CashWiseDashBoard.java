package cashwise;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CashwiseDashBoardPage;
import pages.CashwiseHomePage;
import utilities.Config;
import utilities.Driver;
import utilities.TestBase;

public class CashWiseDashBoard extends TestBase {
    @Test
    public void testDashBordLeftSideWebElem(){
        //This test covers if the left size menu is four
        CashwiseDashBoardPage cashwiseDashBoardPage=new CashwiseDashBoardPage();
        CashwiseHomePage cashwiseHomePage=new CashwiseHomePage();
        Driver.getDriver().get(Config.getValue("cashwiseURL"));
        cashwiseHomePage.signIn("merjen@gmail.com", "merjen123");
        Assert.assertEquals(cashwiseDashBoardPage.leftSideMenu.size()-1, 4);
        Assert.assertEquals(cashwiseDashBoardPage.leftSideMenu.get(0).getText(), "Infographics");
        Assert.assertEquals(cashwiseDashBoardPage.leftSideMenu.get(1).getText(), "Sales");
        Assert.assertEquals(cashwiseDashBoardPage.leftSideMenu.get(2).getText(), "Expenses");
        Assert.assertEquals(cashwiseDashBoardPage.leftSideMenu.get(3).getText(), "Reports");
    }
}
