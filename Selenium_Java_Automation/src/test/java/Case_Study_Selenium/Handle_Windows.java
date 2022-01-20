package Case_Study_Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handle_Windows {

	@Test
	public void Windows() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\piyush.sonkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();	
	 
    	d1.get("http://demo.automationtesting.in/Windows.html");
    	
    	// Open new Tabbed Window  ///
    	
    	/*d1.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
    	
    	String Mainwindowhandle=d1.getWindowHandle();  
    	Set<String >allWindowHandles = d1.getWindowHandles();
    	System.out.println("This is the current window id:"+Mainwindowhandle);
    	
    	for(String handle:allWindowHandles)
    	{
    		d1.switchTo().window(handle);
    		System.out.println(d1.getTitle());
    	    d1.close();
    	}*/
    	

    	Thread.sleep(3000);
    	// Open new child window within the main window   //
    	
    	d1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
    	d1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
    	
    	String mainWindowHandle_1 = d1.getWindowHandle();
        Set<String> allWindowHandles_1 = d1.getWindowHandles();
        Iterator<String> iterator = allWindowHandles_1.iterator();
    	
        System.out.println("This is the all NewWindows id:"+allWindowHandles_1);
        
     // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext())
        {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle_1.equalsIgnoreCase(ChildWindow))
                {
                d1.switchTo().window(ChildWindow);
                System.out.println("Title of child window is: " +d1.getTitle());
                d1.close();
                }
    	
	    }
    	 
	}
}