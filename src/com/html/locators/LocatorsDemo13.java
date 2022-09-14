package com.html.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocatorsDemo13 {

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


        WebElement ele = driver.findElement(By.xpath("//div[@class = '_8ien']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform();

            /*
                //input[@id = 'u_10_g_s1']/following :: input[2]
             */

        //WebElement pwd = driver.findElement(By.xpath("//input[@id='password_step_input']"));
        WebElement pwd = driver.findElement(By.xpath("//button[@type = 'submit' and @class = '_6j mvm _6wk _6wl _58mi _3ma _6o _6v']/parent :: */parent :: */child :: div[4]/descendant :: input"));
        pwd.sendKeys("Testing automation");



        //WebElement firstNameTextBox = driver.findElement(By.xpath("//button[@id ='u_3_s_EV']/parent :: */parent :: */child :: div[1]/div/div/div/descendant :: input[@id = 'u_3_b_iI']"));
        //firstNameTextBox.click();
        //System.out.println(firstNameTextBox.getText());
        //firstNameTextBox.sendKeys("Aditya");

        WebElement signUpButton = driver.findElement(By.xpath("//div[@id= 'reg_form_box']/child :: div[11]/button[@type ='submit']"));
        System.out.println("Text on the button : " + signUpButton.getText());

        //click the button
        signUpButton.click();

    }
}
