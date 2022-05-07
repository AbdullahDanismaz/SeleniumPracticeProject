package com.cydeo.tests.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {
        //do setup for browser driver
        WebDriverManager.chromedriver().setup();
        // open Chrome browser
        WebDriver driver=new ChromeDriver();
     //MAKE OUR PAGE FULL SCREEN
        driver.manage().window().maximize();
        //go to "https://www.yahoo.com"
       driver.get("https://www.yahoo.com");
       // verify title :
        //Expected:Yahoo is part of the Yahoo family of brands
       String expectedTitle= "Yahoo is part of the Yahoo family of brands";

        //actual title comes from the browser
        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected.VERIFICATION PASSED!");
        }
        else {
            System.out.println("Title is NOT as expected.VERIFICATION FAILED!");
        }

    }
}
