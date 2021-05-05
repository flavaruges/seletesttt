package com.seletest;

import junit.framework.*;
import junit.framework.Test;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;  
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.junit.*;
  
public class Firsttestclass {  
  
    
	public static void main(String[] args) {  
          
          // System Property for Gecko Driver   
    System.setProperty("webdriver.gecko.driver","C:\\Users\\fsegu\\eclipse-workspace\\seletest\\res\\driver\\geckodriver.exe" );  
          
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
        //capabilities.setCapability("marionette",true);  
        //WebDriver driver= new FirefoxDriver();  
        
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(firefoxOptions);
          
     driver.navigate().to("C:\\Users\\fsegu\\eclipse-workspace\\seletest\\res\\Sample Test Page.html");  
      
   String sampleText = driver.findElement(By.className("col-md-12")).getText();  
   System.out.println(sampleText);  
          
    System.out.print(driver.findElement(By.linkText("This is a link")).isDisplayed());  
       
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    
    
     driver.findElement(By.id("fname")).sendKeys("JavaTpoint");  
       
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
    //next stage
    driver.navigate().to("https://www.google.com/");
    
    System.out.print("DONE");
        // Close the Browser  
     
     driver.close();  
     driver.quit(); 
    }  
}