package huy.com.test;

import java.util.ArrayList;
import java.util.Scanner;

import huy.com.io.SerialzeFileFactory;
import huy.com.model.DanhBa;

public class TestDanhBa {

	static ArrayList<DanhBa> dsDB = new ArrayList<DanhBa>();
	public static void menu() {
		System.out.println("1.Nhap");
		System.out.println("2.Xuat");
		System.out.println("3.Luu");
		System.out.println("4.Doc");
		System.out.println("5.Thoat");
		System.out.print("Moi ban chon: ");
		int n = new Scanner(System.in).nextInt();
		switch (n) {
		case 1:
			nhap();
			break;
		case 2:
			xuat();
			break;
		case 3:
			luu();
			break;
		case 4:
			mo();
			break;
		case 5:
			System.err.println("Bye Bye");
			System.exit(0);
			break;

		default:
			break;
		}
	}
	
	private static void mo() {
		// TODO Auto-generated method stub
		dsDB = SerialzeFileFactory.readFile("D:/project/Java_basic/Video83BaiTapRenLuyenSerializeFile/tapTin/dulieuDB.dat");
	}

	private static void luu() {
		// TODO Auto-generated method stub
		boolean kq = SerialzeFileFactory.saveFile(dsDB, "D:/project/Java_basic/Video83BaiTapRenLuyenSerializeFile/tapTin/dulieuDB.dat");
		if(kq) {
			System.out.println("Luu thanh cong!");
		}else {
			System.out.println("Luu that bai");
		}
	}

	private static void xuat() {
		// TODO Auto-generated method stub
		System.out.println("\nDanh sach Danh Ba:");
		for(DanhBa db : dsDB) {
			System.out.println(db);
		}
	}

	private static void nhap() {
		// TODO Auto-generated method stub
		System.out.print("Nhap ten: ");
		String ten = new Scanner(System.in).nextLine();
		System.out.print("Nhap phone: ");
		String phone = new Scanner(System.in).nextLine();
		DanhBa db = new DanhBa (ten, phone);
		dsDB.add(db);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
			menu();
	}

}
