package com.cybertek.tests.day1_intro;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class deneme {

    WebDriver driver ;
    @Test
    public void method1(){

        WebDriverFactory.getDriver("chrome");
        driver.get("http://amazom.com");


    }
}
