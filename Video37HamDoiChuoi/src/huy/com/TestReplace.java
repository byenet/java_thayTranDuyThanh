package huy.com;

public class TestReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// replace doi tat ca cac chuoi cu bang chuoi moi phai co bien hung chu bien cu khong thay doi
		
		String s = "Xin chao ban, dep trai qua ban!";
		String s2 = s.replace("huuu", "Huy");
		String s3 = s.replace("ban", "Huy");
		
		System.out.println("replace Chuoi cu: " + s2);
		System.out.println("replace Chuoi moi: " + s3);
		
		System.out.println();
		//replaceFirst chi doi chuoi dau tien ma no gap
		String sf = "Xin chao ban, dep trai qua ban!";
		String sf2 = sf.replaceFirst("ban", "Huy");
		System.out.println("replace First Chuoi moi: " + sf2);
		
	}

}
