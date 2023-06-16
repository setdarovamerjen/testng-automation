package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CashwiseDashBoardPage {
    public CashwiseDashBoardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//div/aside/div")
    public List<WebElement> leftSideMenu;

    @FindBy (id = "active")
    public WebElement Infographics;

    @FindBy (id = "panel1a-header")
    public WebElement Sales;

    @FindBy (xpath = "//div[.='Expenses']")
    public WebElement Expenses;

    @FindBy (xpath = "//div[.='Reports']")
    public WebElement Reports;





}
