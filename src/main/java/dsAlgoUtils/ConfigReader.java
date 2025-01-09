package dsAlgoUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {

		//this method is used to load the properties from config.properties file.
		//and it will return property prop object
		private Properties prop;
		public Properties init_prop() {
			prop = new Properties();
			try {
				FileInputStream ip = new FileInputStream("./src/test/resources/dsAlgoProperties/Config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			return prop;
		}
	}

