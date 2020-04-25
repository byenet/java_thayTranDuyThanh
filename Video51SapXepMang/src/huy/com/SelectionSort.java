package huy.com;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu: ");
		int n = sc.nextInt();
		A = new int [n];
		nhapMang(A, n);
		System.out.println("Mang da nhap la: ");
		xuatMang(A, n);
		System.out.println("\nMang sau khi sap xep la: ");
		selectionSort(A, n);
		xuatMang(A, n);
		

	}
	
	public static void nhapMang(int []A, int n) {
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<n; i++) {
			System.out.print("A[ "+i+" ]: ");
			A[i] = scanner.nextInt();
		}
	}
	
	public static void xuatMang(int []A, int n) {
		for(int i=0; i<n; i++) {
			System.out.print("A[ "+i+" ]: "+A[i] +"\t");
		}
	}
	
	// https://viblo.asia/p/truyen-doi-so-trong-java-co-the-ban-chua-biet-4P856gj9KY3
	// https://www.ddth.com/showthread.php/203638-H%C3%A0m-ho%C3%A1n-v%E1%BB%8B-2-s%E1%BB%91-trong-Java
	// https://cachhoc.net/2013/09/06/java-ham-hoan-vi-trong-java-swap-in-java/
	public static void hoanVi(int []A, int a, int b) {
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
	
	public static void selectionSort(int []A, int n) {
		for(int i=0; i<n-1; i++) {
			int minArr = i;
			for (int j=i+1; j<n; j++) {
				if(A[minArr] > A[j]) {
					minArr = j;
				}
			}
			
			if(i != minArr)
				hoanVi(A, minArr, i);
		}
	}
}
