package huy.com;

public class TestInHoaInThuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "nguyen ho nhat huy";
		
		// in hoa tat ca
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		
		// in hoa moi chu dau tien thoi
		
		// cach khong khoa hoc
		String s3 = s1.replaceFirst("n", "n".toUpperCase());
		System.out.println(s3);
		
		// cach khoa hoc hon
		String s4 = s1.replaceFirst((s1.charAt(0) + ""), (s1.charAt(0) + "").toUpperCase()); //noi nhay doi "" dua ve chuoi
		System.out.println(s4);
		
		
		
		String s5 = "NGUYEN HO NHAT HUY";
		s5 = s5.toLowerCase();
		System.out.println(s5);
	}

}
