package huy.com;

public class TestTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Trim Xoa khoang trang du thua 2 ben chuoi
		
		//	Viet ham Xoa khoang trang ben trai chuoi
		//  Viet ham Xoa khoang trang ben phai chuoi
		
		
		String s = "      Nhật Huy      ";
		System.out.println("Luc chua xoa khaong trang: " + s);
		System.out.println("Chieu dai luc chua xoa = " + s.length());
		
		System.out.println();
		String s1= s.trim();
		System.out.println("Luc da xoa khoang trang 2 ben: " + s1);
		System.out.println("Chieu dai luc da xoa: " + s1.length());
		
		System.out.println();
		// xoa ben trai
		//Tim vi tri left khong phai khoang trang
		int vtLeft = 0;
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
					if(c == ' ') {
						vtLeft = i;
					}else {
						break;// Dung ngay khoang trang ta muon lay tu o khong khoang trang nen vtLfet phai + 1 
					}
		}
		
		
		String s2 = s.substring(vtLeft+1);
		System.out.println("Chuoi sau khi xoa khoang trang ben trai: " + s2);
		System.out.println("Chieu dai sau khi xoa khoang trang ben trai: " + s2.length());
		
		
		
		
		System.out.println("");
		// xoa ben Phai (duyet nguoc lai)
		//Tim vi tri right khong phai khoang trang
		int vtRight = 0;
		for(int i=s.length() - 1; i>= 0; i--) {
			char c=s.charAt(i);
					if(c == ' ') {
						vtRight = i;
					}else {
						break;// Dung ngay khoang trang ta muon lay tu o khong khoang trang nen vtRight phai - 1 
					}
		}
		
		
		String s3 = s.substring(0, vtRight);
		System.out.println("Chuoi sau khi xoa khoang trang ben phai: " + s3);
		System.out.println("Chieu dai sau khi xoa khoang trang ben phai: " + s3.length());
	}
	
	
}


