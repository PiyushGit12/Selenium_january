package Object_Repository;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Login {

	public static WebDriver d1 = null;
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\piyush.sonkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		d1 = new ChromeDriver();
	
		d1.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        
		
		Element.LoginEmail(d1).sendKeys("piyushsonkar111@gmail.com");
		Element.LoginPasswd(d1).sendKeys("Test@123");
		Element.SubmitLogin(d1).click();
		Element.TShirts(d1).click();
		Element.Addtocart(d1).click();
		
		Robot r1=new Robot();
        Dimension var1=Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rec1=new Rectangle(var1);
        BufferedImage src=r1.createScreenCapture(rec1);
        File dest=new File(".\\ScreenShot\\Addtocart");
        ImageIO.write(src, "jpeg", dest);
		
		
	}
}