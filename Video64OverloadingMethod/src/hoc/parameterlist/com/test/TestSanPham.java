package hoc.parameterlist.com.test;

import hoc.parameterlist.com.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham(1, "coca", 25);
		SanPham sp2 = new SanPham(2, "pepsi", 15);
		SanPham sp3 = new SanPham(3, "redbull", 20);
		
		double t = SanPham.tongTien(sp1, sp2, sp3);
		System.out.println(t);
		
		double t2 = SanPham.tongTien(sp2,sp3);
		System.out.println(t2);
		
	}

}
