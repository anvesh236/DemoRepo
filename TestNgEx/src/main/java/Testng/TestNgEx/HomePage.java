package Testng.TestNgEx;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HomePage {

	@Test
	
	  public static void login() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil Kumar\\Downloads\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 60);
		driver.get("http://apps.qaplanet.in/hrm/login.php");
		Thread.sleep(2000);
		
		String title=driver.getTitle();
		System.out.println(title);
		
	//	boolean b = wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		if(title.equals("OrangeHRM - New Level of HR Management")) 
		{
			System.out.println("verify home page");
		    }
			else 
				 {
			System.out.println("Failed home page");
		
			}
			
		}
		
	}

