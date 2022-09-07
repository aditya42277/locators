package com.html.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        //Email address using tag and Id Css Locator combination.
        driver.findElement(By.cssSelector("input#email")).sendKeys("addy.ranjan@gmail.com");
        //Password using tag class and attribute Css Locator combination.
        driver.findElement(By.cssSelector("input.inputtext[name=pass]")).sendKeys("hr51af1974!");
        //Login button using tag and attribute
        //driver.findElement(By.cssSelector("button[type=submit]")).click();
        //driver.findElement(By.cssSelector("div._6ltj")).click();
        //tag and attribute
        driver.findElement(By.cssSelector("a._42ft[data-testid=open-registration-form-button]")).click();
        /*List<WebElement> lst = driver.findElements(By.cssSelector("a[role=button]"));
        System.out.println("Text : " + lst.get(0).getText());
        lst.get(1).click();*/

    }
}
