package Case_Study_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handle_UnOrdered_list {

	@Test
	public void Login() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\piyush.sonkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.manage().window().maximize();

    	d1.get("http://demo.automationtesting.in/Selectable.html");
    	d1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
    	
    
    	List <WebElement> ele1 =d1.findElements(By.xpath("//ul[@class='deaultFunc']/li"));
    	System.out.println("The size of list is :" +ele1.size());
    	
    	for(WebElement list_1: ele1)
    	{
    		System.out.println("The text of all list is:" +list_1.getText());	
    	}
    		
    	Thread.sleep(50000);
    	
    	d1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
    	List <WebElement> ele2=d1.findElements(By.xpath("//ul[@class=\"SerializeFunc\"]/li"));
    	System.out.println("The size of list is :" +ele2.size());
    	
    	for(WebElement list_2: ele2)
    	{
    		System.out.println("The text of all list is:" +list_2.getText());	
    	}
    	
 }
}