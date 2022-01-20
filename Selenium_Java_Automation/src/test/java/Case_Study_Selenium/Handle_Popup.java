package Case_Study_Selenium;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handle_Popup {

	@Test
	public void Login() throws AWTException, InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\piyush.sonkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.get("http://demo.automationtesting.in/Alerts.html");
    	d1.manage().window().maximize();

    	// Alert with Okay   //
    	
    	d1.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click();
    	Alert a1=d1.switchTo().alert();
    	
    	 String msg_01=a1.getText();
         System.out.println("Alert-Popup_Box_msg_01 -"+msg_01);
         a1.accept();
         
         
         Thread.sleep(4000);
        // Alert with Okay and Cancel   //
         
        d1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        d1.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]")).click();
     	
     	String ExpTextok ="You pressed Ok";
     	
     	
     	d1.switchTo().alert().accept();
     	String ActText=d1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/p")).getText();
     	
     	if(ExpTextok.equals(ActText)==true)
     	{
     		System.out.println("Test is passed with press  ok");
     	}
     	
     	d1.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]")).click();
     	d1.switchTo().alert().dismiss();
     	
     	ActText=d1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/p")).getText();
     	String ExpTextcancel ="You Pressed Cancel";
     	
     	if(ExpTextcancel.equals(ActText)==true)
     	{
     		System.out.println("Test is passed with press cancel");
     	}
     	
     	
     	Thread.sleep(4000);
        // Alert with TextBox  //
     	
     	d1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
     	d1.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
     	Alert a3=d1.switchTo().alert();
     	a3.sendKeys("This is piyush script");
     	
     	
     	String msg_03=a3.getText();
        System.out.println("Alert-Popup_Box_msg_03 -"+msg_03);
        a3.accept();
        
 }
}