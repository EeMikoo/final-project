package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionPage {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[3]/button[1]")
    WebElement transactionPage;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/table/thead/tr/td[3]/a")
    WebElement welcomeText;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/button[2]")
    WebElement resetTransactions;


    public void ClickTransactions(){
        transactionPage.click();
    }

    public void ClickReset(){
        resetTransactions.click();
    }

    public String getWelcomeText() {
        return welcomeText.getText();
    }


    public TransactionPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
