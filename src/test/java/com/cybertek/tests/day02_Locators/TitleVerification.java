package com.cybertek.tests.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.microsoft.com/");
        String expected = "Microsoft - Official Home Page";
        String actual = driver.getTitle();
        if(actual.equals(expected)){
            System.out.println("Verification PASSED");
        }else{
            System.out.println("Verification FAILED!");
        }
    }
}
