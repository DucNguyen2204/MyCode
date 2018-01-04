package hw310;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CheckDate {
	public static void main(String[] args){
		SimpleDateFormat newDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date MyDate;
		try {
			MyDate = newDateFormat.parse("2016-09-13");
			newDateFormat.applyPattern("EEEE");
			String finalDay = newDateFormat.format(MyDate);
			System.out.println(finalDay);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
