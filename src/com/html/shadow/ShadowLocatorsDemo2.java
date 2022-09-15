package com.html.shadow;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowLocatorsDemo2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://watir.com/examples/shadow_dom.html");
        driver.manage().window().maximize();

        WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
        SearchContext shadowLevel1 = shadowHost.getShadowRoot();
        WebElement shadowContent1 = shadowLevel1.findElement(By.cssSelector("#nested_shadow_host"));
        SearchContext shadowLevel2 = shadowContent1.getShadowRoot();
        WebElement shadowContent = shadowLevel2.findElement(By.cssSelector("#nested_shadow_content"));

        System.out.println(shadowContent.getText());

    }
}
