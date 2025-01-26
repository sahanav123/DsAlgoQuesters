package dsAlgoUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ConfigReader {

		//this method is used to load the properties from config.properties file.
		//and it will return property prop object
		
		public static Properties initializeprop() {
			Properties prop = new Properties();
			File profile = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\dsAlgoProperties\\Config.properties");

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
		private static String browserType = null;

		public static void setBrowserType(String browser) {

			browserType = browser;

		}

		public static String getBrowserType() throws Throwable {

			if (browserType != null)

				return browserType;

			else

				throw new RuntimeException("browser not specified in the testng.xml");

		}
	}