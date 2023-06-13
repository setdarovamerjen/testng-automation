package tests;

import com.github.javafaker.Faker;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

public class Google {

    Faker faker=new Faker();

    @Before
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

    @Test
    public void test2(){
        System.out.println("New line");
        System.out.println("2nd line");
    }
    @Test
    public void test3(){
        System.out.println("Mkjahsljdas");
    }

    public void tear(){
        Driver.quit();
    }
}
