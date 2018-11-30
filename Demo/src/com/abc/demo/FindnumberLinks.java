package com.abc.demo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindnumberLinks
{

	public static void main(String[] args) 
	{
		String url="https://magento.com/";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
	    List<WebElement> links =driver.findElements(By.tagName("a"));
		int size=links.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			String text=links.get(i).getText();
			System.out.println(text);
		}
	}
}
