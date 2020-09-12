package com.cybertek.tests.day02_Locators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HeaderVerification2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();
        //Account Activity verification
        driver.findElement(By.linkText("Account Activity")).click();
        String expectedAcctActivityTitle = driver.getTitle();
        //System.out.println(expectedAcctActivityTitle);
        String actualAcctActivityTitle = "Zero - Account Activity";
        if (actualAcctActivityTitle.equals(expectedAcctActivityTitle)) {
            System.out.println("Account Activity verification Passed");
        } else {
            System.out.println("Account Activity verification Failed");
        }
        driver.findElement(By.id("transfer_funds_tab")).click();
        String expectedTransferFundsTabTitle = "Zero - Transfer Funds";
        String actualTransferFundsTabTitle = driver.getTitle();
        if(actualTransferFundsTabTitle.equals(expectedTransferFundsTabTitle)){
            System.out.println("Transfer Funds Tab has passed");
        }else{
            System.out.println("Transfer Funds Tab hasn't passed");
        }
        driver.findElement(By.id("pay_bills_tab")).click();
        String expectedPayBills = "Zero - Pay Bills";
        String actualPayBills = driver.getTitle();
        if(actualPayBills.equals(expectedPayBills)){
            System.out.println("Pay Bills Tab has passed");
        }else{
            System.out.println("Pay Bills Tab hasn't passed");
        }
        driver.findElement(By.id("money_map_tab")).click();
        String expectedMyMoneyMap = "Zero - My Money Map";
        String actualMyMoneyMap = driver.getTitle();
        if(actualMyMoneyMap.equals(expectedMyMoneyMap)){
            System.out.println("My Money Map has passed");
        }else{
            System.out.println("My Money Map hasn't passed");
        }
        driver.findElement(By.partialLinkText("Statements")).click();
        String expectedOnlineStatements = "Zero - Online Statements";
        String actualOnlineStatements = driver.getTitle();
        if(actualOnlineStatements.equals(expectedOnlineStatements)){
            System.out.println("Online Statements Tab has passed");
        }else{
            System.out.println("Online Statements Tab has failed");
        }
    }
}