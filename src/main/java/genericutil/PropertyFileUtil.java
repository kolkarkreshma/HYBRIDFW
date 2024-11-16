package genericutil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileUtil {
	public String readDataFromPf(String key) throws Throwable {
		FileInputStream   fisp=new FileInputStream("C:\\NareshiT\\Basic_selenium\\HYBRID_FW\\src\\test\\resources\\Commondata.properties");
		Properties p=new Properties();
		p.load(fisp);
		return p.getProperty(key);
		
	}
	
		
	}
	


