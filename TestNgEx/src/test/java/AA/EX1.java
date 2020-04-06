package AA;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EX1 {	
@BeforeClass
public void methode1()
{
	System.out.println("Methode1");
}
@Test
public void methode2()
{
	System.out.println("Methode2");
}
@AfterClass
public void methode3()
{
	System.out.println("Methode3");
}

}
