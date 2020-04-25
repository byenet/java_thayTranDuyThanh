package huy.com.test;

import java.util.ArrayList;

import huy.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SinhVien> DSSV = new ArrayList<SinhVien>();
		DSSV.add(new SinhVien(1, "Huy1", 6));
		DSSV.add(new SinhVien(2, "Huy2", 7));
		DSSV.add(new SinhVien(3, "Huy3", 8));
		DSSV.add(new SinhVien(4, "Huy4", 9));
		DSSV.add(new SinhVien(5, "Huy5", 2));
		
		System.out.println("Danh sach Sinh Vien");
		
		// khong bik sao loi nen phai bat:))
		try {
			for(SinhVien sv: DSSV) {
				System.out.println(sv);
			}
		} catch (NullPointerException err) {
			// TODO: handle exception
			err.printStackTrace();
		}
		
	}
}
