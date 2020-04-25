package huy.com.test;

import huy.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien huy = new SinhVien(1, "Nhat Huy", 7);
		huy.xetTotNghiep();
		huy.xetTotNghiep(4);
		huy.xetTotNghiep(7,1);
	}

}
