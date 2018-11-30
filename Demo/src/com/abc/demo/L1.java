package com.abc.demo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L1 
{
    public static void main(String[] args) 
	{
		System.out.println("Enter the title");
		Scanner scan=new Scanner(System.in);
		String eTitle=scan.next();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		String aTitle=driver.getTitle();
		System.out.println("The actual Title is"+aTitle);
		System.out.println("The expeccted Title is"+eTitle);
		if(aTitle.equalsIgnoreCase(eTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
