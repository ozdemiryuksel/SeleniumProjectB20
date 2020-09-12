package com.cybertek.tests.day03_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_ZeroBankVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement ZBLinkTopLeft = driver.findElement(By.className("brand"));

        String expectedLinkText = "Zero Bank";
        String actualLinkText = ZBLinkTopLeft.getText();

        if(actualLinkText.contains(expectedLinkText)){
            System.out.println("passed");
        }else{
            System.out.println("failed!");
        }

        String expectedHref = "index.html";
        String actualHref = ZBLinkTopLeft.getAttribute("href");

        if(actualHref.contains(expectedHref)){
            System.out.println("passed");
        }else{
            System.out.println("failed!");
        }



    }
}
