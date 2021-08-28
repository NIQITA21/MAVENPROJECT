package Generic;

import java.util.Date;
import java.util.Random;

public class Java_utility {
	
	
	/**
	 * This method is used to generate random number
	 * @return
	 */
	public int Ran_data()
	{
		Random r=new Random();
		int ran=r.nextInt(1000);
		return ran;
	}
	
	/**
	 * This method is used to get current day
	 * @return
	 */

	public String currentday()
	{
		Date dateobj = new  Date();
		String currentdate = dateobj.toString();
		String[] arr = currentdate.split(" ");
        String day = arr[0];
        return day;
	}
	
	/**
	 * This method is used to get current month
	 * @return
	 */
	
	public String month()
	{
		Date dateobj = new  Date();
		String currentdate = dateobj.toString();
		String[] arr = currentdate.split(" ");
		String month = arr[1];
		return month;
	}
	
	/**
	 * This method is used to get current date
	 * @return
	 */
	public String date()
	{
		Date dateobj = new  Date();
		String currentdate = dateobj.toString();
		String[] arr = currentdate.split(" ");
		String date = arr[2];
		return date;
	}
	
	/**
	 * This method is used to get current year
	 * @return
	 */
	
	public String Year()
	{
		Date dateobj = new  Date();
		String currentdate = dateobj.toString();
		String[] arr = currentdate.split(" ");
		String year = arr[3];
		return year;
	}
}
