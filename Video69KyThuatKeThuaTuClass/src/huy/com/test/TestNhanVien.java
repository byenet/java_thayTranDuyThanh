package huy.com.test;

import huy.com.model.NhanVienChinhThuc;
import huy.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhThuc huy1 = new NhanVienChinhThuc(1, "Huy1");
		NhanVienThoiVu huy2 = new NhanVienThoiVu(2, "huy2");
		
		huy1.tinhLuong();
		huy2.tinhLuong();
		
	}

}
