package com.cybertek.tests.day03_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkVerification {
    public static void main(String[] args) {

        // WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //driver.findElement(By.name("email")).sendKeys("test@test.com");
        WebElement emailInputBox = driver.findElement(By.name("email"));
        emailInputBox.sendKeys("test@test.com");
        // driver.findElement(By.id("form_submit")).click();
        WebElement retrievePasswordButton = driver.findElement((By.id("form_submit")));
        retrievePasswordButton.click();

        String expectedInURL = "email_sent";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedInURL)){
            System.out.println("passed");
        }else{
            System.out.println("failed!");
        }

        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));

        String actualText = driver.findElement(By.name("confirmation_message")).getText();
        String expectedText = "Your e-mail's been sent";

        if(actualText.contains(expectedText)){
            System.out.println("passed");
        }else{
            System.out.println("failed!");
        }

        //verify if the web element is displayed or not
        if (confirmationMessage.isDisplayed()){
            System.out.println("Confirmation message is displayed. Verification PASSED!");
        }else{
            System.out.println("Confirmation message is NOT displayed. Verification FAILED!!!");
        }


    }
}
