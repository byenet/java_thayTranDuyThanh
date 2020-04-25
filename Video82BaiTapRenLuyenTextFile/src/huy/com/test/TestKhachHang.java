package huy.com.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import huy.com.io.TextFileFactory;
import huy.com.model.KhachHang;
import huy.com.util.DateConverter;

public class TestKhachHang {
	
	static ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
	
	public static void menu() {
		System.out.println("1.Nhap");
		System.out.println("2.Xuat");
		System.out.println("3.Luu");
		System.out.println("4.Mo");
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
		dsKH = TextFileFactory.readFile("D:/project/Java_basic/Video82BaiTapRenLuyenTextFile/taptin/dulieukh.txt");
	}

	private static void luu() {
		// TODO Auto-generated method stub
		boolean save = TextFileFactory.saveFile(dsKH, "D:/project/Java_basic/Video82BaiTapRenLuyenTextFile/taptin/dulieukh.txt");
		if(save) {
			System.out.println("Luu thanh cong!");
		}else {
			System.out.println("Luu that bai!");
		}
		
	}

	private static void xuat() {
		// TODO Auto-generated method stub
		for(KhachHang kh:dsKH) {
			System.out.println(kh);
		}
	}

	private static void nhap() {
		// TODO Auto-generated method stub
		System.out.print("Moi ban nhap ma: ");
		int ma = new Scanner(System.in).nextInt();
		System.out.print("Moi ban nhap ten: ");
		String ten = new Scanner(System.in).nextLine();
		System.out.println("Moi ban nhap nam sinh(dd/MM/yyy): ");
		Date ns = DateConverter.fromString(new Scanner(System.in).nextLine());
		
		KhachHang kh = new KhachHang(ma,ten,ns);
		dsKH.add(kh);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			menu();
		}
	}

}
