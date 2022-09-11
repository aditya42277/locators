package com.html.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocatorsDemo6 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        //Printed dress = (//a[contains(@title, 'Printed Dress')])[1]
        //Price = (//span[contains(@itemprop, 'price')])[6]
        Thread.sleep(5000);

        WebElement ele = driver.findElement(By.xpath("(//img[contains(@class, 'replace-2x img-responsive')])[3]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform();

        //More button click
        //(//span[contains(text(),'More')])[3]
        WebElement moreButton = driver.findElement(By.xpath("(//span[contains(text(),'More')])[3]"));
        moreButton.click();
        Thread.sleep(5000);

        WebElement dressType = driver.findElement(By.xpath("//h1[@itemprop = 'name']"));
        System.out.println("The type of dress is : " + dressType.getText());

        WebElement dressPrice = driver.findElement(By.xpath("//span[@id = 'our_price_display']"));
        System.out.println("The cost of the dress is : " + dressPrice.getText());

        WebElement dressModel = driver.findElement(By.xpath("(//p[contains(@id, 'product')])[1]"));
        System.out.println("The model of the dress is  : " + dressModel.getText());

        WebElement dressCondition = driver.findElement(By.xpath("(//p[starts-with(@id, 'product')])[2]"));
        WebElement dressConditionValue = driver.findElement((By.xpath("//span[starts-with(@class , 'edi') and normalize-space() = 'New']")));
        System.out.println("The dress : " + dressCondition.getText() + " is like : " + dressConditionValue.getText());

        WebElement desc = driver.findElement(By.xpath("(//p[text() = '100% cotton double printed dress. Black and white striped top and orange high waisted skater skirt bottom.'])[1]"));
        System.out.println(desc.getText());



        /*WebElement typeDress = driver.findElement(By.xpath("(//a[@class = 'product-name' and @title = 'Printed Dress' and @itemprop = 'url'])[1]"));
        System.out.println("The dress is fo type : " + typeDress.getText());

        WebElement dressPrice = driver.findElement(By.xpath("(//span[contains(@class, 'price product-price')])[6]"));

        System.out.println("The price of the dress is : " + dressPrice.getText());
        //span[@itemprop = 'price']*/
    }
}
