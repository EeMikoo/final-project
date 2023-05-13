package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/div[2]/button")
    WebElement clickOnMngr;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/button[1]")
    WebElement clickOnAddCus;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")
    WebElement fillFirstName;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")
    WebElement fillLastName;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")
    WebElement fillPostalCode;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/button")
    WebElement confirmAddCus;


    public void ClickBankMngr(){
        clickOnMngr.click();
    }

    public void ClickAddCus(){
        clickOnAddCus.click();
    }

    public void FillFirstName(String first_name){
        fillFirstName.sendKeys(first_name);
    }

    public void FillLastName(String last_name){
        fillLastName.sendKeys(last_name);
    }

    public void FillPostalCode(String postal_code){
        fillPostalCode.sendKeys(postal_code);
    }

    public void ConfirmAddCus(){
        confirmAddCus.click();
    }

    public CustomerPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
