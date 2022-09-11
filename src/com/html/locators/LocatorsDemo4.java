package com.html.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo4 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        //Absolute Xpath.
        //driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]")).sendKeys("T-shirts");
        //driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")).click();

        //Relative X-Path
        driver.findElement(By.xpath("//input[@id = 'search_query_top']")).sendKeys("Summer");
        driver.findElement(By.xpath("//button[@name= 'submit_search']")).click();

    }
}
