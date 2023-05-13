package Tests;

import TestCases.DepositPage;
import TestCases.WithdrawalPage;
import TestCases.CustomerPage;
import TestCases.AccountPage;
import TestCases.SearchPage;
import TestCases.DeletePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.time.Duration;


public class Testing {
    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test(priority = 1)
    public void DepositPage() throws InterruptedException {
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject");
        Thread.sleep(2000);

        DepositPage depositPage = new DepositPage(driver);

        depositPage.ClickCus();
        Thread.sleep(1000);

        depositPage.ClickField();
        Thread.sleep(1000);

        depositPage.ClickValue1();
        Thread.sleep(1000);

        depositPage.ClickLogin();
        Thread.sleep(1000);

        depositPage.ClickDeposit();
        Thread.sleep(1000);

        depositPage.ClickAmount();
        Thread.sleep(1000);

        depositPage.FillAmount("500");
        Thread.sleep(1000);

        depositPage.ConfirmDeposit();
        Thread.sleep(1000);

        Assert.assertEquals( depositPage.getWelcomeText(), "Deposit Successful");
        System.out.println("Testcase-1 accepted Successfully!!!");

        depositPage.BackHomePage();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void WithdrawalPage() throws InterruptedException {

        WithdrawalPage withdrawalPage = new WithdrawalPage(driver);

        withdrawalPage.ClickCus();
        Thread.sleep(1000);

        withdrawalPage.ClickField();
        Thread.sleep(1000);

        withdrawalPage.ClickValue1();
        Thread.sleep(1000);

        withdrawalPage.ClickLogin();
        Thread.sleep(1000);

        withdrawalPage.ClickWithdrawal();
        Thread.sleep(1000);

        withdrawalPage.ClickAmount();
        Thread.sleep(1000);

        withdrawalPage.FillAmount("500");
        Thread.sleep(1000);

        withdrawalPage.ConfirmWithdrawal();
        Thread.sleep(2000);

        Assert.assertEquals( withdrawalPage.getWelcomeText(), "Transaction successful");
        System.out.println("Testcase-2 accepted Successfully!!!");

    }

    @Test(priority = 3)
    public void CustomerPage() throws InterruptedException {
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject");
        Thread.sleep(2000);

        CustomerPage customerPage = new CustomerPage(driver);

        customerPage.ClickBankMngr();
        Thread.sleep(1000);

        customerPage.ClickAddCus();
        Thread.sleep(1000);

        customerPage.FillFirstName("Merey");
        Thread.sleep(1000);

        customerPage.FillLastName("Turganbekov");
        Thread.sleep(1000);

        customerPage.FillPostalCode("501581");
        Thread.sleep(1000);

        customerPage.ConfirmAddCus();
        Thread.sleep(3000);

        System.out.println("Testcase-3 accepted Successfully!!!");

    }


    @Test(priority = 4)
    public void AccountPage() throws InterruptedException {

        AccountPage accountPage = new AccountPage(driver);

        accountPage.ClickAddAcc();
        Thread.sleep(1000);

        WebElement customerInput = driver.findElement(By.xpath("//*[@id=\"userSelect\"]/option[7]"));

        accountPage.FillCustomer(customerInput.getText());
        Thread.sleep(1000);

        WebElement currencyInput = driver.findElement(By.xpath("//*[@id=\"currency\"]/option[2]"));

        accountPage.FillCurrency(currencyInput.getText());
        Thread.sleep(1000);

        accountPage.ConfirmAccount();
        Thread.sleep(3000);

        System.out.println("Testcase-4 accepted Successfully!!!");

    }

    @Test(priority = 4)
    public void SearchPage() throws InterruptedException {

        SearchPage searchPage = new SearchPage(driver);

        searchPage.ClickCustomerBtn();
        Thread.sleep(1000);

        searchPage.ClickSearchField();
        Thread.sleep(1000);

        searchPage.EnterSearchField("Merey");
        Thread.sleep(2000);

        Assert.assertEquals( searchPage.getWelcomeText(), "Merey");
        System.out.println("Testcase-5 accepted Successfully!!!");

    }

    @Test(priority = 5)
    public void DeletePage() throws InterruptedException {

        DeletePage deletePage = new DeletePage(driver);

        deletePage.ClickDeleteBtn();
        Thread.sleep(2000);

        System.out.println("Testcase-6 accepted Successfully!!!");

    }


    @AfterSuite()
    public void close(){
        driver.close();
    }
}
