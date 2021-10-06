package com.cybertek.tests.day9_popups_tabs_framers;

import com.cybertek.utilities.WebDriverFactory;
import com.sun.deploy.cache.BaseLocalApplicationProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//************
public class iframeTest {
WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");

    }


    @Test
    public void test() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/nested_frames");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());



        Thread.sleep(3000);
        driver.quit();




        }


    }
//**

