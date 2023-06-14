package utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    @AfterMethod
    public void closeDriver(){
        Driver.quit();
    }
}
