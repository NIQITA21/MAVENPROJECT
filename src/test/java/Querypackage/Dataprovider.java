package Querypackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
@Test(dataProvider="getvalues")
public void data(String s1,String s2)
{
	System.out.println(s1+" "+s2);
}


@DataProvider
public Object[][] getvalues()
{
	Object[][] arr=new Object[5][2];
	
	
	arr[0][0]="BLR";
	arr[0][1]="JDH";
	
	arr[1][0]="BLR";
	arr[1][1]="GOI";
	
	arr[2][0]="GOI";
	arr[2][1]="BOM";
	
	arr[3][0]="DEL";
	arr[3][1]="BLR";
	
	arr[4][0]="BOM";
	arr[4][1]="BLR";
	 
	return arr; 	
}
}
