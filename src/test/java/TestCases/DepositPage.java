package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositPage {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/div[1]/button")
    WebElement clickOnCustomer;

    @FindBy(id = "userSelect")
    WebElement clickOnUserSelect;

    @FindBy(xpath = "//*[@id=\"userSelect\"]/option[2]")
    WebElement clickOnValue1;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/form/button")
    WebElement clickOnLogin;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[3]/button[2]")
    WebElement clickOnDeposit;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[4]/div/form/div/input")
    WebElement fieldAmount;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[4]/div/form/button")
    WebElement confirmDeposit;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[4]/div/span")
    WebElement welcomeText;

    @FindBy(xpath = "/html/body/div/div/div[1]/button[1]")
    WebElement backHomePage;


    public void ClickCus(){
        clickOnCustomer.click();
    }

    public void ClickField(){
        clickOnUserSelect.click();
    }

    public void ClickValue1(){
        clickOnValue1.click();
    }

    public void ClickLogin(){
        clickOnLogin.click();
    }

    public void ClickDeposit(){
        clickOnDeposit.click();
    }

    public void ClickAmount(){
        fieldAmount.click();
    }

    public void FillAmount(String amount){
        fieldAmount.sendKeys(amount);
    }

    public void ConfirmDeposit(){
        confirmDeposit.click();
    }

    public String getWelcomeText() {
        return welcomeText.getText();
    }

    public void BackHomePage(){
        backHomePage.click();
    }


    public DepositPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
