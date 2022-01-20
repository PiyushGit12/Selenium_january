package Case_Study_Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToyWith_Table {

	@Test
	public void Verifytable() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\piyush.sonkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.get("http://www.leafground.com/pages/table.html");
		
		
    	WebElement table=d1.findElement(By.xpath("//table[@id='table_id']"));
    	List<WebElement> columns=d1.findElements(By.xpath("//table[@id='table_id']//th"));          // this is for all columns  
    	List<WebElement> rows=d1.findElements(By.xpath("//table[@id='table_id']//tr"));            // // this is for all Rows
    	List<WebElement> all_table_data=d1.findElements(By.xpath("//table[@id='table_id']//td"));  // This is for all table data
    	
    	
    	int columnCount=columns.size();
    	System.out.println("No of columns in this table : " + columnCount);
    	
    	for(WebElement ele:columns)
    	{
    		String columns_values=ele.getText(); 	
    		System.out.println(columns_values);
    	}
    	
    	System.out.println("=====================================");
    	
    	
    	int rowCount=rows.size();
    	System.out.println("No of Rows in this table : " + rowCount);
    	
    	for(WebElement ele_0:rows)
    	{
    		String rows_values=ele_0.getText(); 	
    		System.out.println(rows_values);
    		System.out.print("  ||  ");
    	}
    	
    	
    	System.out.println("=====================================");
    	
    	// Get the progress value of 'Learn to interact with Elements'

    	boolean datastatus=false;
    	
    	for(WebElement ele_1:all_table_data)
    	{
    		String values=ele_1.getText(); 	
    		System.out.println(values);
    		if(values.contains("80%"))
    		{
    			datastatus=true;
    			break;
    			
    		}
    	}
    	
    	System.out.println("======================================");
    	
    	
	}
	
}
