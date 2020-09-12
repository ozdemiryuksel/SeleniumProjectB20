package com.cybertek.tests.day03_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/button[2]"));
        button2.click();
        Thread.sleep(4000);
        WebElement buttondont = driver.findElement(By.xpath("//*[@id=\"disappearing_button\"]"));
        buttondont.click();
    }
}
