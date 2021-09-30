package com.bookstation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
   

public class WishList{
	WebDriver driver;

    @BeforeTest
    public void LaunchBrowser()
    {
    	WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
        driver.get("https://bookstation.vinsys.live/portal/public/login");
        driver.manage().window().maximize();
	}
    @Test(priority=1)
    public void Login()
    {
        driver.findElement(By.id("emailid_validation")).sendKeys("rahulem2208@gmail.com");
        driver.findElement(By.id("password_validation")).sendKeys("Flynnryder@7");
        driver.findElement(By.xpath("//input[@name='login']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,270)", "");
    }
    
    @Test(priority=2)
    public void w_002() throws InterruptedException
{
    	Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div/div[1]/div/div[1]/div/a/img")).click();
	
	}
    
    @Test(priority=3)
    public void w_001() throws InterruptedException
{
    	Thread.sleep(3000);
    	//driver.findElement(By.xpath("//*[@id=\\\"wishlist_heart\\\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"wishlist_heart\"]")).click();
}
    @Test(priority=4)
    public void w_003D() throws InterruptedException
{
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"wishlist_heart\"]")).click();
}
    
    
    
    
    
     @Test(priority=5)
   public void navigateToWishList() throws InterruptedException {
    	 Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/ul/li[2]/a")).click();
   }
     @Test(priority=6)
     public void RemoveItem() throws InterruptedException {
    	 Thread.sleep(3000);
  	   driver.findElement(By.xpath("//*[@id=\"append_data_wishlist\"]/div/div/div[2]/div[2]/a[2]")).click();
     }
  //public void w_004() {
	
  //}*/
}

