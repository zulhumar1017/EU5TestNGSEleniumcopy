package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {

    public static void main(String[] args) {


        /**
         *
         * not dusebilirisn  ( once gorevi tanimlamak icin kullan )
         */
        WebDriver driver;
        driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com");

    }
}

