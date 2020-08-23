package com.cybertek.tests.day02_Locators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigations {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.linkText("Gmail")).click();
        String expected = "Gmail - Email from Google";
        String actual = driver.getTitle();
        if(actual.equals(expected)){
            System.out.println("Verification PASSED");
        }else{
            System.out.println("Verification FAILED!");
        }
        driver.navigate().back();
        if("Google".equals(driver.getTitle())){
            System.out.println("Verification PASSED");
        }else{
            System.out.println("Verification FAILED!");
        }


    }
}
