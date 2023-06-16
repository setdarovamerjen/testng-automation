package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Config;
import utilities.Driver;

import java.util.List;

public class CashwiseHomePage {

    public CashwiseHomePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[2]")
    public WebElement signUpBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sendBtn;

    @FindBy (name = "name")
    public WebElement contactNameInput;

    @FindBy (name = "phone")
    public WebElement contactPhoneInput;

    @FindBy (name ="email")
    public WebElement contactEmailInput;

    @FindBy (xpath = "//div[@type='MINI']//h2")
    public WebElement contactSubmittedPopup;

    @FindBy (xpath = "//div[@class = 'App']/div[1]/div[1]/div[2]/div")
    public WebElement languageDropdown;

    @FindBy (xpath = "//div/ul/li")
    public List<WebElement> optionsFromLanguageDropdown;

    //////////////////////////////////
    //SignIn
    @FindBy(xpath = "//button[1]")
    public WebElement signInBtn;

    //Inside SignIn

    @FindBy (xpath = "(//input[@name='email'])[2]")
    public WebElement signInEmail;

    @FindBy (name = "password")
    public WebElement signInPassword;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement signInSignInBtn;

    public void signIn(String email, String password){
    signInBtn.click();
    signInEmail.sendKeys(email);
    signInPassword.sendKeys(password);
    signInSignInBtn.click();
    }







}
