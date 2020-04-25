package huy.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThemMotPhanTuVaoMang {

	public static void nhapMangRandom(int M[]) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int i = 0;
		while(i< M.length) {
			M[i++] = random.nextInt(10);
		}
	}
	
	public static void xuatMang(int M[]) {
		for(int i:M) {
			System.out.print(i + "\t");
		}
	}
	
	public static int [] themPhanTu(int []arr, int k, int vt) {
		int [] brr = new int [arr.length + 1];
		brr = Arrays.copyOfRange(arr, 0, arr.length+1);
		for (int i = arr.length -1; i >= vt; i--) {
			brr[i+1] = brr[i];
		}
		brr[vt] = k;
		return brr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi ban nhap so luong phan tu cua mang: ");
		int n = sc.nextInt();
		int M[] = new int[n]; 
		System.out.println("Cac phan tu cua mang duoc phat sinh ngau nhien la: ");
		nhapMangRandom(M);
		xuatMang(M);
		System.out.print("\nMoi ban nhap gia tri can chen: ");
		int k = sc.nextInt();
		System.out.print("Moi ban nhap vi tri can chen: ");
		int vt = sc.nextInt();
		M = themPhanTu(M, k, vt);
		System.out.println("Mang sau khi them la: ");
		xuatMang(M);
		
	}

}
