package huyabstract.com.test;

import huyabstract.com.model.NhanVienAbstract;
import huyabstract.com.model.NhanVienChinhThucAbstract;
import huyabstract.com.model.NhanVienThoiVuAbstract;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhThucAbstract huy1 = new NhanVienChinhThucAbstract(1, "huy1");
		huy1.tinhLuong();
		NhanVienThoiVuAbstract huy2 = new NhanVienThoiVuAbstract(2, "huy2");
		huy2.tinhLuong();
		
		// su khac biet cua 2 main la: trong lop ke thua kia (package huy.com) ta cung dinh nghia phuong thuc tinhLuong()
		// va lop NhanVienChinhThuc, NhanVienThoiVu ben do khong dinh nghia lai tinhLuong() cung dc, k sao vi class NhanVien k phai abstract class.
		
		// Con doi voi package nay tat ca cac nhan vien bat buoc phai dinh nghia lai tinhLuong() do class cha là abstract
		// nghia la ai cung phai tinhLuong() nhung tinh ra sao thi do class do tu dinh nghia nhung bat buoc phai tinh luong
	
	}

}
