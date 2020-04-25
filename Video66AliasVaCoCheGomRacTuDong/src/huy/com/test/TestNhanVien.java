package huy.com.test;

import huy.com.model.NhanVien;

public class TestNhanVien {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1 = new NhanVien(1, "huy1");
		NhanVien nv2 = new NhanVien(2, "huy2");
		
		nv1 = nv2;
		System.out.println(nv1.getTen());
		
		nv1.setTen("huy1haha");
		System.out.println(nv2.getTen());
		nv2.setTen("huy2haha");
		System.out.println(nv1.getTen());
		
		System.out.println("---------------------------------------");
		NhanVien nv3 = new NhanVien(3, "huy3");
		NhanVien nv4 = new NhanVien(4, "huy4");
		nv3 = nv4.copy();
		System.out.println(nv3.getTen());
		nv4.setTen("Huy4haha");
		System.out.println(nv4.getTen());
		System.out.println(nv3.getTen());
		nv3.setTen("Huy3haha");
		System.out.println(nv3.getTen());
		System.out.println(nv4.getTen());
	}

}
