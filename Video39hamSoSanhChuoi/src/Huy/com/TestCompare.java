package Huy.com;

public class TestCompare {
	// compareTo - co phan biet chu hoa chu thuong
	// compareToIgnoreCase - khong phan biet chu hoa chu thuong
	
	// tat ca deu cho ra:
	// bang 0 khi s1 = s2
	// lon hon 0 khi s1 > s2
	// nho hon 0 khi s1 < s2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "an";
		String s2 = "AN";
		
		int kq = s1.compareTo(s2); //s1 > s2
		System.out.println("So sanh 2 chuoi co phan biet hoa thuong compareTo(): " + kq + (" > 0 (a = 97, A = 65)"));
		
		int kq2 = s1.compareToIgnoreCase(s2);
		System.out.println("So sanh 2 chuoi co phan biet hoa thuong compareToIgnoreCase(): " + kq2);
	
		
		// co the dung ham equals() va equalsIgnoreCase de so sanh nhung no chi tra ve true false chu ta khong biet duoc nho hon hay lon hon
		if(s1.equals(s2)) { //o day .toLowerCase duoc
			System.out.println("s1 = s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1 = s2");
		}else {
			System.out.println("s1 != s2");
		}
	}
}
