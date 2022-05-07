package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https:practice.cydeo.com");
        //driver.get("https:practice.cydeo.com"); bu da kullanilabilr

        // //Click to A/B Testing from top of the list.
        //driver.findElement(By.linkText("A/B Testing")).click(); BU DA KULLANILABILIR ALTTAKI DAHA SADE
        WebElement abTestLink=driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();
        // //Verify tittle is : Expected:No: A/B Test#
        String expectedTitle="No A/B Test";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS!!");
        }
        else {
            System.out.println("Title verification FAILED!!");
        }
        //Go back to home page by using the .back();
        driver.navigate().back();
        String expectedTitle2="Practice";
        String actualTitle2=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("TITLE VERIFICATION PASS!!");
        }
        else{
            System.out.println("Title VERIFICATION FAILED!!!");

        }
    }
}
    //1 open a Chrome browser
   //go to:https:practice.cydeo.com
   //Click to A/B Testing from top of the list.
   //Verify tittle is : Expected:No: A/B Test#
   //Go back to home page by using the .back();
   //Verify title equals: Expected:Practice