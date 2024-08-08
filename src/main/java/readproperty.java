import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readproperty 
{
	
private	Properties prop;
  public Properties intiprop() {
	  try {
		FileInputStream ip=new FileInputStream("./Feb2025/src/main/java/class3/sourcefile");
		 prop=new Properties();
		
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return prop; 
  }
}
