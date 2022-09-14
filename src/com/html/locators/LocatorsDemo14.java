package com.html.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo14 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement createAccountButton = driver.findElement(By.xpath("//form[@class = '_9vtf']/child:: div[5]/a"));
        System.out.println("Text on the button : " + createAccountButton.getText());
        //click the button
        createAccountButton.click();

        Thread.sleep(5000);

        //Enter first name
        WebElement firstName = driver.findElement(By.xpath("//button[@class = '_6j mvm _6wk _6wl _58mi _3ma _6o _6v' and @type = 'submit']/ancestor:: div[8]/descendant :: div[12]/following :: form/descendant :: input[3][@name = 'firstname']"));
        firstName.sendKeys("Aditya");

        //Enter last name
        WebElement lastName = driver.findElement(By.xpath("//button[@class = '_6j mvm _6wk _6wl _58mi _3ma _6o _6v' and @type = 'submit']/ancestor:: div[8]/descendant :: div[12]/following :: form/descendant :: input[4][@name = 'lastname']"));
        lastName.sendKeys("Bhattacharya");

        //Enter mobile number
        WebElement mobileNumber = driver.findElement(By.xpath("//button[@class = '_6j mvm _6wk _6wl _58mi _3ma _6o _6v' and @type = 'submit']/ancestor:: div[8]/descendant :: div[12]/following :: form/descendant :: input[5][@name = 'reg_email__']"));
        mobileNumber.sendKeys("4845242689");

        //Enter password
        WebElement pwd = driver.findElement(By.xpath("//button[@class = '_6j mvm _6wk _6wl _58mi _3ma _6o _6v' and @type = 'submit']/ancestor:: div[8]/descendant :: div[12]/following :: form/descendant :: input[7][@name = 'reg_passwd__']"));
        pwd.sendKeys("Testing1234");
    }
}
