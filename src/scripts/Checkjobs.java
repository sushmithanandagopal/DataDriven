package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.Auto_Constant;
import generics.Excel;

public class Checkjobs implements Auto_Constant{
	static
	{
	System.setProperty(key, value);
	}
	public static void main(String[] args) 
	{
		String us=Excel.details(excelpath,"sheet1",2,1);
		String pswd=Excel.details(excelpath,"sheet1",2,2);
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		driver.findElement(By.id("login-email")).sendKeys(us);
		driver.findElement(By.id("login-password")).sendKeys(pswd);
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("jobs-tab-icon")).click();
		driver.close();
		
		
	}

}
