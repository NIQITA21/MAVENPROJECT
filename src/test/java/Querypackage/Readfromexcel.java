package Querypackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Readfromexcel {

	@Test(dataProvider="getvalues")
	public void data(String s1,String s2)
	{
		System.out.println(s1+" "+s2);
	}


	@DataProvider
	public void getvalues() throws EncryptedDocumentException, IOException
	{
		Object[][] arr=new Object[4][2];
		FileInputStream fis=new FileInputStream("Framework.xlsx");
		Workbook wh=WorkbookFactory.create(fis);
		Sheet sh = wh.getSheet("TC1");
		int rowcount=sh.getLastRowNum()-sh.getFirstRowNum();

		for(int i=0;i<rowcount+1;i++)
		{
			Row row = sh.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				arr[i][j]= row.getCell(j).getStringCellValue();
				System.out.println(arr[i][j]);
			}	
			System.out.println();


		}


	}
}



