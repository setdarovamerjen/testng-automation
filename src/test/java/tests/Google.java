package tests;

import com.github.javafaker.Faker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;
public class Google {
    Faker faker=new Faker();
    @BeforeClass
    public void setup(){
    }
    @Test
public void test1(){
        for (int i=1; i<=10; i++) {
            Driver.getDriver().get(Config.getValue("googleURL"));
            String testData=faker.lorem().word();
            Driver.getDriver().findElement(By.name("q")).sendKeys(testData+ Keys.ENTER);
            ApplicationFlow.pause(500);
            String title= Driver.getDriver().getTitle();
            Assert.assertTrue(title.contains(testData));
        }
    }

    public void tear(){
        Driver.quit();
    }



}
