package com.abc.demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SubmitEnable 
{
   public static void main(String[] args) throws InterruptedException 
	{
		String url="https://account.magento.com/customer/account/create/";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		WebElement submit = driver.findElement(By.id("registerSubmit"));
		submit.click();
		Thread.sleep(10000000);
		System.out.println(submit.isEnabled());
	}
		
}
