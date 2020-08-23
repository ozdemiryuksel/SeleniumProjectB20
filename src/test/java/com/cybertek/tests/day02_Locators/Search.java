package com.cybertek.tests.day02_Locators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Search {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("apple"+Keys.ENTER);
        if("apple - Google Search".equals(driver.getTitle())){
            System.out.println("Verification PASSED");
        }else{
            System.out.println("Verification FAILED!");
        }
    }
}
