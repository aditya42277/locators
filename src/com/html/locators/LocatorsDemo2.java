package com.html.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        List<WebElement> list1 = driver.findElements(By.className("homeslider-container"));
        System.out.println("Number of sliders : " + list1.size());

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links in the page : " + links.size());
    }
}
