package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vstl.assignment.UtilitiesFunctions;

public class BaseTest extends UtilitiesFunctions {
	
	public  WebDriver driver;
	 
     public void initilizeWebDriver (String strUrl) {
   	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace1\\SeleniumTrainning\\Drivers\\chromedriver.exe");
   	driver = new ChromeDriver();
   		//	 driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=16109720371&extra_1=s%7Cc%7C580657069349%7Ce%7Cfacebook%20login%7C&placement=&creative="
 //  	+ "580657069349&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D16109720371%26adgroupid%3D134258540858%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D1007769%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwv-GUBhAzEiwASUMm4oLUkOb57_t_Hzec3-7uPTIbE3YGixI3RJdlv14n-NBym_rBHrN13hoCUh0QAvD_BwE");
   			 	  driver.get(strUrl);
   			 	driver.get("https://demoqa.com/text-box");
 //         	driver.get("https://demoqa.com/checkbox");
 //       		driver.get("https://demoqa.com/radio-button");
//   			driver.get("https://demoqa.com/webtables");
 //        		driver.get("https://demoqa.com/buttons");
//   		    driver.get("https://demoqa.com/links");
//   			driver.get("https://demoqa.com/broken");
//   			driver.get("https://demoqa.com/upload-download");
//   		    driver.get("https://demoqa.com/dynamic-properties");
   						
   			  driver.manage().window().maximize();

  }
        public WebDriver getDriver() {
	      return driver;
	
  }
      
      public void setDriver(WebDriver driver) {
	      this.driver = driver;
    }

      public void implicitlyWait() {
  		getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         }


}











































/* public void tearDown() {
	  	   driver.quit();*/
   
  /* FirefoxDriver driver1 = new FirefoxDriver();
   driver.get("http://google.com");
   
   driver.findElement(By.LinkText("Gmail")).click();
    String currentUrl=driver.getCurrentUrl();
    
    System.out.println(currentURL);
    }
    
    }
    
    */
    		





