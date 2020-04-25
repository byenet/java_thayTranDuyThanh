package huy.com.test;

import java.util.Scanner;

import huy.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		NhanVien nv1,nv2;
		System.out.println("Moi ban nhap thong tin cua nhan vien 1: ");
		System.out.print("Nhap ho: ");
		String ho1 = sc1.nextLine();
		System.out.print("Nhap ten: ");
		String ten1 = sc1.nextLine();
		System.out.print("So san pham: ");
		int soSP1 = sc1.nextInt();
		
		nv1 = new NhanVien(ho1, ten1, soSP1);
		
		System.out.println("\nMoi ban nhap thong tin cua nhan vien 2: ");
		System.out.print("Nhap ho: ");
		String ho2 = sc2.nextLine();
		System.out.print("Nhap ten: ");
		String ten2 = sc2.nextLine();
		System.out.print("So san pham: ");
		int soSP2 = sc2.nextInt();
		
		nv2 = new NhanVien(ho2, ten2, soSP2);
		
		
		System.out.println("\nLuong cua nhan vien 1: " + nv1.getLuong());
		System.out.println("Luong cua nhan vien 2: " + nv2.getLuong());

		if(nv1.lonHon(nv2)) {
			System.out.println("Nhan vien " +nv1.getTen()+" co nhieu so san pham hon cu the la nhieu hon " + (nv1.getSoSP() - nv2.getSoSP()) + " san pham");
		}else{
			System.out.println("Nhan vien " +nv2.getTen()+" co nhieu so san pham hon cu the la nhieu hon " + (nv2.getSoSP() - nv1.getSoSP()) + " san pham");
		}
	}
}
