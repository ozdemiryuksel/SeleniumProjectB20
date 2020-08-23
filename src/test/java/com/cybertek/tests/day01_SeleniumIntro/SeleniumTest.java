package com.cybertek.tests.day01_SeleniumIntro;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException{
        //1- Setup the driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the driver
        WebDriver driver = new ChromeDriver();

        //3- Use the driver instance to test selenium
        driver.get("https://www.msn.com");

        System.out.println("title: "+driver.getTitle());

        System.out.println("actual URL: "+driver.getCurrentUrl());

        Thread.sleep(2000);
        driver.navigate().to("http://www.facebook.com");
        System.out.println("title: "+driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("title: "+driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();


    }
}
