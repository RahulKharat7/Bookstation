package com.bookstation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testdata extends BookStation_TestData

{
	WebDriver driver;

    @BeforeTest
    public void LaunchBrowser()
    {
    	WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
        driver.get("https://bookstation.vinsys.live/portal/public/login");
        driver.manage().window().maximize();
    }
     @Test(priority=1,dataProvider="Login")
    public void Login(String username , String password)
    {
        driver.findElement(By.id("emailid_validation")).sendKeys(username);
        driver.findElement(By.id("password_validation")).sendKeys(password);
        driver.findElement(By.className("login_btn")).click();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,270)", "");
    }

	@Test(priority=2)
	public void W_001() {
		
        //driver.findElement(By.xpath("//div[@class='row aos-init aos-animate']//div[@class='owl-stage']//div[1]//div[1]//a[1]//img[1]")).click();
	    driver.findElement(By.className("toggle")).click();
		driver.findElement(By.className("active")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Technology']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-heart-o']")).click();
		
		
	    
	} 
	
	@Test(priority=3)
	public void W_002() {
		
	    driver.findElement(By.xpath("//a[@class='nav-link wishlist hover_effect_header']")).click();
      
	//}
	

   }
	@Test(priority=4)
	public void W_003() {
	
   driver.findElement(By.xpath("//a[normalize-space()='Remove']")).click();
    
	}
	}
