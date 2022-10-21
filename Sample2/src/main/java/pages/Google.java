package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Google 
{
	 WebDriver driver;
	 
	  public void search()
	  {
		  String sbrowser=System.getProperty("browsername");
		  
		  if(sbrowser=="chrome")
		  {		  
			  WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
		  }
		   if(sbrowser=="firefox")
		  {		  
			  WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
		  }		  
		  driver.manage().window().maximize();
		  driver.get("http://www.google.com");
		  driver.findElement(By.name("q")).sendKeys("java");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  }
  }

