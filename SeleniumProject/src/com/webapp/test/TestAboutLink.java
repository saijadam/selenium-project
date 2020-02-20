// 
// Decompiled by Procyon v0.5.36
// 

package com.webapp.test;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Assert;
import java.util.function.Function;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TestAboutLink
{
    static String driverPath;
    public static WebDriver driver;
    
    static {
        //TestAboutLink.driverPath = "C:\\Users\\SJM1\\Downloads\\chromedriver_win32\\";
    	//TestAboutLink.driverPath = "D:\\SeleniumTraining\\SeleniumProject\\lib\\";
        TestAboutLink.driverPath = "//usr//local//bin//";
    }
    
    @BeforeClass
    public static void setUp() {
        System.out.println("Launching chrome browser.......");
        //System.setProperty("webdriver.chrome.driver", String.valueOf(TestAboutLink.driverPath) + "chromedriver");
        //TestAboutLink.driver = (WebDriver)new ChromeDriver();
        driver = webdriver.Chrome('/usr/local/bin/chromedriver');
        TestAboutLink.driver.manage().window().maximize();
        TestAboutLink.driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
    }
    
    @Test
    public void testAboutLink() {
        TestAboutLink.driver.navigate().to("http://13.58.217.43:9999//projCert/website/content/home.php");
        final WebDriverWait wait = new WebDriverWait(TestAboutLink.driver, 30L);
        wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.linkText("About")));
        TestAboutLink.driver.findElement(By.linkText("About")).click();
        System.out.println("*******************");
        System.out.println("Text From Page: " + TestAboutLink.driver.findElement(By.id("PID-ab2-pg")).getText());
        System.out.println("*******************");
        Assert.assertTrue("Test Failed: Note Found \"about\" string in About Page", TestAboutLink.driver.findElement(By.id("PID-ab2-pg")).getText().contains("about"));
    }
    
    @AfterClass
    public static void tearDown() {
        if (TestAboutLink.driver != null) {
            System.out.println("Closing chrome browser....");
            TestAboutLink.driver.quit();
        }
    }
}
