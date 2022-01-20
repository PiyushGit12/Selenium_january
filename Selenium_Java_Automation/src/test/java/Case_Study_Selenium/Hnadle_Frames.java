package Case_Study_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hnadle_Frames {

	@Test
	public void Frames() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\piyush.sonkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();	
    	d1.get("http://demo.automationtesting.in/Frames.html");
    	d1.manage().window().maximize();
    	
    	 ///////////////////   Single_frame            ////////////////////////
    	
    	d1.switchTo().frame("SingleFrame");
    	d1.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("send text in frame");

    	//Switch back to the main window
    	d1.switchTo().defaultContent();
    	
        ///////////////////   iframe with in an iframe             ////////////////////////
    	
    	Thread.sleep(3000);    
    	WebElement secondtab=d1.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
    	secondtab.click();
    	
    	d1.switchTo().frame(1);
    	d1.switchTo().frame(0);
    	WebElement textbox=d1.findElement(By.xpath("/html/body/section/div/div/div/input"));
    	textbox.sendKeys("send text in frame with in an iframe");
    	
    	
 }
}