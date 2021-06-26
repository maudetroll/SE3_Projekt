import org.openqa.selenium.firefox.FirefoxDriver;
public class start_firefox {
    public static void main(String[] args) {
    	//System.setProperty("webdriver.gecko.driver","C:\\Users\\drol005\\Desktop\\geckodriver.exe", "4444");
    	System.setProperty("webdriver.gecko.driver", "4444");
        FirefoxDriver driver= new FirefoxDriver();
        
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
}
