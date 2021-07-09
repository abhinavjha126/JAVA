package DATE_AND_TIME;
import java.util.Calendar;

import java.util.TimeZone;
import java.time.*;
public class Calendar_Class 
{
public static void main(String[] args)
{
	Calendar c= Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
	System.out.println(c.getCalendarType());
	System.out.println(c.getTime());
	System.out.println(c.getTimeZone());
//	System.out.println(TimeZone.getAvailableIds()[0]);
//	System.out.println(c.get(Calendar.SECOND()));
	
}
}
