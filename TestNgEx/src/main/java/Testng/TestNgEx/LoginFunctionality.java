package Testng.TestNgEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginFunctionality {
	
	@Test(invocationCount = 3)
	public static void login() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 60);
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]/div/div[1]/span[1]/input")).sendKeys("C:\\Users"
				+ "\\Anil Kumar\\Pictures\\202955-beautiful-windows-10-desktop-wallpaper-1920x1080-pc.jpg");
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]/div/div[1]/button[1]/span")).click();
		
		
	}

}
