package com.html.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo8 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        //Get all the menu names
        List<WebElement> menuList = driver.findElements(By.xpath("(//a[contains(text(), 'T-shirts')])[2]/ancestor ::li/ancestor::ul/child::*"));
        for(int i = 0; i < menuList.size(); i++){
            System.out.println("Menu# " + (i + 1) + " : " + menuList.get(i).getText());
        }

    }
}
