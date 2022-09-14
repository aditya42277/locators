package com.html.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo11 {

    public static void main(String[] args) {

        //Following-sibling
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupsa");
        driver.manage().window().maximize();

        List<WebElement> followingSiblingNodes = driver.findElements(By.xpath("//a[contains(text(), 'Apollo TriCoat Tubes')]/ancestor :: tr/following-sibling :: *"));
        for(int i = 0; i < followingSiblingNodes.size(); i++){
            System.out.println(followingSiblingNodes.get(i).getText());
        }
    }
}
