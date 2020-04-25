package huy.com.test;

import java.util.ArrayList;
import java.util.Collections;

import huy.com.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> DSSP = new ArrayList<SanPham>();
		
		DSSP.add(new SanPham(1,"coca",25));
		DSSP.add(new SanPham(2,"pepsi",15));
		DSSP.add(new SanPham(3,"Redbull",35));
		
		System.out.println("Danh Sach san pham: ");
		for(SanPham sp: DSSP) {
			System.out.println(sp);
		}
		
		Collections.sort(DSSP);
		System.out.println("\nDanh Sach san pham sau khi sort: ");
		for(SanPham sp: DSSP) {
			System.out.println(sp);
		}
		
		// co 2 cach de sua lai thu tu sap xep nguoc lai (1 la reverse 2 la dao nguoc dau trong ham compareTo())
		
//		Collections.sort(DSSP);
//		DSSP.stream().map(s -> s+"\n").forEach(System.out::print);
//		System.out.println("-------------------------------------------------------");
//		Collections.reverse(DSSP);
//		DSSP.stream().map(s -> s+"\n").forEach(System.out::print);

	}

}
