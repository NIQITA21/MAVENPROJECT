package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	
	/**
	 * @author NIKITA
	 * This class  is used to read and write data in excel
	 * 
	 * @author NIKITA
	 *
	 */
	
	/**
	 * This class is used to read data from excel
	 * @author NIKITA
	 *
	 */
	public class ReadData_Excel implements Framework_constants{
/**
 * This method is used to read data from excel
 * @param sheet
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
		public String readDataExcel(String sheet,int row, int cell,String excelpath ) throws EncryptedDocumentException, IOException 
		{

			FileInputStream fis = new FileInputStream(excelpath);

			String  value = WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();

			return value;
		}
/**
 * This method is used to get last row of the excel sheet
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
		public int getlastrow() throws EncryptedDocumentException, IOException 
		{
			FileInputStream fis = new FileInputStream("../SDET_19/src/test/resources/SDET_19.xlsx");
			int lastactivrrow=WorkbookFactory.create(fis).getSheet("Sheet2").getLastRowNum();
			return lastactivrrow;
		}
	}
	
	
	
}
