package huy.com.test;

import huy.com.model.HinhChuNhat;
import huy.com.model.HinhHoc;
import huy.com.model.HinhVuong;

public class TestHinhHoc {
	//https://www.howkteam.vn/course/lap-trinh-oop-voi-c/da-hinh-trong-lap-trinh-huong-doi-tuong-1380
	//https://nguyenvanhieu.vn/tinh-da-hinh-trong-java/
	//https://viblo.asia/p/da-hinh-tai-runtime-trong-java-Qbq5QWrwZD8
	//https://viettuts.vn/java/tinh-da-hinh-trong-java
	

	//https://daynhauhoc.com/t/cau-hoi-thac-mac-ve-run-time-compile-time-va-translation-time/5686
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc h1;
		h1 = new HinhChuNhat(4, 5);
		System.out.println("Chu vi = " + h1.tinhChuVi());
		System.out.println("Dien tich = " + h1.tinhDienTich());
		System.out.println("------------------------------------");
		h1 = new HinhVuong(5);
		System.out.println("Chu vi = " + h1.tinhChuVi());
		System.out.println("Dien tich = " + h1.tinhDienTich());
		System.out.println("-----------------------------------");
		
		HinhChuNhat hv1 = new HinhVuong(6);
		System.out.println("Chu vi = " + hv1.tinhChuVi());
		System.out.println("Dien tich = " + hv1.tinhDienTich());
	}

}
