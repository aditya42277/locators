package com.html.shadow;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowLocatorsDemo3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement shadowHost = driver.findElement(By.cssSelector("book-app"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement appHeader = shadowRoot.findElement(By.cssSelector("app-header"));
        WebElement appToolBar = appHeader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
        WebElement bookInputDecorator = appToolBar.findElement(By.cssSelector("book-input-decorator"));
        bookInputDecorator.findElement(By.cssSelector("input#input")).sendKeys("Testing Shadow Dom, only Css Selectors to be used");



    }
}
