package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_Test {

	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\piyush.sonkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication");
		
		 
		Element.Email_address(driver).sendKeys("piyushsonkar007@gmail.com");
		Element.SubmitCreate(driver).click();
		Thread.sleep(3000);
		Element.Title_gender(driver).click();
		Element.First_name(driver).sendKeys("piyush");
		Element.Last_name(driver).sendKeys("Testing");
		Element.Password(driver).sendKeys("Test@123");
		Element.Bdate(driver).sendKeys("19");
		Element.Bmonths(driver).sendKeys("January ");
		Element.Byears(driver).sendKeys("1994");
		Element.firstname(driver).sendKeys("piyush");
		Element.lastname(driver).sendKeys("Testing");
		Element.Company_name(driver).sendKeys("Sg Infotech it solutions");
		Element.Address(driver).sendKeys("E11, PO Box 12714, Sg Infotech it solutions.");
		Element.City(driver).sendKeys("Lucknow");
		Element.State(driver).sendKeys("32");
		Element.ZipPostalCode(driver).sendKeys("05222");
		Element.Country(driver).sendKeys("21");
		Element.Mobilephone(driver).sendKeys("9807106753");
		Element.address_alias(driver).sendKeys("My address is E11");
		Element.submitAccount(driver).click();
		
		
	}
	
}
