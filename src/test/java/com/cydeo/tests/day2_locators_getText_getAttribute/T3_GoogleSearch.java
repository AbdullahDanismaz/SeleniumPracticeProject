package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        //Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Go to:https://www.google.com
        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();
        WebElement googleSearchBox=driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);
    }
}
//Open a Chrome browser
//Go to:https://www.google.com
//write "apple" in search box
//Click google search button
//Verify title:
// Expected "Title should start with "apple" word"