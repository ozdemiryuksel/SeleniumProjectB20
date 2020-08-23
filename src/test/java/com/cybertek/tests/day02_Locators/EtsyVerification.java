package com.cybertek.tests.day02_Locators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class EtsyVerification {
    public static void main(String[] args)  throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon"+Keys.ENTER);
        if("Wooden spoon | Etsy".equals(driver.getTitle())){
            System.out.println("Verification PASSED");
        }else{
            System.out.println("Verification FAILED!");
        }
    }
}
