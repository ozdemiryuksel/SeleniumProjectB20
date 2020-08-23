package com.cybertek.tests.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLVerification {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String expected = "https://www.facebook.com/";
        String actual = driver.getCurrentUrl();
        // Thread.sleep(2000);
        System.out.println(actual);
        if(actual.equals(expected)){
            System.out.println("Verification PASSED");
        }else{
            System.out.println("Verification FAILED!");
        }
    }
}
