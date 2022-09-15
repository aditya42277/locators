package com.html.shadow;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowLocatorsDemo4 {

    public static SearchContext getShadowDom(WebElement ele){
        return ele.getShadowRoot();
    }

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://shop.polymer-project.org/");
        driver.manage().window().maximize();

        WebElement rootWebElement = driver.findElement(By.cssSelector("[page='home']"));
        SearchContext shadowRoot = getShadowDom(rootWebElement);
        WebElement childWebElement = shadowRoot.findElement(By.cssSelector("iron-pages"));
        WebElement secondChildWebElement = childWebElement.findElement(By.cssSelector("shop-home.iron-selected"));
        SearchContext childShadowRoot = getShadowDom(secondChildWebElement);
        WebElement thirdChildWebElement = childShadowRoot.findElement(By.cssSelector("div.item"));
        WebElement fourthChildWebElement = thirdChildWebElement.findElement(By.cssSelector("shop-button"));
        System.out.println("Text on the button : " + fourthChildWebElement.getText());
        fourthChildWebElement.click();
    }
}
