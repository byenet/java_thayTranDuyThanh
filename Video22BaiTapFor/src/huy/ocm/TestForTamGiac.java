package huy.ocm;

import java.util.Scanner;

public class TestForTamGiac {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi ban nhap vao chieu cao: ");
		int h = sc.nextInt();
		hinh1(h);
		System.out.println();
		hinh2(h);
	}

	public static void  hinh1(int h) {
		for(int i=0; i<h; i++) {
			for(int j=i; j<h; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void hinh2(int h) {
		for (int i = 0; i<h; i++) {
			for(int j=0;j<h; j++) {
				if(i+j == h-1 || j == h/2 || (i==0 && j>= h/2) || (i==h-1 && j<=h/2)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}


}
