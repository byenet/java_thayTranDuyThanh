package huy.com;

import java.util.Arrays;
import java.util.Scanner;

public class TestTimKiem {
	
	public static void nhapMang(int M[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<M.length; i++) {
			System.out.print("M ["+i+"] = ");
			M[i] = sc.nextInt();
		}
	}
	
	public static void xuatMang(int M[]) {
		for (int i: M) {
			System.out.print(i + "\t");
		}
	}
	
	public static void timPhanTu(int M[], int k) {
		boolean flag = false;
		for(int i : M) {
			if(i == k) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Co ton tai "+ k + " trong mang!");
		}else {
			System.out.println("Khong tim thay " + k + " trong mang!");
		}
	}
	
	public static void timSoLanXuatHienPhanTu(int M[], int k) {
		String s = "";
		int dem = 0;
		for(int i=0; i<M.length; i++) {
			if(M[i] == k)
			{
				s+= i+"; ";
				dem++;
			}
		}
		if(s.length() > 0) {
			System.out.println("Tim thay " + k + " xuat hien "+dem+" lan trong mang o vi tri: " + s);
		}else {
			System.out.println("Khong tim thay " + k + " trong mang");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi ban nhap vao so phan tu cua mang: ");
		int n = sc.nextInt();
		int []M = new int[n];
		System.out.println("Moi ban nhap gia tri cho cac phan tu mang: ");
		nhapMang(M);
		System.out.println("Mang sau khi ban nhap la: ");
		xuatMang(M);
		System.out.print("\nMoi ban nhap vao so can tim kiem xem co xuat hien khong: ");
		int k = sc.nextInt();
		timPhanTu(M, k);
		
		System.out.print("Moi ban nhap vao so can tim kiem va kiem tra xem so lan xuat hien: ");
		int k2 = sc .nextInt();
		timSoLanXuatHienPhanTu(M, k2);
		
		// ngoai ra con co the dung phuong thuc binarySearch() (dung binary search) trong lop Arrays;
		System.out.println("Tim kiem bang binarySearch: " + (Arrays.binarySearch(M, k2)));
		
		
	}

}
