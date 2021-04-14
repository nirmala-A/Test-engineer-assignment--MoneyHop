package NirmalaMurali;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyHop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("https://www.moneyhop.co/send/");  
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//header//button[5]//span[1]")).click();
        driver.findElement(By.xpath("//body/div[@role='presentation']/div[@role='none presentation']/div[@role='dialog']/div/div[1]/div[1]/input[1]")).sendKeys("Test engineer assignment");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("avrnirmala@gmail.com");
        driver.findElement(By.xpath("//div[@role='none presentation']//div[3]//div[1]//input[1]")).sendKeys("8055689636");
        driver.findElement(By.xpath("//div[@role='presentation']//div[4]//div[1]//input[1]")).sendKeys("hyderbad");
        driver.findElement(By.xpath("//div[@role='dialog']//div//div//div//div//input[@type='number']")).sendKeys("1000");
        driver.findElement(By.xpath("//textarea[@id='outlined-multiline-static']")).sendKeys("in to money");
        driver.findElement(By.xpath("//button[1]//span[1]//span[1]")).click();
        
        
        
	}

}
