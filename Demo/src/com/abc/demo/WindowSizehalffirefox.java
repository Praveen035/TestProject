package com.abc.demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSizehalffirefox
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		Dimension dim=driver.manage().window().getSize();
		System.out.println("the width size"+dim.width);
		System.out.println("the height size"+dim.height);
		
		Dimension ndim=new Dimension(dim.width/2,dim.height/2);
		System.out.println("the width size"+ndim.width);
		System.out.println("the height size"+ndim.height);
		driver.manage().window().setSize(ndim);
	}
}
