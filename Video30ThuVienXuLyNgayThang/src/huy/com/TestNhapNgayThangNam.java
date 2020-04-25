package huy.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//https://gpcoder.com/2202-kieu-du-lieu-ngay-gio-date-time-trong-java/
public class TestNhapNgayThangNam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// convert String to date
		
		Calendar cal = Calendar.getInstance();
		int yearNow = cal.get(Calendar.YEAR);
		
		System.out.print("Moi ban nhap nam sinh(dd/MM/yy): ");
		String ns = new Scanner(System.in).nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date birthday = sdf.parse(ns);
			cal.setTime(birthday);
			int yearNS = cal.get(Calendar.YEAR);
			
			int tuoi = yearNow - yearNS;
			System.out.println("Ban " + tuoi + " tuoi");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
