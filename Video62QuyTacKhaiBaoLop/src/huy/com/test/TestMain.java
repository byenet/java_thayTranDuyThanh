package huy.com.test;

import java.util.Scanner;

import huy.com.model.SinhVien;

// giu ctrl an vao doi tuong de truy suat

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien huy = new SinhVien();
		SinhVien huy2 = new SinhVien("huy2", 8);
		
		System.out.println("Ten Sinh vien thu 2 la: " + huy2.getHoTen());
		System.out.println("Diem sinh vien thu 2 = " + huy2.getDiem());
		huy2.setDiem(8.5);
		System.out.println("Diem sinh vien thu 2 = " + huy2.getDiem());
		
		System.out.println("Ten sinh vien thu 1 la: " + huy.getHoTen());
		
		System.out.print("Moi ban nhap ten cho sinh vien 1: ");
		String name = new Scanner(System.in).nextLine();
		huy.setHoTen(name);
		System.out.println("Ho ten sinh vien 1 sau khi dien la: " + huy.getHoTen());
		
		huy.xuatThongTin();
		
		// dung toString ben kia (xuat doi tuong thi toString() se tu dong dc goi)
		System.out.println(huy);
		
	}

}
