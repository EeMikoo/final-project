package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/button[2]")
    WebElement clickOnAddAcc;

    @FindBy(xpath = "//*[@id=\"userSelect\"]")
    WebElement fillCustomer;

    @FindBy(xpath = "//*[@id=\"currency\"]")
    WebElement fillCurrency;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/button")
    WebElement confirmAccount;


    public void ClickAddAcc(){
        clickOnAddAcc.click();
    }

    public void FillCustomer(String customer){
        fillCustomer.sendKeys(customer);
    }

    public void FillCurrency(String currency){
        fillCurrency.sendKeys(currency);
    }

    public void ConfirmAccount(){
        confirmAccount.click();
    }

    public AccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
