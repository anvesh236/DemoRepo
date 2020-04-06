package AA;

import java.io.File;
import java.io.FileInputStream;
import java.util.Set;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel1 {
    @Test
	public void m1()throws Exception
	{
    	FileInputStream  fis = new FileInputStream("D://xl sheet//Book1.xlsx");

	//lode work book
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	XSSFSheet  s1=wb.getSheetAt(0);
	int rowcount = s1.getLastRowNum();
	for(int i=1; i<=rowcount; i++)
	{
		String UserName = s1.getRow(i).getCell(0).getStringCellValue();
		String Password = s1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Username is "+UserName);
			System.out.println("Password is "+Password);
		
	}
	
	
	
	
			

	}

}
