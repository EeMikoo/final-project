package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletePage {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr/td[5]/button")
    WebElement clickOnDeleteBtn;

    public void ClickDeleteBtn(){
        clickOnDeleteBtn.click();
    }




    public DeletePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
