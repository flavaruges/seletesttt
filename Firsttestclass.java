package com.seletest;

import junit.framework.*;
import junit.framework.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.junit.*;
  
public class Firsttestclass {  
  
    
	public static void main(String[] args) {  
          
          // System Property for Gecko Driver   
    System.setProperty("webdriver.chrome.driver","\\\\WDCNAPVS505\\HOME20$\\H61051\\Downloads\\seletesttt-master\\res\\driver\\chromedriver.exe" );  
          
        //DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("marionette",true);  
        //WebDriver driver= new FirefoxDriver();  
        
        //FirefoxOptions firefoxOptions = new FirefoxOptions();
        //firefoxOptions.setCapability("marionette", true);
        //WebDriver driver = new FirefoxDriver(firefoxOptions);
        WebDriver driver = new ChromeDriver();
          
     driver.navigate().to("\\\\\\\\WDCNAPVS505\\\\HOME20$\\\\H61051\\\\Downloads\\\\seletesttt-master\\\\res\\\\Sample Test Page.html");  
      
   String sampleText = driver.findElement(By.className("col-md-12")).getText();  
   System.out.println(sampleText);  
          
    System.out.print(driver.findElement(By.linkText("This is a link")).isDisplayed());  
       
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    
    
     driver.findElement(By.id("fname")).sendKeys("JavaBot");  
       
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
     driver.findElement(By.id("fname")).clear();  
          
        
     driver.findElement(By.id("idOfButton")).click();  
   
     
     driver.findElement(By.id("male")).click();  
          
     driver.findElement(By.cssSelector("input.Automation")).click();  
              
    Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
    dropdown.selectByVisibleText("Automation Testing");  

    
    System.out.print(dropdown.toString());
    //next stage       
    
    
    driver.navigate().to("https://demoqa.com/automation-practice-form");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    JavascriptExecutor js = (JavascriptExecutor)driver;  
    
    driver.findElement(By.id("firstName")).sendKeys("Ja"); 
    driver.findElement(By.id("lastName")).sendKeys("VaBot"); 
    driver.findElement(By.id("userEmail")).sendKeys("bot@bot.com"); 
    driver.findElement(By.className("custom-control-label")).click();
    WebDriverWait wait = new WebDriverWait(driver, 5);
    driver.findElement(By.className("custom-control-label")).click();
  
    js.executeScript("scrollBy(0, 4500)"); 
    
    
    driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[10]/div[2]/div/div/div[2]/div")).click();
    driver.findElement(By.id("submit")).click(); 
    
   
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //last stage
    driver.navigate().to("https://www.google.com/");
    
    driver.findElement(By.name("q")).sendKeys("TCS");
    
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    
    js.executeScript("scrollBy(0, 2500)"); 
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.print("did you find it? ");
    System.out.print(driver.findElement(By.partialLinkText("Tata Consultancy Services (TCS)")).isDisplayed());
    
    System.out.print(" IS DONE");
        // Close the Browser  
     
     driver.close();  
     driver.quit(); 
    }  
}
