package com.abc.demo;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RoundTrip 
{
   public static void main(String[] args)
	{
		String url="https://www.cleartrip.com";
        ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement roundTrip=driver.findElement(By.id("RoundTrip"));
		  if(roundTrip.isSelected()==true)
		  {
			System.out.println("roundTrip is Selected");
		  }
		   else
		  {
			roundTrip.click();
		  }
		  WebElement rdate = driver.findElement(By.id("ReturnDate"));
		  if(rdate.isDisplayed()==true)
		  {
		       rdate.sendKeys("Wed, 21 Nov, 2018");
		  }
		  else
		  {
		      System.out.println("no rdate");
		  }
    }
}


