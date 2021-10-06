package com.cybertek.tests.day10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import javafx.scene.web.WebEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class ActionsTest {

    WebDriver driver;

    @BeforeMethod

    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        sleep(3000);
        driver.quit();
    }

    @Test
    public void hoverTest() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img1 = driver.findElement(By.tagName("img"));

        Actions actions = new Actions(driver);
        sleep(3000);
        actions.moveToElement(img1).perform();


        WebElement ViewLink = driver.findElement(By.linkText("view profile"));

        Assert.assertTrue(ViewLink.isDisplayed(), "verify view link is displayed");

    }


    @Test
    public void dragAndDrop() {
        driver.get("https://demos.telerik.com/kendo-uni/dragdrop/index");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));


        actions.dragAndDrop(source, target).perform();
    }

    @Test
    public void ScrollDownAndUp() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        driver.manage().window().maximize();

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        for (int i = 0; i < 10; i++) {
            Thread.sleep(3000);
            jse.executeScript("window.scrollBy(0,250)");

        }
        }

        @Test
    public  void scrollToElement() throws InterruptedException {

        driver.get("https://www.amazon.com/");
        WebElement eng =driver.findElement(By.id("icp-touch-link-language"));
        Thread.sleep(2000);
        JavascriptExecutor jse =(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)",eng);

        }
    }