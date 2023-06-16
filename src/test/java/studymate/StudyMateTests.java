package studymate;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.StudyMateGroupsPage;
import pages.StudymateLoginPage;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;
import utilities.TestBase;

public class StudyMateTests extends TestBase {
    StudymateLoginPage studymateLoginPage;
    StudyMateGroupsPage studyMateGroupsPage;
    Faker faker;
    @BeforeMethod
    public void setup(){
        Driver.getDriver().get(Config.getValue("studymateURL"));
        studymateLoginPage=new StudymateLoginPage();
        studyMateGroupsPage= new StudyMateGroupsPage();
        faker=new Faker();
    }
    @Test (priority = 1)
    public void login(){
       studymateLoginPage.emailInput.sendKeys(Config.getValue("studyMateEmail"));
       studymateLoginPage.passwordInput.sendKeys(Config.getValue("studyMatePassword"));
       studymateLoginPage.loginBtn.click();
       String expectedURL="https://codewise.studymate.us/admin/analytics";
       ApplicationFlow.pause(2000);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedURL);
    }

    @Test (priority = 2)
    public void createGroup(){
        studymateLoginPage.emailInput.sendKeys(Config.getValue("studyMateEmail"));
        studymateLoginPage.passwordInput.sendKeys(Config.getValue("studyMatePassword"));
        studymateLoginPage.loginBtn.click();
        studymateLoginPage.groups.click();
        studyMateGroupsPage.createGroupButton.click();
        String name="M.Batch-2---"+System.currentTimeMillis();
        studyMateGroupsPage.nameInput.sendKeys(name);
        studyMateGroupsPage.dateBtn.click();
        studyMateGroupsPage.dateBtn.sendKeys("06132023");
        studyMateGroupsPage.descriptionInput.click();
        studyMateGroupsPage.descriptionInput.sendKeys("TEST DESCRIPTION ---"+faker.lorem().word());
        studyMateGroupsPage.createBtn.click();
        String xpath="//div[.='"+ name+"']";
        WebElement createdGroup= Driver.getDriver().findElement(By.xpath(xpath));
        Assert.assertTrue(createdGroup.isDisplayed());
        ApplicationFlow.pause(2000);
    }

}
