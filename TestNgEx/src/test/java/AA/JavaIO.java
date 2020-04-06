package AA;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;
public class JavaIO {

@Test
public void add() throws IOException
{
	File x=new File("‪‪E:\\WorkingWithDB.docx");
	if(!(x.exists()))
	{
		x.createNewFile();
	}
if(x.exists())
{
	
  System.out.println("File exists");
 	
}
 //to print absulute path
 System.out.println(x.getAbsolutePath());
//To delete();

 //x.delete();
	}

}
