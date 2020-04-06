package TestNGpkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodeEx 
{
@BeforeMethod
 public void setup()
	{
		System.out.println("A1");
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/hrm/login.php");
		WebDriverWait wait=new WebDriverWait(driver, 60);
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String un = "document.getElementsByName('txtUserName')[0].value='qaplanet1'";
		js.executeScript(un);
	}
@AfterMethod
public void shetdown()
{
	System.out.println("B1");
}
@Test
public void methode1()
{
	System.out.println("methode1");
}
@Test
public void methode2()
{
	System.out.println("methode2");
}










}
