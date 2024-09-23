package datetime;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d=new Date();
System.out.println("Current time is:  "+d);
//in order to get different format
SimpleDateFormat d1=new SimpleDateFormat("HH-mm-ss-dd-MM-yyyy");
System.out.println(d1.format(d));

	}

}
