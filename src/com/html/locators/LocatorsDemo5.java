package com.html.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocatorsDemo5 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        //WebDriverWait wait = new WebDriverWait(driver,30);

        //Hover over the blouse image first
        WebElement ele = driver.findElement(By.xpath("(//*[@alt='Blouse'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform();

        WebElement addBlouseToCart = driver.findElement(By.xpath("(//*[@title = 'Add to cart' and @class = 'button ajax_add_to_cart_button btn btn-default' ])[2]"));
        addBlouseToCart.click();



    }
}
