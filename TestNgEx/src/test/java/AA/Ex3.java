package AA;

import org.testng.annotations.Test;

public class Ex3 
{

	@Test(priority=1)
	public void ad_method() 
	{
		System.out.println("methodd");
	}
	@Test(priority=3)
	public void ac_method() 
	{
		System.out.println("methodc");
	}
	@Test
	public void ab_method() 
	{
		System.out.println("methodb");
	}
}
