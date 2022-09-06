package com.html.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.id("search_query_top"));
        searchBox.sendKeys("T-Shirts");
        WebElement searchButton = driver.findElement(By.name("submit_search"));
        searchButton.click();
        //WebElement link1 = driver.findElement(By.linkText("Printed Chiffon Dress"));
        WebElement link1 = driver.findElement(By.partialLinkText("Chiffon"));
        link1.click();
        WebElement price = driver.findElement(By.id("our_price_display"));
        System.out.println("The price is : " + price.getText());


    }
}
