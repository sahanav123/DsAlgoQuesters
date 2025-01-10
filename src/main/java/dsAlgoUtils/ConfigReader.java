package dsAlgoUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {

		//this method is used to load the properties from config.properties file.
		//and it will return property prop object
		
		public static Properties initializeprop() {
			Properties prop = new Properties();
			File profile = new File("C:\\SahanaNUMPYNINJASDET\\gitsss\\DsAlgoQuesters\\src\\test\\resources\\dsAlgoProperties\\Config.properties");
			try {
				FileInputStream fis = new FileInputStream(profile);
				prop.load(fis);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			return prop;
		}
	}

