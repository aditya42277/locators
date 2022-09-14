package com.html.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo10 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupsa");
        driver.manage().window().maximize();

        List<WebElement> data = driver.findElements(By.xpath("//a[contains(text(), 'EP Biocomposites')]/ancestor :: tr/following :: tr"));
        System.out.println("Size of the list is : " + data.size());

        System.out.println("*************************************************");
        for(int i = 0; i < data.size(); i++){
            System.out.println(data.get(i).getText());
        }
    }
}
