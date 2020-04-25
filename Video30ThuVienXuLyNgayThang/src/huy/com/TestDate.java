package huy.com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Lay ngay gio hien tai cua he thong
		Calendar cal = Calendar.getInstance();
		
		// Lay tung cai
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		// thang trong calendar di tu 0 -> 11
		int month = cal.get(Calendar.MONTH);
		System.out.println(month+1);
		int day = cal.get(Calendar.DATE);
		System.out.println(day);
		
		// lay toan bo
		Date t = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(t));
		
		// chi tiet
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//chu H hoa la dinh dang 24h, chu h thuong la 12h
		System.out.println(sdf2.format(t));
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf3.format(t));
		// gio co AM PM
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
		System.out.println(sdf4.format(t));
		
	}

}
