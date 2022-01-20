package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Element {
	
	static WebDriver d1;
	

	public static WebElement Email_address(WebDriver d1) {
		
		return d1.findElement(By.xpath("//input[@id='email_create']"));
	}
	
    public static WebElement SubmitCreate(WebDriver d1) {
	
    	return d1.findElement(By.xpath("//button[@id='SubmitCreate']"));
	}
    
    public static WebElement Title_gender(WebDriver d1) {
    	
    	return d1.findElement(By.xpath("//input[@id='id_gender1' and @type='radio']"));
	}
    
    public static WebElement First_name(WebDriver d1) {
    	
    	return d1.findElement(By.name("customer_firstname"));
	}
    
    public static WebElement Last_name(WebDriver d1) {
    	
    	return d1.findElement(By.id("customer_lastname"));
    }
	
    public static WebElement Password(WebDriver d1) {
    	
    	return d1.findElement(By.id("passwd"));
    }
   
    By days=By.id("days");
    By months=By.id("months");
    By years=By.id("years");
    By id_state=By.xpath("//*[@id='id_state']");
    By id_country=By.id("id_country");	
    
    
    public static WebElement Bdate(WebDriver d1) {
    	
    	return d1.findElement(By.id("days"));
    }
    
    public static WebElement Bmonths(WebDriver d1) {
    	
    	return d1.findElement(By.id("months"));
    }
  
    public static WebElement Byears(WebDriver d1) {
	
	    return d1.findElement(By.id("years"));
    }  
    
    public static WebElement firstname(WebDriver d1) {
    	
    	return d1.findElement(By.name("firstname"));
	}
    
    public static WebElement lastname(WebDriver d1) {
    	
    	return d1.findElement(By.id("lastname"));
    }
    
    public static WebElement Company_name(WebDriver d1) {
    	
    	return d1.findElement(By.id("company"));
    }
    
    public static WebElement Address(WebDriver d1) {
	
	    return d1.findElement(By.id("address1"));
	
    }

    public static WebElement City(WebDriver d1) {
	
	    return d1.findElement(By.id("city"));
    }

    public static WebElement State(WebDriver d1) {
	
	    return d1.findElement(By.xpath("//*[@id='id_state']"));
	
    }

    public static WebElement ZipPostalCode(WebDriver d1) {
	
	    return d1.findElement(By.id("postcode"));
    }

    public static WebElement Country(WebDriver d1) {
	
	    return d1.findElement(By.id("id_country"));
    }

    public static WebElement Mobilephone(WebDriver d1) {
	
	    return d1.findElement(By.id("phone_mobile"));
	    
    }

    public static WebElement address_alias(WebDriver d1) {
	
	    return d1.findElement(By.id("alias"));
	    
    }

    public static WebElement submitAccount(WebDriver d1) {
	
	    return d1.findElement(By.id("submitAccount"));
}
    
 
    
    /////           Login page      //////////////////
    
    
    public static WebElement LoginEmail(WebDriver d1) {
		
		return d1.findElement(By.id("email"));
	}
    
    public static WebElement LoginPasswd(WebDriver d1) {
 		
		return d1.findElement(By.id("passwd"));
	}
    
    public static WebElement SubmitLogin(WebDriver d1) {
	
	    return d1.findElement(By.id("SubmitLogin"));
	
    }
    
    public static WebElement TShirts(WebDriver d1) {
    	
        return d1.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
    	
    }
    
    public static WebElement Addtocart(WebDriver d1) {
    	
        return d1.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]"));
    	
    }


}
