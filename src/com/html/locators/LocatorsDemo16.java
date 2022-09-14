package com.html.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo16 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        Thread.sleep(5000);


        /*
        //input[@id = 'twotabsearchtextbox']/ancestor :: div[2]/following :: a[44]
        */

        WebElement offToSchool = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']/ancestor :: div[2]/following :: div[@id = 'nav-xshop-container']/div/a[@href = '/offtocollege?ref_=nav_cs_otc']"));
        System.out.println("Text on the link : " + offToSchool.getText());
        WebElement welcomeText = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']/following :: div[@id = 'nav-tools']/a[2]"));
        System.out.println("Welcome text : " + welcomeText.getText());

        //offToSchool.click();
    }
}
