package com.html.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo7 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\14845\\Dropbox\\Training\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupsa");
        driver.manage().window().maximize();

        //Self
        String selfText = driver.findElement(By.xpath("//a[contains(text(), 'ABM Knowledgeware')]//self::a")).getText();
        System.out.println("Using the Self Axes, the text is : " + selfText);

        //Parent
        String parentText = driver.findElement(By.xpath("//a[contains(text(), 'ABM Knowledgeware')]/parent::td")).getText();
        System.out.println("Using the Parent Axes, the text is : " + parentText);

        //Child
        String childText1 = driver.findElement(By.xpath("//a[contains(text(), 'ABM Knowledgeware')]/ancestor :: tr/child:: td[2]")).getText();
        System.out.println("Using the Child Axes, the text for child 1 is : " + childText1);

        String childText2 = driver.findElement(By.xpath("//a[contains(text(), 'ABM Knowledgeware')]/ancestor :: tr/child:: td[3]")).getText();
        System.out.println("Using the Child Axes, the text for child 2 is : " + childText2);

        String childText3 = driver.findElement(By.xpath("//a[contains(text(), 'ABM Knowledgeware')]/ancestor :: tr/child:: td[4]")).getText();
        System.out.println("Using the Child Axes, the text for child 3 is : " + childText3);

        String childText4 = driver.findElement(By.xpath("//a[contains(text(), 'ABM Knowledgeware')]/ancestor :: tr/child:: td[5]/font")).getText();
        System.out.println("Using the Child Axes, the text for child 4 is : " + childText4);

        //Ancestors
        String rowTextAncestor = driver.findElement(By.xpath("//a[contains(text(), 'Refex Industries')]/ancestor :: tr")).getText();
        System.out.println(rowTextAncestor);

        //Descendant - Will include children and grand children
        List<WebElement> descendantsRow = driver.findElements(By.xpath("//a[contains(text(), 'EP Biocomposites')]/ancestor::tr/descendant :: td"));
        for(int i = 0; i < descendantsRow.size(); i++){
            System.out.print(descendantsRow.get(i).getText() + "    ");

        }
        System.out.println();

        String descText = driver.findElement(By.xpath("//a[contains(text(), 'EP Biocomposites')]/ancestor::tr/descendant :: td/a")).getText();
        System.out.println(descText);

        //Following - Everything in the document after the closing tag of the current node.

        driver.close();






    }
}
