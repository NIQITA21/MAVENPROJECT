package Generic;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 * This class is used for JSON READ AND WRITE
 * @author NIKITA
 *
 */
public class JSONFileUtility implements Framework_constants {
	/**
	 * This method is used to read data from JSON file
	 * @param key
	 * @return
	 * @throws IOException
	 * @throws ParseException
	 */
	public String readfrom_json( String key ,String JSONPath) throws IOException, ParseException{
		FileReader inputfile = new FileReader( JSONPath);

		//Parsing the JSON into JAVA 
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(inputfile);

		//type cast the object and just read the data
		HashMap jobj = (HashMap) obj;

		String value = jobj.get(key).toString();

		return value;

	}

}
