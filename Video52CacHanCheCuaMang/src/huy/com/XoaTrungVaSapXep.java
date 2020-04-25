package huy.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class XoaTrungVaSapXep {
	
	
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
	
	
	//https://gpcoder.com/2810-lop-arrarys-trong-java-arrays-utility-class/
	public static int [] xoaTrung(int [] arr) {
		int [] brr = new int [arr.length];
		int bSize = 0;
		boolean isExist = false;
		for(int i=0; i<arr.length; i++) {
			isExist = false;
			for(int j = 0; j<bSize; j++ ) {
				if(arr[i] == brr[j]) {
					isExist = true;
					break;
				}
			}
			
			if (!isExist) {
				brr[bSize++] = arr[i];
			}
		}
		brr = Arrays.copyOfRange(brr, 0, bSize);
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
		System.out.println("\nMang sau khi xoa trung la: ");
		M = xoaTrung(M);
		xuatMang(M);
		System.out.println("\nMang sau khi xoa trung va sap xep la: ");
		Arrays.sort(M);  //Phuong thuc sort() dung thuat toan QuickSort de sap xep nguyen thuy, dung mergeSort de sap xep object
		xuatMang(M);
		
		// neu luoi viet ham xuat mang:))
//		System.out.println("\n"+Arrays.toString(M));
		
		
	}
}
