package com.html.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo12 {

    public static void main(String[] args) {

        //preceding elements
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupsa");
        driver.manage().window().maximize();

        List<WebElement> precedingNodes = driver.findElements(By.xpath("//a[contains(text(), 'Saras.Commercial')]/ancestor :: tr/preceding :: tr"));
        for(int i = 0; i < precedingNodes.size(); i++){
            System.out.println(precedingNodes.get(i).getText());
        }
        System.out.println("*******************************************************");
        //preceding-siblings
        List<WebElement> precedingSiblingsNodes = driver.findElements(By.xpath("//a[contains(text(), 'DB Corp')]/ancestor :: tr/preceding-sibling :: tr"));
        for(int i = 0; i < precedingSiblingsNodes.size(); i++){
            System.out.println(precedingSiblingsNodes.get(i).getText());
        }
    }
}
