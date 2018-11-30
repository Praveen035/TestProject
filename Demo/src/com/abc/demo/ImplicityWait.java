package com.abc.demo;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ImplicityWait
{
	public static void main(String[] args)
	{
    String url="https://www.magento.com/";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.get("url");
    WebElement myAcct=driver.findElement(By.linkText("My Account"));
    myAcct.click();
    WebElement email=driver.findElement(By.id("email"));
    email.sendKeys("Sucheendra.abc@gmail.com");
    WebElement pwd=driver.findElement(By.id("pass"));
    pwd.sendKeys("Welcome123");
     WebElement login=driver.findElement(By.id("send2"));
     login.click();
     WebDriverWait wait=new WebDriverWait(driver,50);
     WebElement logout=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Out")));
     logout.click();
    
    
    
    
	}


}
