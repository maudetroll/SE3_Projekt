import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

	FirefoxDriver driver;
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Before
	public void setup() {
    	System.setProperty("webdriver.gecko.driver", "4444");
        driver= new FirefoxDriver();
	}
	
	@Test
	public void testWebsite() {
    	//System.setProperty("webdriver.gecko.driver","C:\\Users\\drol005\\Desktop\\geckodriver.exe", "4444");
    	//System.setProperty("webdriver.gecko.driver", "4444");
        
        String baseUrl = "http://localhost:8080";
        String expectedTitle = "SmartphoneService";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get("http://localhost:8080");

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
	}
	@Test
	public void testWebsiteInfo() {
    	//System.setProperty("webdriver.gecko.driver","C:\\Users\\drol005\\Desktop\\geckodriver.exe", "4444");
    	//System.setProperty("webdriver.gecko.driver", "4444");
        
        String baseUrl = "http://localhost:8080";


        // launch Fire fox and direct it to the Base URL
        driver.get("http://localhost:8080");
        //driver.findElement("entries", "http://localhost:8080");


       
        //close Fire fox
        driver.close();
	}

}
