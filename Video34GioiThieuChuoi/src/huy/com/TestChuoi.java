package huy.com;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class TestChuoi {
	// https://viblo.asia/p/java-su-khac-nhau-giua-string-stringbuilder-va-stringbuffer-hieu-ro-va-sau-hon-ve-string-trong-java-Eb85on62l2G
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String();
		String s2 = new String("huy");
		String s21 = new String("huy");
		String s3 = "huy";
		String s4 = "huy";
		
//		s2,s3 cung co gia tri la huy nhung la 2 doi tuong tro tren 2 vung nho khac nhau tren ram
//		nen la 2 doi tuong khac nhau nen s2 khong bang s3;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s21);
		System.out.println(s3);
		
		System.out.println(s2.getClass().getName());
		System.out.println(s3.getClass().getName());
		
		if(s2 == s3) {
			System.out.println("s2 == s3");
		}else {
			System.out.println("s2 != s3");
		}
		
		if(s2 == s21) {
			System.out.println("s2 == s21");
		}else {
			System.out.println("s2 != s21");
		}
		
		if(s3 == s4) {
			System.out.println("s3 == s4");
		}else {
			System.out.println("s3 != s4");
		}
		
		// equals so sanh noi dung 
		if(s2.equals(s3)) {
			System.out.println("noi dung s2 == noi dung s3");
		}else {
			System.out.println("s2 != s3");
		}
		
		if(s2.equals(s21)) {
			System.out.println("noi dung s2 == noi dung s21");
		}else {
			System.out.println("s2 != s21");
		}
		
		System.out.println("---------------------------");
		
		System.out.println("Chieu dai cua s1 = " + s1.length());
		System.out.println("Chieu dai cua s2 = " + s2.length());
		System.out.println("Chieu dai cua s3 = " + s3.length());
		
		
		
		
		
		
		
	}

}
