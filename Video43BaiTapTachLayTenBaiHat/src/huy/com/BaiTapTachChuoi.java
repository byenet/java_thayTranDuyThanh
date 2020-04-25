package huy.com;

public class BaiTapTachChuoi {
	//De:
			/* Cho 1 bai hat co duong dan 
			 * D:/music/bolero/longme.mp3
			 * - Hay lay "longme.mp3"
			 * - Hay lay longme
			 * */
	
	
	public static String tenBaiHatCoMp3(String baiHat) {
		
		int vtCuoi = baiHat.lastIndexOf("/");
		String ten = baiHat.substring(vtCuoi+1);  // vi tri cuoi cua dau / la dau / nen ta lay sau dau / nen +1
		return ten;
	}
	
	public static String tenBaiHatKhongCoMp3(String baiHat) {
		
		int vtCuoi1 = baiHat.lastIndexOf("/");
		int vtCuoi2 = baiHat.lastIndexOf(".");
		String ten = baiHat.substring(vtCuoi1+1, vtCuoi2);
		return ten;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baiHat = "D:/music/bolero/longme.mp3";
		String kq1 = tenBaiHatCoMp3(baiHat);
		System.out.println(kq1);
		
		String kq2 = tenBaiHatKhongCoMp3(baiHat);
		System.out.println(kq2);
	}

}
