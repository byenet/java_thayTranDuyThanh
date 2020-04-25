package huy.com;

public class TestLocChuoi {

	// substring(n) chi 1 tham so thi lay tu vi tri n tro ve het ben hai
	// substring(a,b) lay tu a den b ky tu (so ky tu duoc lay la b-a)
	// luu y tranh lay qua gioi han do dai chuoi (string.length)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Xin chao cac ban! Huy day!";
		String s1 = s.substring(16);
		System.out.println(s1);
		
		String s2 = s.substring(16, 21);
		System.out.println(s2);
	}

}
