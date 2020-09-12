package com.cybertek.tests.day02_Locators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        // System.out.println(driver.findElement(By.tagName("h3")).getText());
        // System.out.println(driver.findElement(By.tagName("h3")));
        if(driver.findElement(By.tagName("h3")).getText().equals("Log in to ZeroBank")){
            System.out.println("Verification PASSED");
        }else{
            System.out.println("Verification FAILED!");
        }
    }
}
