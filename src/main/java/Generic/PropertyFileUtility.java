package Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This class is used to read and write in Property files
 * @author NIKITA
 *
 */
public class PropertyFileUtility implements Framework_constants{
	/**
	 * This method is used to read data from property files
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String Readfromprop(String key ,String Propertyfilepath) throws IOException {
		FileInputStream fis = new FileInputStream(Propertyfilepath);	
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}

}

