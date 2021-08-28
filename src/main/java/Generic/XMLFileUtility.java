package Generic;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
/**
 * This class is used to read and write data in xml
 * @author NIKITA
 *
 */
public class XMLFileUtility implements Framework_constants  {
	/**
	 * This method is used to read data from xml
	 * @return
	 * @throws DocumentException
	 */
public String readxml( String XMLPath) throws DocumentException
{
	File inputfile = new File(XMLPath);
	SAXReader reader = new SAXReader();
	Document doc = reader.read(inputfile);
	String value = doc.selectSingleNode("//LoginDetails/name").getText();
	return value;
}
}
