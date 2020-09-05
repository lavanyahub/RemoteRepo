import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AAssignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\RealProject\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.godaddy.com/");
        driver.manage().window().maximize();
       // System.out.println("Web page title is");
        String t1="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
        System.out.println(t1);
       String t2=driver.getTitle();
       String u1="https://in.godaddy.com/";
       System.out.println(t2);
       if(t1.equals(t2))
       {
    	   System.out.println("test passed title validated");
       }
       else 
       {
    	   System.out.println("test failed");
       }
        //System.out.println("URL is");
       String u2=driver.getCurrentUrl();
       if(u1.equals(u2))
       {
    	   System.out.println("Test passed URL Validation");
       }
       else
       {
        System.out.println("Test failed");
       }
       System.out.println(driver.getPageSource()); 
       driver.close();
        

	}

}
