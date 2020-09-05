import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class AAsgnmt11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\RealProject\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get(" https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("lava");  //first_name
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kusha");  //last_name
        driver.findElement(By.xpath("//input[@id='sex-1']")).click();   //gender
        driver.findElement(By.xpath("//input[@id='exp-4']")).click();   //years of exp
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("30-06-1984");  //date
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();   //profession
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();  //tool1_chck_box
        driver.findElement(By.xpath("//input[@id='tool-1']")).click();  //tool2_chk_box
        Select s1=new Select(driver.findElement(By.xpath("//select[@id='continents']")));
        s1.selectByIndex(4);
        WebElement w1=driver.findElement(By.xpath("//option[contains(text(),'Browser Commands')]"));
        WebElement w2=driver.findElement(By.xpath("//option[contains(text(),'Switch Commands')]"));
        WebElement w3=driver.findElement(By.xpath("//option[contains(text(),'WebElement Commands')]"));
        Actions a=new Actions(driver);
        a.keyDown(Keys.CONTROL).click(w1).click(w2).click(w3).build().perform();
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//input[@id='photo']")).click();
        driver.findElement(By.xpath("//input[@id='photo']")).click();
        Thread.sleep(1000);
        System.out.println(9);
	}

}
